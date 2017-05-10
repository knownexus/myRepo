package bae;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class main {
	
	public static void main(String[] args)
	{
		fileManager fm = new fileManager();
		String fileText = fm.readFile("ExData.txt");
		
		String[] lists = fm.parseText(fileText, "&"); //Get people and animals
		
		String[] people = fm.parseText(lists[0], "%"); //Get people
		
		String[] animals = fm.parseText(lists[1], "%"); //Get Animals
		
		List<Person> peeps = new ArrayList<Person>();
		List<Animal> animu = new ArrayList<Animal>();
		
		//System.out.println(Arrays.toString(people));
		//System.out.println(people.length);
		
		createPeople(fm, people, peeps);
		System.out.println();
		
		createAnimals(fm, animals, animu);
		givePets(peeps, animu);
		System.out.println();
		
		petEarnings(peeps, "Cat");
		petJobs(peeps, "Trainer");
		

	}

	private static void petJobs(List<Person> peeps, String job) {
		int total = 0, count = 0;
		List<Animal> animu = new ArrayList<Animal>();
		
		for (Person person : peeps) 
		{
			if(person.getOccupation().equals(job))
			{
				if(person.getPets() != null)
					animu.add(person.getPets());
			}
		}
		if (animu.isEmpty())
			System.out.println(job + "s on average don't have pets");
		else
		{
			StringBuilder sb = new StringBuilder();
			for (Animal animal : animu) 
			{
				sb.append(animal.getSpecies());
			}
			System.out.println(job + "s own pets such as: " + sb.toString());
			
		}
	}
	
	private static void petEarnings(List<Person> peeps, String pet) {
		int total = 0, count = 0;
		for (Person person : peeps) 
		{
			if(person.getPets() != null && person.getPets().getSpecies().equals(pet))
			{
				total+=person.getSalary();
				count += 1;
			}
		}
		if (count > 0)
			System.out.println("People with cats earn, on average: �" + total/count);
		else
			System.out.println("Noone owns a cat");
	}

	private static void givePets(List<Person> peeps, List<Animal> animu) 
	{
		for (Person person : peeps) 
		{
			int min = 0;
			int max = animu.size();
	
			Random r = new Random();
			
			int i1 = r.nextInt(max - min + 1) + min;
			if(i1 == animu.size())
			{
				person.setPets(null);
			}
			else
			{
				person.setPets(animu.get(i1));
				animu.remove(i1);
			}
			if(person.getPets() != null)
			{
				if(person.getPets().getSpecies().equals("T-Rex"))
					System.out.println( person.getPets().getSpecies() + " ate "+ person.getName());
				else
					System.out.println(person.getName() + "owns a " + person.getPets().getSpecies());
			}
			else
			{
				System.out.println(person.getName() + " has no pet");
			}
		}
	}

	private static void createAnimals(fileManager fm, String[] animals, List<Animal> animu) {
		for (String animal : animals) 
		{
			
			String[] info = fm.parsePerson(animal, ",");
			String[] data = new String[info.length];
			int i = 0;
			for (String string : info) 
			{
				if( string != null)
				{
					data[i++] = string;
				}
			}
		animu.add(new Animal(data[0], data[1]));
			
		}
	}

	private static void createPeople(fileManager fm, String[] people, List<Person> peeps) {
		for (String person : people) 
		{
			String[] info = fm.parsePerson(person, ",");
			String[] temp = fm.parseText(info[3], "£");
			System.out.println(temp.length);
			StringBuilder sb = new StringBuilder();
			sb.append(temp[1]);
			
			int wage = Integer.parseInt(sb.toString());
			peeps.add(new Person(info[0], info[1], info[2], wage));
			System.out.println(info[0] + " earns �" + wage);
		}
	}
}

	
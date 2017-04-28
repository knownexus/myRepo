package bae;

public class Person 
{
	String name, dob, occupation;
	int salary;
	Animal pets;
	public Person(String name, String dob, String occupation, int salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.occupation = occupation;
		this.salary = salary;
	}
	
	public String toString(){
		String out = "\nName: " + getName() + "\nDoB: " + getDob() + "\nOccupation: " + getOccupation() + "\nSalary: £" + getSalary();
		String pet = "";
		
		if(getPets() == null)
		{
			return out + "\nPet: No pets";
		}
		return out + "\nPet: " + getPets();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Animal getPets() {
		return pets;
	}

	public void setPets(Animal pets) {
		this.pets = pets;
	}
}

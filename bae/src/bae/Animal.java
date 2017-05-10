package bae;
//
public class Animal 
{
	String name;
	String species;
	
	public Animal(String name, String species)
	{
		this.name = name;
		this.species = species;
	}
	
	public String toString(){
		return "\nName: " + getName()  + "\nSpecies: " + getSpecies();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}

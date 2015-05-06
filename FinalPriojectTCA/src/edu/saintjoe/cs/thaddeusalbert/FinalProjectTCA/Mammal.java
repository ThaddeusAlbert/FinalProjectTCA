package edu.saintjoe.cs.thaddeusalbert.FinalProjectTCA;

public class Mammal {
	// keep track of mammal traits 
	private String name;
	private int age;
	private int size; // 1 = small, 2 = large, 3 = Huge 
	// constructors
	public Mammal( String mammalName, int mammalAge, int thisMammalSize) {
		name = mammalName;
		age = mammalAge;
		size = thisMammalSize;
	}
	public String toSting() {
		return "MammalSize: " + Mammalsize + "is named" + name + "Age: " + age;
	}
	//Accessors
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
		}
	public String getSize() {
		return size;
	}
	// Mutators 
	Public void setName(string newName) {
		name = newName;
	}
	Public void setAge(int newAge) {
		age =newAge;
	}
	
	}

package edu.saintjoe.cs.thaddeusalbert.FinalProjectTCA;

public class FinalProjectTCADriver {
	public static void main(String[] args){
		FinalProjectTCA MammalOne, MammalTwo, MammalThree;
		MammalOne = new FinalProjectTCA("mouse", 13, 1);
		MammalTwo = new FinalProjectTCA("lamb", 4, 2);
		MammalThree = new FinalProjectTCA("Horse", 15, 3);
	
		System.out.println("Data for mammal one: "+ MammalOne.toString());
		System.out.println("Data for mammal two: "+ MammalTwo.toString());
		System.out.println("Data for mammal three: "+ MammalThree.toString());
		}
}

package edu.saintjoe.cs.thaddeusalbert.FinalProjectTCA;

public class Human extends Mammal{
	public Human(String name, Object size){
		super(name, size)
	}
	public Human(String name, Mammal Size){
		super(name, size.toString());
		size = huge;
	}
	public Object setValue(Object newSize) {
		Object retval = super.setValue(newValue);
		return retval;
		}
	public MammalSize setValue(MammalSize newValue);
	super.setValue(newValue.toString());
	size = huge;
	return oldvalue;
}
public MammalSize getValue(){
	return size;
}
}

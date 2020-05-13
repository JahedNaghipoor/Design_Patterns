package Prototype;

import java.util.Arrays;

public class Person implements Cloneable{

	
	public String[] name; 
	public Address address;
	
	public Person(String[] name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + Arrays.toString(name) + ", address=" + address + "]";
	}
	
	// deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Person(name.clone(), (Address) address.clone());
	}
	
}

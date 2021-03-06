package Prototype;

public class Address implements Cloneable{
	
	public String streetName;
	public int houseNumber;
	
	
	public Address(String streetName, int houseNumber) {
		super();
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}


	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
	}
	
	// deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Address(streetName, houseNumber);
	}
	

}

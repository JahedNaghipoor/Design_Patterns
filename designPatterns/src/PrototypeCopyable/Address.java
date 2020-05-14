package PrototypeCopyable;

public class Address {
	
	public String street, city, country;

	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
	// copy constructor
	public Address (Address other) {
		
	this(other.street, other.city, other.country);
	}
	

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	

}

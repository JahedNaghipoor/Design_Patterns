package PrototypeCloneable;

public class Prototype {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person john = new Person(new String[] { "John", "smith" }, new Address("London Road", 120));
		
		Person jane = (Person) john.clone();
		
		jane.name[0] = "jane";
		jane.name[1]= "Fergosen";
		jane.address.streetName = "London alley";
		jane.address.houseNumber = 124;
		
		System.out.println(john);
		System.out.println(jane);
	}

}

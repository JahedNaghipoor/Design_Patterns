package Builder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

	protected Person person = new Person();

	public SELF withname(String name) {

		person.name = name;
		return (SELF) this;
	}

	public Person build() {
		return person;
	}
	
	protected SELF self() {
		
		return (SELF) this;
	}
}

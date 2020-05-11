package designPatterns;

public class EmployeeBuilder extends PersonBuilder {

	public EmployeeBuilder workAt(String position) {
	
	person.position = position;
	return self();
	}
	
	@Override
	protected EmployeeBuilder self() {
		return this;
	}
}

package PrototypeCopyable;

public class PrototypeCopyable {

	public static void main(String[] args) {
		
		
		Employee john = new Employee("john", new Address("123 road", "london", "UK"));
		
		Employee chris = new Employee(john);
		chris.name = "Chris";
		
		System.out.println(john);
		System.out.println(chris);

	}

}

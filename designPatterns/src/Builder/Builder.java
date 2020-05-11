package Builder;

public class Builder {

	public static void main(String[] args) {

		EmployeeBuilder eb = new EmployeeBuilder();

		Person jahed = eb.workAt("Developer").withname("Jahed").build();

		System.out.println(jahed);
	}

}

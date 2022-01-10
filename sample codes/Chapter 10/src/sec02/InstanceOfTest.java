package sec02;

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m = new Manager();
		Employee e = new Employee();

		System.out.println(m instanceof Manager);
		System.out.println(m instanceof Employee);
		System.out.println(e instanceof Manager);

	}

}

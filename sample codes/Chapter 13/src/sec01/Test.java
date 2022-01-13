package sec01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Red", 220);
		Car car2 = new Car("Red", 220);

		if (car1 == car2)
			System.out.println("car1, car2는 주소 값이 같다");
		if (car1.equals(car2))
			System.out.println("car1, car2는 객체의 내용이 같다");

	}

}
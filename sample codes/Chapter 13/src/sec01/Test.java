package sec01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Red", 220);
		Car car2 = new Car("Red", 220);

		if (car1 == car2)
			System.out.println("car1, car2�� �ּ� ���� ����");
		if (car1.equals(car2))
			System.out.println("car1, car2�� ��ü�� ������ ����");

	}

}
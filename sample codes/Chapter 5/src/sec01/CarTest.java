package sec01;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car ����(�ν��Ͻ�) ����
		Car myCar = new Car();
		
		// �ʱ� �� ����
		myCar.name = "Red";
		myCar.currentGear = 0;
		myCar.currentSpeed = 0;
		
		// �޼��� ȣ��
		myCar.startEngine();
		System.out.println(myCar.getCurrentState());
		
		myCar.changeGear(2);
		System.out.println(myCar.getCurrentState());
		
		myCar.changeGear(3);
		System.out.println(myCar.getCurrentState());
		
		myCar.stopEngine();
		System.out.println(myCar.getCurrentState());

	}

}

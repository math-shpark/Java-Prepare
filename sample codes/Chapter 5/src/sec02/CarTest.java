package sec02;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car ��ü(�ν��Ͻ�) ����
		Taxi myTaxi = new Taxi();
		
		// �ʱ� �� ����
		myTaxi.name = "���� ��� 111";
		myTaxi.currentGear = 2;
		myTaxi.fare = 3400;
		myTaxi.passengerYn = true;
		
		System.out.println(myTaxi.getCurrentState());

	}

}

package sec02;

public class Car {

	String name;
	int currentGear;

	void changeGear(int gear) {
		System.out.println("-> �� " + gear + "������ �����Ѵ�.");
	}

	String getCurrentState() {
		return name + "�� ���� ��� : " + currentGear;
	}

}

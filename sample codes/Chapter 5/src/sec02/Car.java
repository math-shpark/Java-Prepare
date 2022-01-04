package sec02;

public class Car {

	String name;
	int currentGear;

	void changeGear(int gear) {
		System.out.println("-> 기어를 " + gear + "단으로 변경한다.");
	}

	String getCurrentState() {
		return name + "의 현재 기어 : " + currentGear;
	}

}

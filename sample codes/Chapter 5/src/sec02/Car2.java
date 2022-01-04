package sec02;

public class Car2 {

	// ��� ���� ����
	public String name; // ������ ����
	public int currentSpeed; // ������ ����
	public int currentGear; // ������ ����

	// �޼��� ����
	// ������ �޼���
	public void startEngine() {
		System.out.println("-> " + name + "�� �õ��� �Ҵ�.");
		currentSpeed = 1;
	}
	
	// ������ �޼���
	public void changeGear(int gear) {
		System.out.println("-> �� " + gear + "������ �����Ѵ�.");
		currentGear = gear;
	}

	// ������ �޼���
	private int getCurrentSpeed() {
		currentSpeed = currentSpeed + (currentGear * 10);
		return currentSpeed;
	}

	// ������ �޼���
	public void stopEngine() {
		System.out.println("-> " + name + "�� �õ��� ����.");
		currentSpeed = 0;
	}

	// ������ �޼���
	public String getCurrentState() {
		return name + "�� ����ӵ� : " + getCurrentSpeed();
	}

}

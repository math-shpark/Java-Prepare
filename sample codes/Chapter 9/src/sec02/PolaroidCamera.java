package sec02;

class PolaroidCamera extends Camera {
	
	int batteryGage;
	
	public void takePicture() {
		System.out.println(name + "�� " + sheets + "�� ������ ��´�.");
		System.out.println(sheets + "���� ������ ����Ʈ �Ѵ�.");
		System.out.println("���� ���͸� : " + batteryGage + "%");
	}

}

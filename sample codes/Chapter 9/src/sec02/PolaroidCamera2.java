package sec02;

class PolaroidCamera2 extends Camera {

	int batteryGage;

	public void takePicture() {
		super.takePicture();

		System.out.println(sheets + "���� ������ ����Ʈ �Ѵ�.");
		System.out.println("���� ���͸� : " + batteryGage + "%");
	}

}

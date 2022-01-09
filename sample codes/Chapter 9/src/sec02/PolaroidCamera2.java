package sec02;

class PolaroidCamera2 extends Camera {

	int batteryGage;

	public void takePicture() {
		super.takePicture();

		System.out.println(sheets + "장의 사진을 프린트 한다.");
		System.out.println("현재 배터리 : " + batteryGage + "%");
	}

}

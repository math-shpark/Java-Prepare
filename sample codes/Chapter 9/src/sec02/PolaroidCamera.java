package sec02;

class PolaroidCamera extends Camera {
	
	int batteryGage;
	
	public void takePicture() {
		System.out.println(name + "로 " + sheets + "번 사진을 찍는다.");
		System.out.println(sheets + "장의 사진을 프린트 한다.");
		System.out.println("현재 배터리 : " + batteryGage + "%");
	}

}

package sec02;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolaroidCamera camera = new PolaroidCamera();

		camera.name = "X-100";
		camera.sheets = 3;
		camera.batteryGage = 57;
		camera.takePicture();

	}

}

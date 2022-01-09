package sec02;

public class OverridingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolaroidCamera camera = new PolaroidCamera();

		camera.name = "X-100";
		camera.sheets = 3;
		camera.takePicture();

	}

}

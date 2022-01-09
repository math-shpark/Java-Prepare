package sec02;

public class OverridingTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotPrinter printer = new DotPrinter();

		printer.name = "P-101";
		printer.sheets = 2;
		printer.batteryGage = 80;
		printer.printLogic();

	}

}

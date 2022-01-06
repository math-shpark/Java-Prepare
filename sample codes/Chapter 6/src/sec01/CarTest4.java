package sec01;

public class CarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car3 Yellow = new Car3();
		Yellow.name = "Lightning Yellow";
		Yellow.speed = 300;
		Yellow.setSerialNumber(4929);
		System.out.println(Yellow.name + " : " + Yellow.speed);
		System.out.println("Car No : " + Yellow.getSerialNumber(12345));

	}

}

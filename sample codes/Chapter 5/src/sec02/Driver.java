package sec02;

public class Driver {
	
	String name;
	
	void driving() {
		Car2 myCar = new Car2();
		
		myCar.name = "Red";
		myCar.currentGear = 0;
		myCar.currentSpeed = 0;
		
		myCar.startEngine();
		System.out.println(myCar.getCurrentState());
		
		myCar.changeGear(2);
		System.out.println(myCar.getCurrentState());
		
		myCar.changeGear(3);
		System.out.println(myCar.getCurrentState());
		
		myCar.stopEngine();
		System.out.println(myCar.getCurrentState());
	}

}

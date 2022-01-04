package sec01;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car 객제(인스턴스) 생성
		Car myCar = new Car();
		
		// 초기 값 설정
		myCar.name = "Red";
		myCar.currentGear = 0;
		myCar.currentSpeed = 0;
		
		// 메서드 호출
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

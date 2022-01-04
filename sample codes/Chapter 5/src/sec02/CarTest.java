package sec02;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car 객체(인스턴스) 생성
		Taxi myTaxi = new Taxi();
		
		// 초기 값 설정
		myTaxi.name = "서울 운수 111";
		myTaxi.currentGear = 2;
		myTaxi.fare = 3400;
		myTaxi.passengerYn = true;
		
		System.out.println(myTaxi.getCurrentState());

	}

}

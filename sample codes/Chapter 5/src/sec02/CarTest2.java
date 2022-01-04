package sec02;

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car 객체(인스턴스) 생성
		Driver kim = new Driver();
		
		kim.name = "홍길동";
		
		System.out.println(kim.name + "이 운전합니다.");
		kim.driving();

	}

}

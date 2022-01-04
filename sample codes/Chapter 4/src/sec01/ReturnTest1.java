package sec01;

public class ReturnTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() 메서드 시작");
		
		methodA();
		
		System.out.println("main() 메서드 종료");

	}
	
	private static void methodA() {
		System.out.println("methodA() 메서드 시작");
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				return; // i=3인 경우 메인 메서드에서 호출한 라인으로 이동
			}
			
			System.out.println(i);
		}
		
		System.out.println("methodA() 메서드 종료");
	}

}

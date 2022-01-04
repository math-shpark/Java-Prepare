package sec01;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i=1; i <= 100; i++) {
			if((i % 2) == 0) {
				sum = sum + i;
			}
		}  // 1부터 100까지 짝수만 더하는 반복문
		
		System.out.println("1부터 100 사이 짝수의 합 : " + sum);

	}

}

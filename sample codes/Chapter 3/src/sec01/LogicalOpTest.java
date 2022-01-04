package sec01;

public class LogicalOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 9;
		int num2 = 2;
		int num3 = 0;
		
		System.out.println((num1 == num2) && ((num1 / num3) > 0));	// 오른쪽 연산 수행 없이 false 리턴
		System.out.println((num1 == num2) & ((num1 / num3) > 0));	// 오른쪽 연산이 문제가 있어 오류 발생
		System.out.println((num1 == num2) || ((num1 / num3) > 0));	// 오른쪽 연산 수행 없이 true 리턴
		System.out.println((num1 == num2) | ((num1 / num3) > 0));	// 오른쪽 연산에 문제가 있어 오류 발생

	}

}

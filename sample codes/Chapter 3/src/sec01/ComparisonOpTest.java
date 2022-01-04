package sec01;

public class ComparisonOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 9;
		int num2 = 13;
		int num3 = 13;
		
		System.out.println("9>13: " + (num1 > num2));
		System.out.println("9>=13: " + (num1 >= num2));
		System.out.println("9<13: " + (num1 < num2));
		System.out.println("9<=13: " + (num1 <= num2));
		System.out.println("9==13: " + (num1 == num2));
		System.out.println("13==13: " + (num2 == num3));
		System.out.println("9!=13: " + (num1 != num2));

	}

}

package sec01;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b1 = new Boolean("TRUE"); // 대소문자를 구분하지 않고 true라는 매개변수를 모두 true라고 취급
		Boolean b2 = new Boolean("????"); // true 외 문자열은 모두 false

		Integer i1 = new Integer(10); // 정수 클래스
		Integer i2 = new Integer(10);

		Double d = new Double(10.0); // 실수 클래스

		System.out.println("Boolean 객체 : " + b1); // 생성한 각 객체들을 출력하여 값 확인
		System.out.println("Boolean 객체 : " + b2);
		System.out.println("Integer 객체 : " + i1);
		System.out.println("double 객체 : " + d);

		System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int의 최소값 : " + Integer.MIN_VALUE);

		if (i1.equals(i2))
			System.out.println("같다");

		System.out.println("a 문자가 대문자인가 : " + Character.isUpperCase('a'));
		System.out.println("-1의 이진수 : " + Integer.toBinaryString(-1));
		System.out.println("String 3.14를 실수로 변환 : " + Double.parseDouble("3.14"));

	}

}
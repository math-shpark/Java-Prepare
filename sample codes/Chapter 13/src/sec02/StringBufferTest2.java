package sec02;

public class StringBufferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("java");

		System.out.println("Capacity : " + str.capacity());
		System.out.println("Length : " + str.length());

		str.append(" language");

		System.out.println("문자열 결합 후 Capacity : " + str.capacity());
		System.out.println("문자열 결합 후 Length : " + str.length());

		System.out.println(str.toString());

		str.insert(5, "program ");

		System.out.println(str.toString());

	}

}
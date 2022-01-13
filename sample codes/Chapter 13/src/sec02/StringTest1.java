package sec02;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName1 = new String("자바"); // "자바" 문자열 객체 생성
		String companyName2 = companyName1.concat("마트"); // companyName1 문자열 뒤에 "마트" 결합

		System.out.println(companyName1);
		System.out.println(companyName2);

	}

}
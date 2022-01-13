package sec02;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String compName = "Java JDJ"; // String 객체 생성

		System.out.println(compName.concat(" Program")); // compName 문자열에 " Program" 문자열 결합

		System.out.println(compName.toLowerCase()); // 모두 소문자로
		System.out.println(compName.toUpperCase()); // 모두 대문자로

		System.out.println(compName.length()); // 문자열의 길이

		System.out.println(compName.startsWith("Ja")); // "Ja"로 시작하는지 확인
		System.out.println(compName.endsWith("va")); // "va"로 끝나는지 확인

		System.out.println(compName.equals("Java jdj")); // 문자열 내용이 "Java jdj"와 동일한지 확인
		System.out.println(compName.equalsIgnoreCase("java jdj")); // 문자열의 내용이 "java jdj"와 대소문자 상관없이 동일한지

		System.out.println(compName.charAt(0)); // 문자열의 0번 인덱스 문자 확인
		System.out.println(compName.charAt(compName.length() - 1)); // 문자열의 마지막 문자 확인
		System.out.println(compName.indexOf("JDJ")); // "JDJ" 문자열의 인덱스 위치 확인
		System.out.println(compName.lastIndexOf("va")); // 뒤에서부터 검색을 진행하여 "va" 문자열의 인덱스 위치 확인

		System.out.println(compName.substring(0, 7)); // 문자열 0번부터 6번까지 문자열을 잘라냄
		System.out.println(compName.substring(5)); // 5번 인덱스부터 끝까지 잘라냄

		System.out.println(compName.replace('J', 'j'));

	}

}
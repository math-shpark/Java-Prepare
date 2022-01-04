package sec02;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nameList[];
		nameList = new String[3];
		
		nameList[0] = "Java";
		nameList[1] = "SQL";
		nameList[2] = "Servlet";
		
		System.out.println("nameList의 길이는 " + nameList.length);
		
		System.out.println("nameList 배열 요소 출력");
		System.out.print(nameList[0] + "\t");
		System.out.print(nameList[1] + "\t");
		System.out.println(nameList[2]);

	}

}

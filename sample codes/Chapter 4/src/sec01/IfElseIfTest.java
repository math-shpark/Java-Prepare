package sec01;

public class IfElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = Integer.parseInt(args[0]);
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println(month + "���� ���̴�.");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.println(month + "���� �����̴�.");
		} else if(month == 9 || month == 10 || month == 11) {
			System.out.println(month + "���� �����̴�.");
		} else if(month == 12 || month == 1 || month == 2){
			System.out.println(month + "���� �ܿ��̴�.");
		} else {
			System.out.println("1�� 12 ������ ���ڸ� �Է��Ͻÿ�.");
		}

	}

}

package sec01;

public class ReturnTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main() �޼��� ����");
		
		methodA();
		
		System.out.println("main() �޼��� ����");

	}
	
	private static void methodA() {
		System.out.println("methodA() �޼��� ����");
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				return; // i=3�� ��� ���� �޼��忡�� ȣ���� �������� �̵�
			}
			
			System.out.println(i);
		}
		
		System.out.println("methodA() �޼��� ����");
	}

}

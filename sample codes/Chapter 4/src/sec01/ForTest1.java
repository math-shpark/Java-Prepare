package sec01;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i=1; i <= 100; i++) {
			if((i % 2) == 0) {
				sum = sum + i;
			}
		}  // 1���� 100���� ¦���� ���ϴ� �ݺ���
		
		System.out.println("1���� 100 ���� ¦���� �� : " + sum);

	}

}

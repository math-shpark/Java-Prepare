package sec02;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] javaScore = new int[5];
		
		// 1. ����� �Ű������� ���� 5���� �ڹ� ������ �迭�� ����
		javaScore[0] = Integer.parseInt(args[0]);
		javaScore[1] = Integer.parseInt(args[1]);
		javaScore[2] = Integer.parseInt(args[2]);
		javaScore[3] = Integer.parseInt(args[3]);
		javaScore[4] = Integer.parseInt(args[4]);
		
		// 2. �迭�� ����� �ڹ� ���� ���� ���ϱ�
		int sumScore = 0;
		sumScore = javaScore[0] + javaScore[1] + javaScore[2] + javaScore[3] + javaScore[4];
		
		// 3. �ڹ� ������ ��� ���ϱ�
		double avgScore = 0.0;
		avgScore = (double)sumScore/javaScore.length;
		
		
		// ���
		System.out.println("�ڹ� ������ ���� : " + sumScore);
		System.out.println("�ڹ� ������ ��� : " + avgScore);

	}

}

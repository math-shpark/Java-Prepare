package sec01;

/**
 * ���ϸ� : CommentsTest.java �ۼ��� : 2022/01/03 �ۼ��� : �ڼ�ȣ
 */

/*
 * ���� Ŭ������ ������ ���� �� ���� ������ ����ϴ� �ڹ� ���α׷��̴�. "��µ� ������ ������ �����ϴ�."
 * "ó�� �ۼ��� �ڹ� ���α׷��Դϴ�."
 */

public class CommentsTest {

	static String s = "��µ� ������ ������ �����ϴ�. \n";

	// �� ��° �⿡ ������ ����ϴ� �޼��� ����
	static String getMessage() {
		return "ó�� �ۼ��� �ڹ� ���α׷��Դϴ�.";
	}

	public static void main(String args[]) {
		System.out.println(s + getMessage()); // ���� â ���
	}

}

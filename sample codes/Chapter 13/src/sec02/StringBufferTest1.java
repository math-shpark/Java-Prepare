package sec02;

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ȸ��� : ";

		str.concat("�ڹ�����");

		System.out.println(str);

		StringBuffer strbuff = new StringBuffer("ȸ��� : ");

		strbuff.append("�ڹ�����");

		System.out.println(strbuff);

	}

}
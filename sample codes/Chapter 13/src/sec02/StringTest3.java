package sec02;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String compName = "Java JDJ"; // String ��ü ����

		System.out.println(compName.concat(" Program")); // compName ���ڿ��� " Program" ���ڿ� ����

		System.out.println(compName.toLowerCase()); // ��� �ҹ��ڷ�
		System.out.println(compName.toUpperCase()); // ��� �빮�ڷ�

		System.out.println(compName.length()); // ���ڿ��� ����

		System.out.println(compName.startsWith("Ja")); // "Ja"�� �����ϴ��� Ȯ��
		System.out.println(compName.endsWith("va")); // "va"�� �������� Ȯ��

		System.out.println(compName.equals("Java jdj")); // ���ڿ� ������ "Java jdj"�� �������� Ȯ��
		System.out.println(compName.equalsIgnoreCase("java jdj")); // ���ڿ��� ������ "java jdj"�� ��ҹ��� ������� ��������

		System.out.println(compName.charAt(0)); // ���ڿ��� 0�� �ε��� ���� Ȯ��
		System.out.println(compName.charAt(compName.length() - 1)); // ���ڿ��� ������ ���� Ȯ��
		System.out.println(compName.indexOf("JDJ")); // "JDJ" ���ڿ��� �ε��� ��ġ Ȯ��
		System.out.println(compName.lastIndexOf("va")); // �ڿ������� �˻��� �����Ͽ� "va" ���ڿ��� �ε��� ��ġ Ȯ��

		System.out.println(compName.substring(0, 7)); // ���ڿ� 0������ 6������ ���ڿ��� �߶�
		System.out.println(compName.substring(5)); // 5�� �ε������� ������ �߶�

		System.out.println(compName.replace('J', 'j'));

	}

}
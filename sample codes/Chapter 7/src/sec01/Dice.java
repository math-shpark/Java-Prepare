package sec01;

class Dice {
	
	public static int dotCount = 5;
	public static int rollingCount = 0;
	
	public static void playGame() {
		dotCount++;
		rollingCount++; // rollingCount�� �ν��Ͻ� ������ ����Ǿ Ŭ���� ������ ���� �Ұ�
		System.out.println("������ ���� : " + rollingDice()); // rollingDice() �޼��尡 �Ϲ� �޼���� ȣ�� �Ұ�
	}
	
	public static int rollingDice() {
		int generateNum = (int)(Math.random() * 6) + 1;
		return generateNum;
	}

}

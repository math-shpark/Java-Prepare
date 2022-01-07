package sec01;

class Dice {
	
	public static int dotCount = 5;
	public static int rollingCount = 0;
	
	public static void playGame() {
		dotCount++;
		rollingCount++; // rollingCount가 인스턴스 변수로 선언되어서 클래스 변수는 접근 불가
		System.out.println("생성된 숫자 : " + rollingDice()); // rollingDice() 메서드가 일반 메서드라서 호출 불가
	}
	
	public static int rollingDice() {
		int generateNum = (int)(Math.random() * 6) + 1;
		return generateNum;
	}

}

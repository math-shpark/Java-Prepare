package sec02;

public class CallByReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreList = {40, 78, 98};
		
		System.out.println("reference address1 : " + scoreList);
		changeScore(scoreList);

	}
	
	private static void changeScore(int[] scoreList) {
		System.out.println("reference address2 : " + scoreList);
	}

}

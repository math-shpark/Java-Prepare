package sec02;

public class TwoDArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] scoreList = new String[3][];
		
		scoreList[0] = new String[2];
		scoreList[1] = new String[3];
		scoreList[2] = new String[4];
		
		System.out.println("<2���� �迭�� �ε��� ���>");
		
		for(int i=0; i<scoreList.length;i++) {
			for(int j=0; j<scoreList[i].length;j++) {
				scoreList[i][j] = "[" + i + "][" + j + "]���";
				
				System.out.print(scoreList[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}

}

package sec02;

public class TwoDArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] scoreList = new String[3][4];
		
		System.out.println("<2���� �迭�� �ε��� ���>");
		
		for(int i=0;i<scoreList.length;i++) {
			for(int j=0;j<scoreList[i].length;j++) {
				scoreList[i][j] = "[" + i + "][" + j + "]���";
				System.out.print(scoreList[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}

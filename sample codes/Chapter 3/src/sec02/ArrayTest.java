package sec02;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] javaScore = new int[5];
		
		// 1. 명령행 매개변수로 들어온 5개의 자바 점수를 배열에 저장
		javaScore[0] = Integer.parseInt(args[0]);
		javaScore[1] = Integer.parseInt(args[1]);
		javaScore[2] = Integer.parseInt(args[2]);
		javaScore[3] = Integer.parseInt(args[3]);
		javaScore[4] = Integer.parseInt(args[4]);
		
		// 2. 배열에 저장된 자바 점수 총합 구하기
		int sumScore = 0;
		sumScore = javaScore[0] + javaScore[1] + javaScore[2] + javaScore[3] + javaScore[4];
		
		// 3. 자바 점수의 평균 구하기
		double avgScore = 0.0;
		avgScore = (double)sumScore/javaScore.length;
		
		
		// 출력
		System.out.println("자바 점수의 총합 : " + sumScore);
		System.out.println("자바 점수의 평균 : " + avgScore);

	}

}

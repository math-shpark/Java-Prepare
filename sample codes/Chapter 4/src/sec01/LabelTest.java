package sec01;

public class LabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer: for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 2)
					break outer;
				System.out.println("i = " + i + " j = " + j);
			}
		}

	}

}

package sec02;

public class ScopeTest {
	
	boolean win;
	public void setWin(int s) {
		int score = s;
		if(score > 10) {
			win = true;
		}
	}
	
	public void printWinner() {
		if(win == true) {
			System.out.println("�̱��.");
		} else {
			System.out.println("����.");
		}
	}

}

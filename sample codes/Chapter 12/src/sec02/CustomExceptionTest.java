package sec02;

public class CustomExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account kimAccount = new Account("±èÃ¶¼ö", 100);
		kimAccount.withdraw(150);
		
		System.out.println(kimAccount.toString());

	}

}

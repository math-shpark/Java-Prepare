package sec02;

public class AbstractTVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVFactory factory = new TVFactory();
		TV tv = factory.getTV(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}

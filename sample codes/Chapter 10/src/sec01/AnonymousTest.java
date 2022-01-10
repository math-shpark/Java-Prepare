package sec01;

public class AnonymousTest {

	public static void watchTV(TV tv) {

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		watchTV(new TV() {
			public void powerOn() {
				System.out.println("TV ���� �ѱ�");
			}

			public void powerOff() {
				System.out.println("TV ���� ����");
			}

			public void volumeUp() {
				System.out.println("TV �Ҹ� ���̱�");
			}

			public void volumeDown() {
				System.out.println("TV �Ҹ� ���߱�");
			}
		});

	}

}

package sec02;

class Printer {

	String name;
	int sheets;

	public void ready() {
		System.out.println(name + " �����͸� �����Ѵ�.");
	}

	public final void printLogic() {
		ready();

		for (int i = 0; i < 3; i++) {
			System.out.println(name + "�� " + sheets + "�� �� ����Ѵ�.");
		}

		close();
	}

	public void close() {
		System.out.println(name + " �����͸� �����Ѵ�.");
	}

}

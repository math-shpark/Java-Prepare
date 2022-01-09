package sec02;

class Printer {

	String name;
	int sheets;

	public void ready() {
		System.out.println(name + " 프린터를 예열한다.");
	}

	public final void printLogic() {
		ready();

		for (int i = 0; i < 3; i++) {
			System.out.println(name + "로 " + sheets + "장 씩 출력한다.");
		}

		close();
	}

	public void close() {
		System.out.println(name + " 프린터를 종료한다.");
	}

}

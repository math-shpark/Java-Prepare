package sec01;

class Circle2 implements Printable {

	public void draw() {
		System.out.println("�� �׸���");
	}

	public void move(int x, int y) {
		System.out.println("�� �̵� : (" + x + ", " + y + ")");
	}

	public void paint() {
		System.out.println("�� ��ĥ");
	}

	public void print() {
		System.out.println("�� ���");
	}

}

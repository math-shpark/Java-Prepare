package sec01;

class Circle2 implements Printable {

	public void draw() {
		System.out.println("원 그리기");
	}

	public void move(int x, int y) {
		System.out.println("원 이동 : (" + x + ", " + y + ")");
	}

	public void paint() {
		System.out.println("원 색칠");
	}

	public void print() {
		System.out.println("원 출력");
	}

}

package sec01;

class Circle extends Shape {

	int radius;

	Circle(int x, int y, int radius) {
		super(x, y);

		this.radius = radius;
	}

	public void draw() {
		System.out.println(x + ", " + y + " ��ǥ�� �������� " + radius + "�� ���� �׸���.");
	}

}

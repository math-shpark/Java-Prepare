package sec01;

class Circle extends Shape {

	int radius;

	Circle(int x, int y, int radius) {
		super(x, y);

		this.radius = radius;
	}

	public void draw() {
		System.out.println(x + ", " + y + " 좌표에 반지름이 " + radius + "인 원을 그린다.");
	}

}

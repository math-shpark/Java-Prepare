package sec01;

class Circle extends Shape implements Drawable {

	int radius;

	Circle(int x, int y, int radius) {

		super(x, y);
		this.radius = radius;

	}

	public void draw() {
		System.out.println("(" + x + ", " + y + ") radius = " + radius);
	}

	public void move(int x, int y) {
		System.out.println("(" + (this.x + x) + ", " + (this.y + y) + ") radius = " + radius);
	}

}

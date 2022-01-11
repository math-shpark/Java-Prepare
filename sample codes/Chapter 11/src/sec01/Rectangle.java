package sec01;

class Rectangle extends Shape implements Drawable {

	int width;
	int height;

	Rectangle(int x, int y, int width, int height) {

		super(x, y);
		this.width = width;
		this.height = height;

	}

	public void draw() {

		System.out.println("(" + x + ", " + y + ") width = " + width + ", height = " + height);

	}

	public void move(int x, int y) {

		System.out.println("(" + (this.x + x) + ", " + (this.y + y) + ") width = " + width + ", height = " + height);

	}

}

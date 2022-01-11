package sec01;

public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(10, 10, 100);
		c.draw();
		c.move(5, 5);

		Rectangle r = new Rectangle(20, 20, 50, 50);
		r.draw();
		r.move(5, 10);

	}

}

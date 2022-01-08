package sec02;

public class SwapTest {

	public static void swap(int x, int y) {
		int tmp;

		tmp = x;
		x = y;
		y = tmp;
	}

	public static void swap(Pair p) {
		int tmp;

		tmp = p.x;
		p.x = p.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 20;
		Pair p = new Pair(10, 20);

		System.out.println("before: x, y (" + x + ", " + y + ")");
		System.out.println("/tPair(" + p.x + ", " + p.y + ")");

		swap(x, y);
		swap(p);

		System.out.println("after: x, y (" + x + ", " + y + ")");
		System.out.println("/tPair(" + p.x + ", " + p.y + ")");

	}

}

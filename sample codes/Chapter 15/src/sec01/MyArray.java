package sec01;

public class MyArray {

	private Object[] data;
	private int count;

	// maxSize 크기 만큼의 Object 배열 객체를 생성하는 생성자
	public MyArray(int maxSize) {

		if (maxSize < 0) {
			throw new IllegalArgumentException();
		}

		this.data = new Object[maxSize];
		this.count = 0;
	}

	// 매개변수로 받은 객체를 배열 마지막 요소에 저장하는 메서드
	public void add(Object obj) {

		if (count >= data.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		data[count++] = obj;
	}

	// 매개변수로 받은 index 위치의 요소를 배열에서 삭제하는 메서드
	public void remove(int index) {

		if (index >= count) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		for (int i = index; i < count - 1; i++) {
			data[i] = data[i + 1];
		}

		count--;
		data[count] = null;
	}

	// 매개변수로 받은 index 위치의 요소를 리턴하는 메서드
	public Object get(int index) {
		if (index >= count) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return data[index];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("[");

		if (count > 0) {
			str.append(data[0]);
		}

		for (int i = 1; i < count; i++) {
			str.append(", ").append(data[i]);
		}

		str.append("]");

		return str.toString();
	}

}

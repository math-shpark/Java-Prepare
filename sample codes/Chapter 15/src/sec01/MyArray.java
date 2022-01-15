package sec01;

public class MyArray {

	private Object[] data;
	private int count;

	// maxSize ũ�� ��ŭ�� Object �迭 ��ü�� �����ϴ� ������
	public MyArray(int maxSize) {

		if (maxSize < 0) {
			throw new IllegalArgumentException();
		}

		this.data = new Object[maxSize];
		this.count = 0;
	}

	// �Ű������� ���� ��ü�� �迭 ������ ��ҿ� �����ϴ� �޼���
	public void add(Object obj) {

		if (count >= data.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		data[count++] = obj;
	}

	// �Ű������� ���� index ��ġ�� ��Ҹ� �迭���� �����ϴ� �޼���
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

	// �Ű������� ���� index ��ġ�� ��Ҹ� �����ϴ� �޼���
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

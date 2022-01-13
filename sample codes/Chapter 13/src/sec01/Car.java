package sec01;

public class Car {

	String name;
	int speed;

	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public boolean equals(Object obj) {
		Car other = (Car) obj;

		if (name != other.name)
			return false;

		if (speed != other.speed)
			return false;

		return true;
	}

}
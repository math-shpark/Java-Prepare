package sec02;

class Account {

	String name;
	int currentMoney;

	public Account(String name, int currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
	}

	public void withdraw(int money) {
		currentMoney = currentMoney - money;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Account [name=" + name + ", currentMoney=" + currentMoney + "]";
	}
}

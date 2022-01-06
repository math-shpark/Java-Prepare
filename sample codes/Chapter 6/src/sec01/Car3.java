package sec01;

class Car3 {
	
	private int serialNumber;
	protected String name;
	int speed;
	
	public int getSerialNumber(int managerId){
		if (managerId == 12345) {
			return serialNumber;
		}
		return 0;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

}

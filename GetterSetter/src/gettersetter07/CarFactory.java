package gettersetter07;

public class CarFactory {
	int number;
	String car;
	
//	�Ϲ� ������
	CarFactory() {}
	
//	�Ű������� 2���� ������
	CarFactory(int number, String car){
		this.number = number;
		this.car = car;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
}

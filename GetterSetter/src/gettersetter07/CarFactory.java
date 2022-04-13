package gettersetter07;

public class CarFactory {
	int number;
	String car;
	
//	일반 생성자
	CarFactory() {}
	
//	매개변수가 2개인 생성자
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

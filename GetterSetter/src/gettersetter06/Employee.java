package gettersetter06;

public class Employee {
	String number;
	String name;
	int money;
	
//	일반 생성자
	Employee() {}
	
//	매개변수가 3개인 생성자
	Employee(String number, String name, int money){
		this.number = number;
		this.name = name;
		this.money = money;
	}

//	인센티브 계산 메소드
	int cash() {
		return money + 1000000; 
	}
	
//	답
//	public void cash(int sal) {
//		this.money += sal;
//	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

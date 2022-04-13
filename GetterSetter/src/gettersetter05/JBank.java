package gettersetter05;

public class JBank {
	String name;
	int money;
	
//	일반 생성자
	JBank() {}
	
//	매게변수가 2개 있는 생성자
	JBank(String name, int money){
		this.name = name;
		this.money = money;
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

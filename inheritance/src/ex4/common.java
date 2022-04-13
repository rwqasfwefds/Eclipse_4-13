package ex4;

public class common {
	int id;
	String name;
	int grade;
	
	public void draw() {
		System.out.println("여러분은 동성 쇼핑몰 고객입니다.");
	}
	
	public void show(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		System.out.println("ID : " + id + ", " + "이름 : " + name + ", " + "등급 : " + grade);
	}
}

package ex2;

public class Ex6_12 {
	
	public static void main(String[] args) {
//		기본 생성자를 이용해서 객체 생성(이 방법은 별로 안 좋음)
		Car c1 = new Car();
		
//		c1 객체의 초기화 작업
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
//		이 방법이 좋음
//		매개변수가 있는 생성자를 호출? 할려면 new 연산자로 인스턴스를 생성할 때 똑같이 매개변수를 넣어줘야 함
//		매개변수 3개짜리 생성자 호출 : 변수 초기화
		Car c2 = new Car("black", "automatic", 8);
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}

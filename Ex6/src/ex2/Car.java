package ex2;

public class Car {
	String color;
	String gearType;
	int door;
	
//	기본 생성자(이렇게 코딩 짜는건 별로 안 좋음)
	Car(){}
	
//	매개변수가 있는 생성자(오버로딩)(이렇게 코딩 짜는게 좋은 방법)
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

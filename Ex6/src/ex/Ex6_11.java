package ex;

class Data_1{
	int value;
//	개발자가 생성자를 하나도 만들지 않을 경우 : 자바가 자동으로 생성해줌
//	자바 내부적으로 Data_1(){} 이렇게 만들어 줌
}

class Data_2{
	int value;
	
//	밑에 처럼 매개변수가 있는 생성자를 정의했으면 무조건 매개변수가 없는 생성자 하나를 만들어 줘야 함
	Data_2(){}
//	이런식으로
	
//	목적 : 보통 위에 있는 변수들은 생성자에서 초기화를 진행함(인스턴스 변수 초기화 = 초기 값을 정해줌)
//	Data_2(){
//		value = 1;
//	}
//	위에서 바로 변수 = 1; 이렇게 안 하고 이런식으로 생성자에서 인스턴스 변수의 디폴트 값을 정의해줌
	
//	개발자가 정의 : 매개변수 1개짜리 생성자
	Data_2(int x){
		value = x;
	}
}

public class Ex6_11 {
	
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}

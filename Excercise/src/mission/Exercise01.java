package mission;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyType 클래스를 만들고 생성자를 이용해서 초기화 하는 코드로 변경하셈
//		MyType kor1 = new MyType();
//		
//		kor1.a = 100;
//		kor1.b = 200;
//		kor1.c = 300;
//		
//		System.out.println("a = " + kor1.a);
//		System.out.println("b = " + kor1.b);
//		System.out.println("c = " + kor1.c);
		
//		답		
//		매개변수 없는 기본 생성자 MyType() 호출
		MyType kor1 = new MyType();
		
//		매개변수가 있는 생성자 MyType() 호출
		MyType kor2 = new MyType(100, 200, 300);
		
//		매개변수가 없는 기본생성자 출력
		System.out.println("a = " + kor1.a);
		System.out.println("b = " + kor1.b);
		System.out.println("c = " + kor1.c);
		
//		매개변수가 있는 생성자 출력
		System.out.println("a = " + kor2.a);
		System.out.println("b = " + kor2.b);
		System.out.println("c = " + kor2.c);
		
	}

}

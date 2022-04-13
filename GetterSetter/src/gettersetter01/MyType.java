package gettersetter01;

public class MyType {
	int a;
	int b;
	int c;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	//	기본 생성자
	MyType(){
		a = 100;
		b = 200;
		c = 300;
	}
	
//	인스턴스 변수 초기화
	MyType(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
}

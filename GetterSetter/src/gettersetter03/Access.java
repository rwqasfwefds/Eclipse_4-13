package gettersetter03;

public class Access {
	
	public static void main(String[] args) {
		Sample aClass = new Sample();
		
//		setter�� ���� �����ϰ� getter�� ����غ���
//		a = 10, b = 20, c = 30
//		��� : a = 10, b = 20, c = 30
//		�ɹ� ������ �Ű����� ���� ���� : aClass.setA(10);
//		�ɹ� ������ ���� �������� : aClass.getA();
		
		aClass.setA(10);
		aClass.setB(20);
		aClass.setC(30);
		
		System.out.println("a = " + aClass.getA() + ", " + "b = " + aClass.getB() + ", " + "c = " + aClass.getC());
	}
}

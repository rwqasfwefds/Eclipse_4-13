package gettersetter07;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory sonata = new CarFactory(1, "Sonata");
		CarFactory avante = new CarFactory(2, "Avante");
		CarFactory santafe = new CarFactory(3, "Santafe");
		
//		getter�� ���
//		1 �� �ҳ�Ÿ
//		2 �� �ƹݶ�
//		3 �� ��Ÿ��
		System.out.println(sonata.getNumber() + "�� " + sonata.getCar());
		System.out.println(avante.getNumber() + "�� " + avante.getCar());
		System.out.println(santafe.getNumber() + "�� " + santafe.getCar());
	}

}

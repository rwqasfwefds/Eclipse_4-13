package gettersetter07;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory sonata = new CarFactory(1, "Sonata");
		CarFactory avante = new CarFactory(2, "Avante");
		CarFactory santafe = new CarFactory(3, "Santafe");
		
//		getter로 출력
//		1 은 소나타
//		2 는 아반떼
//		3 은 산타페
		System.out.println(sonata.getNumber() + "은 " + sonata.getCar());
		System.out.println(avante.getNumber() + "는 " + avante.getCar());
		System.out.println(santafe.getNumber() + "은 " + santafe.getCar());
	}

}

package gettersetter02;

public class PersonTest {

	public static void main(String[] args) {
//		���� : Person Ŭ���� �ۼ��ϱ�
//		name = "�̼���", height = 175, weight = 75
		Person Kim = new Person("�̼���", 175, 75);
		
		System.out.println("Kim �̸� = " + Kim.getName());
		System.out.println("Kim Ű = " + Kim.getHeight());
		System.out.println("Kim ������ = " + Kim.getWeight());
	}

}

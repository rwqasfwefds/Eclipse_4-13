package ex4;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		VIP, Gold, Silver
//		�Ӽ� : ���� ID
//			  ���� �̸�
//			  ���� ���
		
//		��� : draw() : �������� ���� ���θ� �����Դϴ�.  
//			  show() : ����ID, �����̸�, ������� ���
		
//		���� �������� �����ϰ� ����� ����ϼ���
		
		common common = new common();
		VIP vip = new VIP();
		Gold gold = new Gold();
		Silver silver = new Silver();
		
		common.draw();
		vip.show(1001, "Joo", 1);
		gold.show(1002, "Lee", 2);
		silver.show(1003, "Kim", 3);
	}

}

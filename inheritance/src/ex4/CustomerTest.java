package ex4;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		VIP, Gold, Silver
//		속성 : 고객 ID
//			  고객 이름
//			  고객 등급
		
//		기능 : draw() : 여러분은 동성 쇼핑몰 고객입니다.  
//			  show() : 고객ID, 고객이름, 고객등급 출력
		
//		위의 고객들을 생성하고 기능을 출력하세요
		
		VIP vip = new VIP();
		Gold gold = new Gold();
		Silver silver = new Silver();
		
		vip.draw();
		vip.show(1, "Joo", 1);
		gold.show(2, "Lee", 2);
		silver.show(3, "Kim", 3);
	}

}

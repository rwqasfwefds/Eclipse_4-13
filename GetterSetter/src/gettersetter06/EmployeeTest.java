package gettersetter06;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee hong = new Employee("skcc12345", "홍길동", 2000000);
		Employee lee = new Employee("skcc56789", "이순신", 3000000);
		
//		순신이 월급 떡상
//		메소드 만들기 : 기본 월급 + 인센티브(1000000)
		
//		답안
//		lee.cash(1000000);
		
//		getter 출력
//		홍길동씨 이름과 월급을 출력
//		이순신씨 이름과 월급을 출력
		
		System.out.println(hong.getName() + " 씨의 월급은 " + hong.getMoney());
		System.out.println(lee.getName() + " 씨의 월급은 " + lee.cash());
		
//		답안
//		System.out.println(lee.getName() + " 씨의 월급은 " + lee.getMoney());
		
	}

}

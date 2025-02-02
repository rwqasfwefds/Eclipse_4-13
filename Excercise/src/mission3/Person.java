//package mission3;
//
//public class Person {
//	String name;
//	int height, weight;
//	
////	맴버 변수 초기화
//	Person(String x, int y, int z){
//		name = x;
//		height = y;
//		weight = z;
//	}
//}

// this쓰는 법
package mission3;

public class Person {
	String name;
	int height, weight;
	
//	맴버 변수 초기화
//	보통 매개변수에 x, y, z 이런식으로 안 씀 가독성이 떨어지니깐 이게 이름을 뜻하는지
//	이게 키를 뜻하는지 모름
//	그래서 직관적으로 단어를 적어주는게 좋은데
//	그냥 단어만 name = name하면 뭐가 뭔지 뭐가 어떤 name인지 모르니깐
//	이런식으로 Person이라는 클래스안에 있는 name을 매개변수인 name으로 바꾸겠다라는
//	뜻에서 앞에 this.을 붙여줌
//	추가로 this는 같은 클래스에서만 쓸 수 있음
	Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}

package ex3;

public class ConstructExam_01 {
//	�ν��Ͻ� ����(�Ϲ� ����)
	int age;
	double money;
	
//	�����ڵ�
//	�⺻ ������ : �Ű������� ����
	ConstructExam_01(){
		age = 30;
		money = 6800000.0;
	}
	
//	�Ű����� 1��¥�� ������
	ConstructExam_01(int x){
		age = x;
		money = 6800000.0;
	}
	
//	�Ű����� 1��¥�� ������
	ConstructExam_01(double y){
		age = 30;
		money = y;
	}
	
//	�Ű����� 2��¥�� ������
	ConstructExam_01(int x , double y){
		age = x;
		money = y;
	}
}

package gettersetter04;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaBook = new Book();
		
//		getter�� setter�� �̿��ؼ� �Ʒ��� ����ϼ�
//		title = "Java JDK", author = "Ȳ����", ISBN = 3333
//		��� : å������ Java JDK, Ȳ����, 3333 �Դϴ�.
		
		javaBook.setTitle("Java JDK");
		javaBook.setAuthor("Ȳ����");
		javaBook.setISBN(3333);
		
		System.out.println("å ������ " + javaBook.getTitle() + ", " + javaBook.getAuthor() + ", " + javaBook.getISBN() + " �Դϴ�.");
	}

}

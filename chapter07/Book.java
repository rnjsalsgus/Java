package chapter07;

//책 정보를 가지고 있는 클래스
public class Book {
	private String bookName;
	private int price;
	private String publisher;
	
	public void setBook(String b, int p, String pu) {
		bookName=b;
		price=p;
		publisher=pu;
	}
	public void getBook() {
		System.out.println("책 이름: "+bookName);
		System.out.println("책 가격: "+price+"원");
		System.out.println("출판사: "+publisher+"\n");
	}
	public static void main(String[] args) {
		Book book = new Book();
		book.setBook("내가 틀릴 수도 있습니다.", 19500, "다산초당");
		book.getBook();
		
		Book book1 = new Book();
		book1.setBook("메이즈러너", 14800, "문학수첩");
		book1.getBook();

	}

}

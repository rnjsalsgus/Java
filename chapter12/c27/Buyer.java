package chapter12.c27;

public class Buyer {
	private int bonusPoint=0;
	
	public void buy(Product p) {
		p.who();
	}
	public static void main(String[] args) {
		Buyer buyer=new Buyer();
		buyer.buy(new Tv_());
		buyer.buy(new Computer());
		buyer.buy(new Product());
		
		Tv_ tv_=new Tv_();
		buyer.buy(tv_);
		Computer c=new Computer();
		buyer.buy(c);
	}
	//매개변수의 타입을 하나만 넣었지만 Computer 클래스와 Tv_클래스는
	//Product 클래스에 상속이 되어 있기 때문에 3개의 타입을 받는 것과 같다.
}

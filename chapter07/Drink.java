package chapter07;

//음료 자판기 프로그램
//판매할 음료수의 세부사항
public class Drink {
	private String drinkName;
	private double capacity;
	private int price;
	
	public void setDrink(String n, double c, int p) {
		drinkName=n;
		capacity=c;
		price=p;
	}
	public void getDrink() {
		System.out.println("음료 이름: "+drinkName);
		System.out.println("음료 용량: "+capacity+"mL");
		System.out.println("가격: "+price+"원\n");
	}
	public static void main(String[] args) {
		Drink drink = new Drink();
		drink.setDrink("cock", 500, 1500);
		drink.getDrink();
		
		Drink drink2 = new Drink();
		drink2.setDrink("cider", 350, 1000);
		drink2.getDrink();

	}

}

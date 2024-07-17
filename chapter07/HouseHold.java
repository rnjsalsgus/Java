package chapter07;

public class HouseHold {
	private String use;
	private int price;
	
	public HouseHold(String use, int price) {
		super();
		this.use = use;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "HouseHold [use=" + use + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		HouseHold ho=new HouseHold("점심값",8800);
		HouseHold ho1=new HouseHold("커피값",4000);
		System.out.println(ho.toString());
		System.out.println(ho1.toString());
	}

}

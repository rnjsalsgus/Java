package chapter07;

public class HouseHoldGS {
	private String use;
	private int price;
	
	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HouseHoldGS [use=" + use + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		HouseHoldGS ho=new HouseHoldGS();
		ho.setUse("점심값");
		ho.setPrice(8800);
		HouseHoldGS ho1=new HouseHoldGS();
		ho1.setUse("커피값");
		ho1.setPrice(4000);
		System.out.println(ho.toString());
		System.out.println(ho1.toString());

	}

}

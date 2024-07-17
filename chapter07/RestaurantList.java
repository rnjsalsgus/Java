package chapter07;

public class RestaurantList {
	private String name;
	private String foodType;
	
	public RestaurantList(String name, String foodType) {
		super();
		this.name = name;
		this.foodType = foodType;
	}
	
	@Override
	public String toString() {
		return "RestaurantList [name=" + name + ", foodType=" + foodType + "]";
	}

	public static void main(String[] args) {
		RestaurantList res=new RestaurantList("하이디라오", "중식");
		RestaurantList res1=new RestaurantList("정식당", "퓨전한식");
		System.out.println(res.toString());
		System.out.println(res1.toString());
	}

}

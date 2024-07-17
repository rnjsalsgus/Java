package chapter07;

public class RestaurantListGS {
	private String name;
	private String foodType;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	@Override
	public String toString() {
		return "RestaurantListGS [name=" + name + ", foodType=" + foodType + "]";
	}

	public static void main(String[] args) {
		RestaurantListGS res=new RestaurantListGS();
		res.setName("하이디라오");
		res.setFoodType("중식");
		RestaurantListGS res1=new RestaurantListGS();
		res1.setName("정식당");
		res1.setFoodType("퓨전한식");
		System.out.println(res.toString());
		System.out.println(res1.toString());

	}

}

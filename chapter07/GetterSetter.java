package chapter07;

public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	//getter, setter
	//getter-값을 가져 올 때 
	//setter-값을 대입 할 때 
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public static void main(String[] args) {
		GetterSetter gs=new GetterSetter();
		System.out.println(gs.getName());
		gs.setName("권민현");
		System.out.println(gs.getName());
		gs.setPhoneNumber("전화번호");
		System.out.println(gs.getPhoneNumber());
		//DTO(date transfer object),VO(value object)
		//클래스들은 두가지 방법으로 값을 초기화
		//1. 생성자 사용
		//2. getter,setter 사용
		

	}

}

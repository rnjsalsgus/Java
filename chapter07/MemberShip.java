package chapter07;

public class MemberShip {
	private String name;
	private String number;
	private String address;
	
	public MemberShip(String name, String number, String address) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "MemberShip [name=" + name + ", number=" + number + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		MemberShip mem=new MemberShip("권민현", "01041237894", "부산광역시 해운대구");
		MemberShip mem1=new MemberShip("김민혁","01078945612","경기도 안양시");
		System.out.println(mem.toString());
		System.out.println(mem1.toString());

	}

}

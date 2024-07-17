package chapter07;

public class MemberShipGS {
	private String name;
	private String number;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberShipGS [name=" + name + ", number=" + number + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		MemberShipGS mem=new MemberShipGS();
		mem.setName("권민현");
		mem.setNumber("01012345678");
		mem.setAddress("부산광역시 해운대구");
		MemberShipGS mem1=new MemberShipGS();
		mem1.setName("김민혁");
		mem1.setNumber("01056781234");
		mem1.setAddress("경기도 안양시");
		System.out.println(mem.toString());
		System.out.println(mem1.toString());

	}

}

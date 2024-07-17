package chapter07;

public class ContactInfoGS {
	private String name;
	private String number;
	
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
	
	@Override
	public String toString() {
		return "ContactInfoGS [name=" + name + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		ContactInfoGS con=new ContactInfoGS();
		con.setName("권민현");
		con.setNumber("01012345678");
		ContactInfoGS con1=new ContactInfoGS();
		con1.setName("이지훈");
		con1.setNumber("01075397845");
		System.out.println(con.toString());
		System.out.println(con1.toString());
		

	}

}

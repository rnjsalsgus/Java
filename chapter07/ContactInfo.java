package chapter07;

public class ContactInfo {
	private String pName;
	private String pNumber;
	
	public ContactInfo(String pName, String pNumber) {
		super();
		this.pName = pName;
		this.pNumber = pNumber;
	}
	
	@Override
	public String toString() {
		return "ContactInfo [pName=" + pName + ", pNumber=" + pNumber + "]";
	}

	public static void main(String[] args) {
		ContactInfo con=new ContactInfo("권민현", "01012345678");
		ContactInfo con1=new ContactInfo("이지훈", "01078945612");
		System.out.println(con.toString());
		System.out.println(con1.toString());
	}

}

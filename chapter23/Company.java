package chapter23;

//친구정보에 속하는 회사정보
public class Company {
	private String cName;
	private ContInfo cInfo;
	public Company(String cName, ContInfo cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}
	public String getcName() {
		return cName;
	}
	public ContInfo getcInfo() {
		return cInfo;
	}
}

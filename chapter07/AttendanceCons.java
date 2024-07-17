package chapter07;

public class AttendanceCons {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	
	public AttendanceCons(String studentName, String enterRoomTime, String leavingRoomTime) {
		super();
		this.studentName = studentName;
		this.enterRoomTime = enterRoomTime;
		this.leavingRoomTime = leavingRoomTime;
	}
	
	@Override
	public String toString() {
		return "AttendanceCons [studentName=" + studentName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}

	public static void main(String[] args) {
		//1. 생성자로 인스턴스 값을 초기화 하는 방법
		AttendanceCons ac=new AttendanceCons("권민현", "08:50", "17:50");
		System.out.println(ac.toString());

	}

}

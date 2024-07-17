package chapter07;

public class AttendanceGS {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEnterRoomTime() {
		return enterRoomTime;
	}

	public void setEnterRoomTime(String enterRoomTime) {
		this.enterRoomTime = enterRoomTime;
	}

	public String getLeavingRoomTime() {
		return leavingRoomTime;
	}

	public void setLeavingRoomTime(String leavingRoomTime) {
		this.leavingRoomTime = leavingRoomTime;
	}
	
	@Override
	public String toString() {
		return "AttendanceGS [studentName=" + studentName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}

	public static void main(String[] args) {
		//2. getter, setter 사용해서 인스턴스의 값을 초기화
		AttendanceGS gs=new AttendanceGS();
		gs.setStudentName("권민현");
		gs.setEnterRoomTime("08:56");
		gs.setLeavingRoomTime("16:50");
		
		System.out.println(gs.toString());
		
		
	}

}

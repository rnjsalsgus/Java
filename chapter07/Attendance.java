package chapter07;

//출석 관리 프로그램
//변수 앞에 private, 메소드 앞에서 public
public class Attendance {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public void setAttendance(String s,String e, String l) {
		studentName=s;
		enterRoomTime=e;
		leavingRoomTime=l;
	}
	public void getAttendance() {
		System.out.println("학생 이름: "+studentName);
		System.out.println("입실 시간: "+enterRoomTime);
		System.out.println("퇴실 시간: "+leavingRoomTime+"\n");
	}
	public static void main(String[] args) {
		Attendance attendance = new Attendance();
		attendance.setAttendance("권민현", "9:00", "16:50");
		attendance.getAttendance();
		
		Attendance attendance2 = new Attendance();
		attendance.setAttendance("Kwon", "8:50", "17:00");
		attendance.getAttendance();
	}

}

package chapter07;

public class ScheduleGS {
	private String date;
	private String time;
	private String toDo;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	
	@Override
	public String toString() {
		return "ScheduleGS [date=" + date + ", time=" + time + ", toDo=" + toDo + "]";
	}

	public static void main(String[] args) {
		ScheduleGS sc=new ScheduleGS();
		sc.setDate("3월18일");
		sc.setTime("16시24분");
		sc.setToDo("getter,setter 이용");
		ScheduleGS sc1=new ScheduleGS();
		sc1.setDate("3월22일");
		sc1.setTime("17시00분");
		sc1.setToDo("자유시간");
		System.out.println(sc.toString());
		System.out.println(sc1.toString());

	}

}

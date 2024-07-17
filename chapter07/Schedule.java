package chapter07;

public class Schedule {
	private String date;
	private String time;
	private String toDO;
	
	public Schedule(String date, String time, String toDO) {
		super();
		this.date = date;
		this.time = time;
		this.toDO = toDO;
	}
	
	@Override
	public String toString() {
		return "Schedule [date=" + date + ", time=" + time + ", toDO=" + toDO + "]";
	}

	public static void main(String[] args) {
		Schedule sc=new Schedule("3월18일","16시10분", "생성자생성");
		Schedule sc1=new Schedule("3월22일", "17시", "자유시간");
		System.out.println(sc.toString());
		System.out.println(sc1.toString());		
	}

}

package chapter11;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAvg(){
		float f=(float) (getTotal()/3.0);
		float num=(float) (Math.round(f*10)/10.0);
		return num;
		
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAvg();
	}
	public static void main(String[] args) {
		Student s=new Student("홍길동", 1, 1, 100, 60, 76);
		String str=s.info();
		System.out.println(str);
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAvg());
	}
	
}

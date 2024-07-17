package chapter07;

import java.util.Set;

public class WorkOut {
	private String name;
	private int set;
	private int times;
	private String rest;
	
	public void setWorkOut(String n, int s, int t, String r) {
		name=n;
		set=s;
		times=t;
		rest=r;
	}
	public void getWorkOut() {
		System.out.println("운동이름: "+name);
		System.out.println("세트 수: "+set+"회, "+"횟수: "+times+"회, 총 횟수: "+set*times);
		System.out.println("휴식 시간: "+rest+"분\n");
	}
	public static void main(String[] args) {
		WorkOut workOut = new WorkOut();
		workOut.setWorkOut("스쿼트", 3, 5, "2");
		workOut.getWorkOut();
		
		WorkOut workOut1 = new WorkOut();
		workOut1.setWorkOut("벤치프레스", 5, 10, "3");
		workOut1.getWorkOut();
	}

}

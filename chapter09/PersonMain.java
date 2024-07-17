package chapter09;

public class PersonMain {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("권민현");
		p1.setAge(29);
		System.out.println(p1.toString());
		
		//나이를 음수로 입력
		Person p2=new Person();
		p2.setName("권민현");
		p2.setAge(-29);
		System.out.println(p2.toString());
		//웹 - html5,자바스크립트(프론트엔드)로 데이터 제약 사항 체크
		//자바 - 서버사이드(백엔드)에서 데이터 제약 사항 체크
		//데이터베이스 - 데이터 제약 사항 체크
		
		Person p3=new Person();
		p3.setName("김실수");
//		p3.age=-42;
		System.out.println(p3.toString());
	}
}

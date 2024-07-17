package review.phonebook;

import java.util.List;

public class PhoneBookApp {

	public static void getPersons(PersonController pc) {
		pc.getPersons();
	}
	
	public static void main(String[] args) {
		PersonController pc=new PersonController();
		
		pc.putPerson("권민현","010-...1");
		pc.putPerson("권민","010-...2");
		pc.putPerson("민현","010-...3");
		pc.putPerson("권현","010-...4");
//		pc.getPersons();
		getPersons(pc);
		
		//phonebook라이브러리를 배포 받은 개발자가 출력을 자신의 스타일대로 출력
		//1. 상속
		System.out.println("\n\"상속\"");
		CustomController cc=new CustomController();
		cc.putPerson("권민현","010-...1");
		cc.putPerson("권민","010-...2");
		cc.putPerson("민현","010-...3");
		cc.putPerson("권현","010-...4");
		getPersons(cc);
		
		//2. 인터페이스
		System.out.println("\n\"인터페이스\"");
		PrintPersonImpl ppi=new PrintPersonImpl();
		pc.printPersons(ppi);
		
		//1,2,3의 방식은 스크립트개발자의 시선에서는 복잡하고 번거로울 수 있다.
		//3. 익명클래스
		System.out.println("\n\"익명 클래스\"");
		pc.printPersons(new PrintPerson() {
			
			@Override
			public void printPersons(List<Person> persons) {
				for (Person person : persons) {
					System.out.println("-----------------");
					System.out.print("이름: ");
					System.out.println(person.getName());
					System.out.print("전화번호: ");
					System.out.println(person.getPhone());
					System.out.println("-----------------");
				}
			}
		});
		
		//자바1.8버전 람다식
		//4. 람다(추상메소드가 하나일 때 사용가능)
		System.out.println("\n\"람다식\"");
		pc.printPersons(persons->{
			for (Person person : persons) {
				System.out.println("-----------------");
				System.out.print("이름: ");
				System.out.println(person.getName());
				System.out.print("전화번호: ");
				System.out.println(person.getPhone());
				System.out.println("-----------------");
			}
		});
	}
}

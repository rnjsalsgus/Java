package review.phonebook;

import java.util.List;

//라이브러리배포를 받은 개발자가 작성
public class PrintPersonImpl implements PrintPerson{

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
	
}

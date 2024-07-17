package review.phonebook;

import java.util.ArrayList;
import java.util.List;

//전화번호부에 사람을 추가/출력
public class PersonController {
	//전화번호부
//	ArrayList<Person> pArr=new ArrayList<>();
	List<Person> persons=new ArrayList<>();
	
	//추가
	public void putPerson(String name,String phone) {
		Person person=new Person();
		person.setName(name);
		person.setPhone(phone);
		persons.add(person);
	}
	//전화번호부 전체출력
	//출력 형태를 자유롭게 작성하기 위한 메소드
	public void getPersons() {
		for(Person person:persons) {
			System.out.println(person);
		}
	}
	//전화번호부 전체 출력(인터페이스)
	public void printPersons(PrintPerson pp) {
		pp.printPersons(persons);
	}
}

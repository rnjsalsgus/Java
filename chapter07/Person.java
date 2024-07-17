package chapter07;

public class Person {
	String name;
	String phoneNumber;
	
	public Person(String name, String phoneNumber) {
		//this키워드를 붙여주게 되면 인스턴스 변수를 지칭하게 된다.
		//this. -> 자기자신
		//this.name -> Person.name
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
//	public void setPerson(String name,String pn)
//	{
//		name=name;
//		phoneNumber=pn;
//	}
	//toString 자동완성
	//인스턴스 변수에 어떤 값이 있는지 확인하는 용도
	//source-generate-toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public static void main(String[] args) {
		Person person = new Person("권민현","010-1234-5678");
		System.out.println(person.toString());
	}



}


package chapter12;

//Object클래스 - 모든클래스의 최상위 클래스
//extends Object - 오브젝트클래스를 상속받는 문장이 생략되어있다.
public class Cake {
	private String name;

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}
	
}

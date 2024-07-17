package chapter22;

import java.util.Collections;
import java.util.List;

public class JustSort {
	public void sort(List<?> lst) {
		// ? - 와일드카드(제네릭문법 중 하나)
		// 아무 클래스 타입이나 받을 수 있다.
		Collections.reverse(lst);
	}
}

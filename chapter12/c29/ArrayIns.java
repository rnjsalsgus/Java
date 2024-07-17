package chapter12.c29;

import chapter12.c27.Computer;
import chapter12.c27.Product;
import chapter12.c27.Tv_;

//여러종류의 객체를 배열로 다루기

public class ArrayIns {
	public static void main(String[] args) {
		String str="string";
		String [] strArr= {"s1","s2","s3"};
		ArrayIns[] arrIns=new ArrayIns[3];
		//상속관계에 있는 인스턴스들로 상위 배열 참조변수에 담을 수 있다. 
		Product[] pArr=new Product[3];
		//Product를 상속하고 있는 computer,tv
		pArr[0]=new Product();
		pArr[1]=new Tv_();
		pArr[2]=new Computer();
	}
}

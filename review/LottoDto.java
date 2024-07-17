package review;

import java.util.ArrayList;

//로또 번호 한세트
public class LottoDto {
//	private int nums[]=new int[6];
	//자바의 기본 배열은 길이가 고정이고 기본기능이 부족하여 '컬렉션'을 쓴다
	private ArrayList<Integer> lottoNums=new ArrayList<>();
	//제네릭

	public ArrayList<Integer> getLottoNums() {
		return lottoNums;
	}
	
	public void setLottoNums(ArrayList<Integer> lottoNums) {
		this.lottoNums = lottoNums;
	}
	
	
}

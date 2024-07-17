package chapter12.example;

//고객, 물건을 사는 사람
public class Buyer{
	//소유금액
	private int money=1000;
	private int bonusPoint;
	//구입한 제품을 저장하기 위한 배열
	Product[] cart=new Product[100];
	//product배열에 사용될 카운터
	private int cnt=0;
	
	//상품을 사는 메소드
	public void buy(Product p) {
		//가진 돈보다 상품 가격이 크면 살 수 없다.
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		//가진 돈에서 구입한 제품의 가격을 뺀다
		money-=p.getPrice();
		//제품의 보너스 포인트를 추가한다.
		bonusPoint+=p.getBonusPoint();
		//제품을 cart배열에 저장한다. 
		cart[cnt++]=p;
		System.out.println(p.toString()+"을/를 구입했습니다.");
	}
	//구매한 물품에 대한 정보를 요약해서 보여줌
	public void summary() {
		//구입한 물품의 합계
		int sum=0;
		//제품의 물품목록
		String itemList="";
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		//물건을 구입하지 않음
		if(cnt==0) {
			System.out.println("구매한 물품이 없습니다.");
		}
		else{
			for(int i=0;i<cnt;i++) {
				sum+=cart[i].getPrice();
				itemList+=cart[i].toString()+",";
			}
			System.out.println("구입한 물품의 총 금액은 "+sum+"만원입니다.");
			System.out.println("구입한 제품은 "+itemList+"입니다");
		}
	}
}

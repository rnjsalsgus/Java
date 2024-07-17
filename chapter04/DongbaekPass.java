package chapter04;

public class DongbaekPass {

	public static void main(String[] args) {
		int pay=91000;
		
		if(pay<=45000) {
			System.out.println("환급 대상이 아닙니다.");
		}
		else if(pay>45000&&pay<=90000) {
			System.out.println("환급대상입니다."+(pay-45000)+"원 환급");
		}
		else if(pay>90000){
			System.out.println("최대 환급 금액을 초과하여 45000원을 환급해드립니다.");
		}
		
		//풀이 
		int payMoney=146000;
		
		if(payMoney<45000) {
			System.out.println("환급받을 금액이 없습니다.");
		}
		else if(payMoney<90000) {
//			System.out.println("환급 금액: "+(45000-payMoney));
			int payBack=payMoney-45000;
			System.out.println("환급 금액: "+payBack+"원");
		}
		else {
			System.out.println("환급 금액: 45000원");
			
		}
	}

}

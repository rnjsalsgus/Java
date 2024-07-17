package chapter07;

public class ClassQuiz {
	//연락처 관리 
	private String pName;
	private String phoneNumber;
	
	public void setContactInfo(String pn,String phoneN) {
		pName=pn;
		phoneNumber=phoneN;
	}
	public void getContactInfo() {
		System.out.println("이름: "+pName);
		System.out.println("전화번호: "+phoneNumber+"\n");
	}
	
	//맛집 리스트
	private String rName;
	private String foodType;
	
	public void setRestaurant(String rn, String ft) {
		rName=rn;
		foodType=ft;
	}
	public void getRestaurant() {
		System.out.println("가게 이름: "+rName);
		System.out.println("음식 종류: "+foodType+"\n");
	}
	
	//일정 관리
	private String date;
	private String times;
	private String toDo;
	
	public void setSchedule(String d, String t, String to) {
		date=d;
		times=t;
		toDo=to;
	}
	public void getSchedule() {
		System.out.println("날짜: "+date);
		System.out.println("시간: "+times);
		System.out.println("할 일: "+toDo+"\n");
	}
	
	//가계부
	
	private String use;
	private int price;
	
	public void setHouseHold(String u, int p) {
		use=u;
		price=p;
	}
	public void getHouseHold() {
		System.out.println("사용처: "+use);
		System.out.println("사용금액: "+price+"\n");
	}
	
	//회원 관리
	
	private String mName;
	private String mNumber;
	private String mAddress;
	
	public void setMembership(String mn, String mNum, String ma) {
		mName=mn;
		mNumber=mNum;
		mAddress=ma;
	}
	
	public void getMembership() {
		System.out.println("회원 이름: "+mName);
		System.out.println("회원 전화번호: "+mNumber);
		System.out.println("회원 주소: "+mAddress+"\n");
	}
	
	public static void main(String[] args) {
		ClassQuiz phoneNumber = new ClassQuiz();
		System.out.println("연락처 관리");
		phoneNumber.setContactInfo("권민현","010-1234-6789"); 
		phoneNumber.getContactInfo();
		
		ClassQuiz phoneNumber1 = new ClassQuiz();
		phoneNumber1.setContactInfo("이지훈","010-6789-1234"); 
		phoneNumber1.getContactInfo();
		
		ClassQuiz restaurantList = new ClassQuiz();
		System.out.println("맛집 리스트");
		restaurantList.setRestaurant("하이디라오", "중식");
		restaurantList.getRestaurant();
		
		ClassQuiz restaurantList1 = new ClassQuiz();
		restaurantList1.setRestaurant("정식당", "퓨전한식");
		restaurantList1.getRestaurant();
		
		ClassQuiz dateSchedule = new ClassQuiz();
		System.out.println("일정관리");
		dateSchedule.setSchedule("3월18일", "12:04", "클래스 만들기");
		dateSchedule.getSchedule();
		
		ClassQuiz dateSchedule1 = new ClassQuiz();
		dateSchedule1.setSchedule("3월22일", "17:00", "자유시간");
		dateSchedule1.getSchedule();
		
		ClassQuiz houseHold = new ClassQuiz();
		System.out.println("가계부 관리");
		houseHold.setHouseHold("점심밥 값", 8800);
		houseHold.getHouseHold();
		
		ClassQuiz houseHold1 = new ClassQuiz();
		houseHold1.setHouseHold("커피값", 4500);
		houseHold1.getHouseHold();

		
		
		ClassQuiz membership = new ClassQuiz();
		System.out.println("회원관리");
		membership.setMembership("권민현", "010-1234-6789", "부산광역시 해운대구");
		membership.getMembership();
		
		ClassQuiz membership1 = new ClassQuiz();
		membership1.setMembership("김민혁", "010-5678-1239", "경기도 안양시");
		membership1.getMembership();
	}

}

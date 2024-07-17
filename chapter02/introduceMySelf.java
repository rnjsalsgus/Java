package chapter02;

public class introduceMySelf {

	public static void main(String[] args) {
		//자기소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력하세요
		//목적 : 변수를 선언하고 사용

		//자기소개
		String name="권민현";
		int age=29;
		String region="부산";
		int term=15;
		String favorite1="게임";
		String favorite2="잠";
		String favorite3="밤";
		String favorite4="음식";
		String favorite5="유튜브 보기";
		
		String gameName="로스트아크";
		String otherGameName="리그오브레전드";
		double level=1600.83;
		int wakeUpTime=7;
		int sleepingTime=12;
		String favoriteFood1="초밥";
		String favoriteFood2="치킨";
		double watchingTime=2.5;
		String algorism1=favorite1;
		String algorism2="천문학";
		
		System.out.print("저의 이름은 "+name+"이고 ");
		System.out.println("나이는 "+age+"세 입니다.");
		System.out.println("사는 지역은 "+region+"입니다.");
		System.out.println(region+"에 산 기간은 "+term+"년 정도입니다.");
		
		System.out.println("좋아하는 것으로는 "+favorite1+", "+favorite2+", "+favorite3+", "+favorite4+", "+favorite5+" 입니다.");
		System.out.println("주로하는 게임은 "+gameName+"이고 "+ "레벨은 "+level+"입니다.");
		System.out.println("또 다른 게임으로는 "+otherGameName+"을 즐겨합니다.");
		
		System.out.print("저는 "+favorite2+"를 많이 자는 편인데 최근에는 학원으로 인해 ");
		System.out.println(sleepingTime+"시에 자고 "+wakeUpTime+"시에 일어나고 있습니다.");
		System.out.println(favorite3+"을 좋아하는 이유 중 하나도 "+favorite2+"이기도 합니다.");
		
		System.out.print("또 저는 "+favorite4+"를 좋아하는데 가장 좋아하는 "+favorite4+"는 ");
		System.out.println(favoriteFood1+"과 "+favoriteFood2+"입니다.");
		
		System.out.print("집에 있는 동안엔 누워서 "+favorite5+"를 하며 ");
		System.out.println("시청 시간은 평균적으로 "+watchingTime+"시간 정도 입니다.");
		System.out.println("주로 올라오는 알고리즘은 "+algorism1+"과 "+algorism2+"관련 영상입니다.");
		
	}

}

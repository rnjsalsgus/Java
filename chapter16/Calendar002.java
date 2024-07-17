package chapter16;

import java.sql.Date;
import java.util.Calendar;

public class Calendar002 {

	public static void main(String[] args) {
		//특정날짜 설정하기
		//2019년 4월29일로 날짜를 설정한다.
		Calendar date=Calendar.getInstance();
		Calendar date1=Calendar.getInstance();
		
		//month의 경우 0부터 시작하기 때문에 4월인 경우, 3으로 지정해야한다.
//		date.set(2019,3,29);
		date.set(2019,Calendar.APRIL,29);
		
		String[] DAY_OF_WEEK= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		
		System.out.println("date는 "+toString(date)+DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]);
		
		//두 날짜간의 차이를 얻으려면, getTimeMillis() 천분의 일초 단위로 변환해야 한다.
		long difference=(date1.getTimeInMillis()-date.getTimeInMillis())/1000;
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH+1)+"월"+date.get(Calendar.DATE)+"일";
	}
}

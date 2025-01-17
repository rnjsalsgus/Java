package chapter14;


//예외 처리
//프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고
//정상 실행을 유지할 수 있도록 예외 처리를 해야한다.
//실행 예외는 컴파일러가 체크해주지 않기 때문에 개발자의 경험을 바탕으로 예외 처리 코드를 작성해야한다.

/*
 *	try{
 *
 *	}catch(예외클래스 e){ 
 *		예외처리
 *	}finally{
 *		항상실행;
 *	}
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//예외가 발생될 수 있는 가능성이 많은 코드는
//try-catch블록으로 강제적으로 감싸게 되어 있다. 
public class TryCatchFinallyExample {
	//파일 읽어오는 코드
	public static void main(String[] args) {
		File file=new File("test.txt");
		try {
			FileReader fileReader=new FileReader(file);		
		}catch(FileNotFoundException e) {
			
		}

	}
}

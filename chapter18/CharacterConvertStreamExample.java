package chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		//문자 변환 보조 스트림
		
//		try {
//			FileOutputStream fos=new FileOutputStream("text1.txt");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//try catch with resources문법		
		try (FileOutputStream fos=new FileOutputStream("text1.txt")){
			//파일로 문자를 저장하고 저장된 문자를 다시 읽기 위해서
			//문자 변환 보조 스트림(Writer,Reader)을 조합한다.
			Writer writer=new OutputStreamWriter(fos);
			writer.write("Hello world!");
			writer.flush();
//			writer.close();
			System.out.println("문자를 파일로 출력 완료!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("text1.txt")){
			Reader reader=new InputStreamReader(fis);
			char[] buffer=new char[100];
			int readCharNum=reader.read(buffer);
			//char배열에서 읽은 수만큼 문자열로 변환
			String data=new String(buffer,0,readCharNum);
			System.out.println(data);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

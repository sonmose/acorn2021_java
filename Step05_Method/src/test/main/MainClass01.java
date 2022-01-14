package test.main;

import java.io.File;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//1. MyObject 객체를 생성해서 참조값을 m1 이라는 지역 변수에 담아 보세요.
		MyObject m1=new MyObject();
		//2. m1 안에 들어 있는 참조값을 이용해서 3 개의 메소드를 모두 호출해 보세요.
		m1.walk();
		m1.getNumber();
		m1.getGreeting();
		//3. m1 안에 들어 있는 참조값을 이용해서 getNumber() 메소드를 다시 호출하고
		// 리턴되는 값을 a 라는 이름의 지역 변수에 담아 보세요.
		int a=m1.getNumber();
		//4. m1 안에 들어 있는 참조값을 이용해서 getGreegint() 메소드를 다시 호출하고
	    //리턴되는 값을 b 라는 이름의 지역 변수에 담아 보세요.
		String b=m1.getGreeting();
		
		/*
		 * java 에서 file를 삭제 하고 싶다.
		 * 파일 삭제를 하는 메소드를 가지고 있는 클래스는 뭐지?
		 * java.io.File 클래스
		 * 1.import
		 * 2.객체 생성 (참조값 얻어내기)
		 * 3.메소드 생성
	
		File f1=new File("C:\\acorn202112\\test01");
		boolean isSuccess=f1.delete();
		if(isSuccess) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		*/
		
		/*
		 * f1.mkdir();
		 * f1.delete();
		 * test01 가 존재하면 삭제하고, 존재하지 않으면 만드는 프로그래밍을 해보세요.
		 */
		File f1=new File("C:\\acorn202112\\test01");
		boolean isExists=f1.exists();
		if(isExists) {
			f1.delete();
		}else {
			f1.mkdir();
		}
	}
}

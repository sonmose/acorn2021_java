package test.main;

import java.util.Random;
public class MainClass06 {

	public static void main(String[] args) {
		Random ran=new Random();
		//1~45사이의 랜덤한 정수를 하나 얻어내서 콘솔창에 출력하는 프로그래밍을 해보세요.
		for(int i=0; i<100; i++) {
		int num=ran.nextInt(45)+1;
		System.out.println(num);
		}
		
	}

}

package test.main;

import java.util.Random;
public class MainClass06 {

	public static void main(String[] args) {
		Random ran=new Random();
		//1~45사이의 랜덤한 정수를 하나 얻어내서 콘솔창에 출력하는 프로그래밍을 해보세요.
		int num=ran.nextInt(45);
		System.out.println(num);
		
	}

}

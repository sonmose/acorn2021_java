package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass13 {

	public static void main(String[] args) {
		//다양성확인
		SmartPhone p1=new SmartPhone();
		
		HandPhone p2=new SmartPhone();
		
		Phone p3=new SmartPhone();
		
		Object p4=new SmartPhone();
		//type casting(형변환)
		SmartPhone p5 = (SmartPhone)p4;
		//p4는 object type이라 p5를 담을수없지만 프로그래머 책임으로 casting을 통해 p5를 담을수있다.
		p1 =(SmartPhone)p2;
		Object p6=p4;
		
	}
}

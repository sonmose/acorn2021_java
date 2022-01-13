/*
* 1.PhoneFactory 라는 클래스를 정의 하기
*2.접근지정자는 public
*리턴 type은 phone 
*static여부는 non static 
*메소드명은 getPhone
*메소드에 전달할 값은 없는 메소드를 PhoneFactoy 클래스에 만들어 보세여
*/
package test.mypac;

public class PhoneFactory {
	public Phone getPhone() {
		return new Phone();
		//Phone p1=new Phone();
		//return p1;
	}
}

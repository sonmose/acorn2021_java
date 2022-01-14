package test.main;
import test.mypac.Friend;
/*
 * 친구 한명의 정보를 객체를 생성해서 담으려고 하낟.
 * 친구정보는 총 4개의 정보로 이루어져 있습니다.
 * 번호,이름,전화,성별
 * 클래스명,필드명은 여러분이 마음대로 정하고
 * Dto 작성 규약에 맞게 클래스를 작성
 * (test.mypac 페키지에 클래스를  만드세요)
 * 그런다음 main 메소드 안에서
 */

public class MainClass07 {
private void main(String[]args){
	/*
	 * 친구 세명의 정보를 담을수 있는 배열 객체를 생성하고
	 * 그 배열 객체에 친구 세명의 정보를 담아 보세요
	 */
    Friend f1= new Friend();
    f1.setnumber(1);
    f1.setname("장승혁");
    f1.setphone("010-1111-1111");
    f1.setgender("M");
    
    Friend f2=new Friend(2,"조태희","010-2222-2222","M");
    Friend f3=new Friend(3,"김덕훈","010-3333-3333","M");
    
    //Friend[]friends= {f1,f2,f3};
    
    Friend[]friends=new Friend[3];
    friends[0]=f1;
    friends[1]=f2;
    friends[2]=f3;
    
    for(int i=0; i<friends.length;i++) {
    	Friend tmp=friends[i];
    	 
        System.out.println(tmp.getnumber()+"|"+tmp.getname()+"|"
              +tmp.getphone()+"|"+tmp.getgender());

    }
}
}

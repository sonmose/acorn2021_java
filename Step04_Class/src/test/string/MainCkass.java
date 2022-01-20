package test.string;

public class MainCkass {

	public static void main(String[] args) {
		String name1="손모세";
		String name2="손모세";
		String name3=new String("손모세");
		String name4=new String("손모세");
		
		System.out.println(name1);
		System.out.println(name3);
		//String type 의 참조값 비교
		boolean result1 = name1 == name2;//true
		boolean result2 = name1 == name3;//false
		//String type의 문자열 내용 비교 
		boolean result3 = name1.equals(name2);//true
		boolean result4 = name1.equals(name3);//true
		boolean result5 = name3.equals(name4);//true
	}
}

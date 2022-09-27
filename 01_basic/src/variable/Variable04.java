package variable;

import java.util.Random;


public class Variable04 {

	public static void main(String[] args) {
		int a = 10; // 정수형 변수 - local variable (지역변수)
		System.out.println("지역변수 a = " + a);
		Random r = new Random();// 객체 class형 변수 
		System.out.println("객체 r =" + r);
		System.out.println(r.nextDouble());// 이거는 계속 써먹을 수 있음  / Random class의 nextDouble 메소드
		// !비교! System.out.println(new Random().nextDouble() );// 일회용 위는 r애  주소값 저장 되어잇는상태인데 이거는 주소값이 저장되어 있지 않기에......
		System.out.println(r.nextInt());//음수도 나옴
		System.out.println(r.nextInt(100));//0~99 음수 안나옴
		System.out.println(r.nextInt((90-65+1)+65));//65~90
		System.out.println(r.nextInt((26)+65));

		System.out.println();
		
		String b = new String("사과");
		String c = "딸기"; // 문자열 literal 생성 - only String 만 가능 /// 문자열은 상수가 아님 (주소를 가지고 있기에 ) literal 임!!!
		
	
		System.out.println(b+"\t"+c);

	}

}

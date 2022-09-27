package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);//상수는 모두 대문자로 되어있음 static이면 class 뒤에 바로 써줘야....ex )Integer.MAX_VALUE(o) /MAX_VALUE만 쓰면 어느 class인지 몰라서 에러 
		System.out.println(Long.MAX_VALUE);// 상수는 데이터 /  대문자.---- 대문자(클래스)의 ------
		
		//---------------------------------------------------------------------------------------------------
		//boolean은 true or false 만 가능 메모리는 1bit만 실사용 하지만 메모린 무조건 1byte 부터 용량 잡음 !! 즉 1byte를 
		boolean a;
		a = false; //대입문 오른쪽에 있는 값은 왼쪽의 방안에 넣으세요...
// false = 0 / true = 1 
		System.out.println("a="+a);
		
		char b = 'A' ;// char은 문자만 문자는 2byte   유니코드  음수값 없음...( 0000 0000 01000 0001 실제 표현은 0000000001000001 ) 
		System.out.println("b="+b);
		
		char c = 65; //char 0~65535 ASII코드 범위 내에서는 그 ASCII코드 범위내는 우리눈으로 볼 수있는데 그 범위 넘어서 문자가 있지만 볼 수 가 없음
		System.out.println("c="+c);
		
		char d = 65535;
		System.out.println("d="+d);
		
		//char f = 65536; 0~65535값을 넘어 버려서 에러뜸...이러면 int형으로 넘어가야함 
		//System.out.println("f="+f);
		
		
		//byte e = 127;
		//byte e = 128  이러면 쇼트형으로 인식.... 범위를 넘어가기에 에러 뜨면서 (cannot convert from int to byte)
		
	
		int e = 65; 
		System.out.println("e="+e);
		
		int f = 'A' ; // ' ' 문자를  int가 붙었기에 이진수로 표현.....
		System.out.println("f="+f);
		
		long g = 65L;// 65+L(l)은 long형 상수 
		System.out.println("g="+g);
		
		//float h = 43.8; // 43.8은 doubl형 상수 (아무것도 뒤에 안붙으면 무조건 실수는 double기본임...근데 float이 double보다 범위가 작음) 에러 값 Type mismatch: cannot convert from double to float
		float h = 43.8f; // 43.8f는 float형 상수 (born to be float
		float h2 =(float)43.8; //강제변환 (CAST 연산)( born to be double ->  float형)
		System.out.println("h="+h);
		System.out.println("h2="+h2);
		

	}

}

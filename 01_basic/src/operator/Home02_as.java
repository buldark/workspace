package operator;

public class Home02_as {

	public static void main(String[] args) {
		char ch = 'e';

	/*	ch에 들어있는 값이 대문자 ? (A~Z ASCII : 65~90 a~z ASCII 97~122)
	 	ch>= 65 && ch <=90; XXXX
	 	
	 char result = ch >= 'A' && ch <='Z' ? ch +32 :ch -32 ;//에러뜸 char끼리 계산 하면 int 형이 됨
	 
	 
	 * */
		int result = ch >= 'A' && ch <='Z' ? ch +32 :ch -32 ;
		System.out.println(ch + "->"+(char)result);
		
		
		
		
	}

}

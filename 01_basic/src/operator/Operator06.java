package operator;

public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+ a);//a= false
		System.out.println("!a ="+!a);//!a =true
		System.out.println();

		String b ="apple"; //literal 생성
		String c = new String("apple");
		System.out.println("b==c"+(b==c ? "같다" : "다르다"));// 참조값이  주소값이 서로 다르다
		System.out.println("b!=c"+(b!=c ? "참" : "거짓"));
		System.out.println(b);
		System.out.println(c);
		System.out.println("b.equals(c) : " +(b.equals(c)? "같다" : "다르다")); // 문자열을 문는것은 .equals / 
		System.out.println("!b.equals(c) : " +(!b.equals(c)? "참" : "거짓"));
		
	}

}

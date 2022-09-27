package basic;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("안녕하세요\n");// \n (newline) or println
		System.out.print("반갑습니다");//
		System.out.println("HelloWorld"); //자바스크립트 파이썬은 ; 없어도 되지만 자바와 씨언어는 필수 
		//--------------------------------------------------------------------------------
		System.out.println("사과\t딸기\t바나나");
		System.out.println("abcdefg\t딸기\t바나나");
		//---------------------------------------------------------------------
		System.out.println(25+36); // 61 : 숫자
		System.out.println("25"+"36");//2536 : '+'결합의 의미로 쓰임... 문자열끼리는 계산을 못하고 결합된것에 불과
		System.out.println("25+36");//25+36 : 문자열은 게산 X
		System.out.println("25+36="+25+36); // 25+36=2536
		System.out.println("25+36="+(25+36)); // 괄호로 최우선 연산....처리 위 아래가 다름...... 덧셈은 괄호 곱셈 나눗셈은 덧셈보다 먼저라서 괄호 안쳐도 되는 경우 있음
		
		


	

		
	}

}

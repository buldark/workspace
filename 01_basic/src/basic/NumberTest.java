package basic;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println(2+3); //5
	
		System.out.println('2'+'3'); //101 문자 '2' = 50(ASCII) '3' 문자 -> 51 50+51 = 101
		System.out.println('2'-48+'3'-48); //문자를 숫자로 변환 답 5
		System.out.println();// 한 줄 떨어짐

		System.out.println("2"+"3"); //23 문자열"2"는 ASCII코드 없음......
		System.out.println(Integer.parseInt("2")+Integer.parseInt("3")); //문자열을 숫자로 변환시키고 싶다 =>-48을 해도 안먹히고 에러가 뜸/Integer 클래스 사용 Integer.parseInt() 사용
		System.out.println(Integer.parseInt("110",2)); //6
		
		System.out.println('a'+3);//100
		System.out.println("a"+3);//a3
		System.out.println(0xa+3);//13 0xa -> 16진법으로 표현한 10
		System.out.println(Integer.parseInt("1101",2)); //13
		
	}

}

package operator;
import java.util.Scanner;
public class Operator03 {
	public static void main(String[] args) {
		
		
		System.out.print("정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int score1= scan.nextInt();
		String result = score1%2==0? score1+"는 짝수" : score1+"는 홀수";
		//stem.out.println(score1%2==0? score1+"는 짝수" : score1+"는 홀수" );
		System.out.println(result);
		String result2=score1%2==0&&score1%3==0? score1+ " 2와3의 공배수이다" : " 2와3의 공배수가아니다" ;
		System.out.println(result2);
		//stem.out.println(score1%2==0&&score1%3==0? score1+ " 2와3의 공배수이다" : " 2와3의 공배수가아니다" );
		System.out.println("---------------------------------------");
		System.out.print("정수를 입력하시오 : ");
		
		int score2= scan.nextInt();
		System.out.println(score2%2==0? score2+"는 짝수" : score2+"는 홀수" );
		System.out.println(score2%2==0&&score2%3==0? score2+ "는 2와3의 공배수이다" : score2+"는 2와3의 공배수가아니다" );
		
		
		String result3 = score2%2==0 && score2%3==0 ? "공배수이다" :"공배수가 아니다"	;
	
		System.out.println(score2 + "는" + result3);
	}

}



/*
 [문제]
 정수를 입력하여 짝수 ? 홀수 2와 3의 공배수이냐??
 
 [실행결과]
 정수를 입력하시오 :12
 12는 짝수 -> n%2 == 0
 12는 2와 3의 공배수이다 -> n%2 == 0 && n%3 ==0
  ---------------------------------
 정수를 입력하시오 :15
 15는 홀수 n%2=! 0
 15는 2와 3의 공배수가 아니다.
 */




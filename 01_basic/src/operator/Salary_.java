package operator;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		System.out.print("직급 입력 : ");
		String position = scan.next();
		
		System.out.print("기본급 : ");
		int in = scan.nextInt();
		
		System.out.print("수당 : ");
		int bo = scan.nextInt();
		
		int total = in + bo;
		double tax = total>=5000000 ? 0.03 : total>=3000000   ? 0.02 : 0.01;

	
		double net = total - total*tax;
		
		System.out.println("월급 : " +net);
		System.out.println("***" +name +" "+ position+" "+"월급 ***");
		System.out.println("합계 : "+total);
		System.out.println("월급 : "+net );
		
	}

}
/*
[문제]월급계산 프로그램
이름 , 직급 , 기본급 , 수당을 입력하여 합계 ,세율,세금,월급을 출력하시오
단 합계가 5,000,000원이 이상이면 세금 3%
  		3,000,000원이 이상이면 세금 2%
  		그 이외는 1%
합계 = 기본급 + 수당
세금 = 합계*세율
월급 = 합계 - 세금 


[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 : 4900000
수당입력 : 200000

*** 홍길동 부장 월급 ***

기본급 :  4,900,000원
수당 : 200,000
합계 : 5,100,000원
세금 :
월급
*/
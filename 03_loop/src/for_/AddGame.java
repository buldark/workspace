package for_;// while-또풀래 for -5문제 +if/  다중 for문 
import java.util.Scanner;
public class AddGame {

	public static void main(String[] args) {
		
		
		int count = 0; 
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		
				int a , b ,sum ;
				String yn;
				
				for(int i =0; i<5 ;i++) {	
					a =(int)(Math.random()*89+11);
					b =(int)(Math.random()*89+11);
					for(int j =1; j==2;j++)
					System.out.println(a + "+" +b+ " = "  );
					int u_a = scan.nextInt();
			
			
				 	{for(; ;) {
				 		if(u_a==a+b) {
				 			System.out.println("맞았다");
				 			count++;continue;}
				 			else  
					}			
				}
			}
				{ System.out.println("또 하시겠습니까? Y : N ");
	 			String yn = scan.next();
	 			if(yn.equals("Y")|yn.equals("y"))continue;
	 			else if(yn.equals("N")|yn.equals("n")){ System.out.println("틀렸다");break;
		}
		
		System.out.println("프로그램을 종료하겠습니다");				
	
	
			}}}}

/*

 [문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : 

프로그램을 종료합니다.


*/
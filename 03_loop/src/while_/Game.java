package while_;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Random r= new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int com = 	r.nextInt(100)+1; //or com= (int)(Math.random()*100+1);
			System.out.println(com);
			int count = 0 ;
			System.out.println("1~100");
			
			
			while(true) {
				System.out.println("숫자를 입력하시오");
				int user = scan.nextInt();
				count++;
				if(com>user) {System.out.println(user +" 보다 큰 수 입니다.");
				/*break : 이거 쓰면 안됨  답이 아니니깐  반복 해야 하니 */;}
				else if(com < user) {System.out.println(user +" 보다 작은 수  입니다.");
				/*break : 이거 쓰면 안됨 */;}
				else break;//여기서는 나가야함 답이 나왔으니깐 반복 노노 }		
				
			
			}//while : 두번째 while 
			System.out.println();
			System.out.println("딩동댕 " + count+"번 만에 맞추었습니다");
			
			System.out.println("\n 또 하시겠습니까? (Y/N) : "); // Y면 반복 N이면 break 해줘야 
			//'Y' ->ASCII int yn =  scan.nextInt()  : 정수형으로 왜냐면 scan은 문자 형은 못쓴다....
			//"Y"  -> String yn = scan.next();
			String yn=scan.next();
			
			if (yn.equals("N")/*==*이건 노놉 */  || yn.equals("n")/*사용자가 소문자 n이더라도 나가게 그냥 n키만 누르면... */) break; //- 첫번쨰 while문 범위만 벗어남  break 소속된 while을 한번 밖에 못벗어남 
			
		}//while : 첫번쩨 while 
		System.out.println("프로그램 종료합니다"); // break로 ㅈwhile문 벗어난 다음에 출력 됨 결국 n이 입력 되어야지 출력 
	}
		
}
				
/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다.
 * 
 * */


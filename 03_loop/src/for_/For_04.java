package for_;
import java.util.Random;
public class For_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0;
		char capital =(char) (Math.random()*26+65); //int a = (int)(Math.random()*26+65) => syso에서 char형변환 시켜야 함 
		for ( int i =1 ; i<=100 ; i++) {
			System.out.print(capital =(char) (Math.random()*26+65));
			if(i%10 ==0) System.out.println();//i가 10의 배수 -> 10으로 나누면 나머지가 0 10개마다 줄을 바꿔라) 
			
			if((char)capital == 'A' ) ++a; // a++ 둘다 같다? /앞에 붙이든 뒤에 붙이든 같다.  a 를 for 구문 위에서 먼저 초기화 해주기(선언 해주기!) 오 단거 단거 ....
		}
			
		System.out.println("A의 개수는 " + a); // 출력은 for 구문 밖에서 나와야지 개수를 셀 수 있다.
		
		
		//Random class 사용 
		Random r = new Random();
		char ch = (char)(r.nextInt());
		for ( int i =1 ; i<=100 ; i++) {
		System.out.print(ch = (char)(r.nextInt(26)+65));
		if(i%10 == 0) System.out.println();
		if((char)ch == 'A') ++a; }
		
		System.out.println("A의 개수는 " + a);
			}
		
	
	
		
		

	}


//대문자 (A~z)를 100개 발생하여 출력하시오.

//[실행결과]
//1 2 3 4
//A F R G
/*대문자(A~Z)를 100개 발생하여 출력하시오
- 1줄에 10개씩 출력
- 100개중에서 A가 몇개 나왔는지 개수를 출력

[실행결과]
H  D  D  R  A  Y  A  K  T  H
C  X  F  Z  B  S  L  Y  Q  D
H  K  O  H  O  B  Z  N  J  T
U  P  A  P  K  Q  G  W  F  A
S  U  D  Z  I  V  J  U  O  G
L  M  Z  L  H  U  Y  D  Q  R
F  T  I  Z  A  W  E  O  F  Z
A  Y  C  I  U  Z  O  B  C  G
H  G  Y  Z  V  P  I  R  L  G
Y  H  R  R  M  H  Y  S  B  P

A의 개수 = 6*/
package for_;

import java.util.Scanner;

import java.util.Scanner;
public class For_08_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int a = scan.nextInt();
			if(a==0) break; 
			if(a<0) continue;// 음수일 경우 끝내는게 아니라 다시 계산 해야 하니깐 
			
			//약수 소수 계산 부분 
			int count = 0;
			for(int i = 1 ; i<=a;i++) {
				if(a%i==0) {System.out.print(" "+i);
				count++;}
				}//for
			
			/*for(int i=2 ;i<=a;i++) {
				if(a==2) { System.out.println();
				System.out.println(a+"은 소수이다")	;
				} else if(a%i==0){System.out.println();
				System.out.println(a+"은 소수가 아니다");break;}
				else {System.out.println();
				System.out.println(a+"은 소수이다");break;}*/
				
			System.out.println();
			
			if(count==2) 
				System.out.println("소수");
			else System.out.println("소수 not");
				}//while
		System.out.println("프로그램을 종료합니다.");
		}
	}
		

	
/*
 * 
 * 
 * 
 * 
 * 
 * * 문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기
 * -0이 입력되면 종료된다
 * -음수가 입력되면 숫자를 다시 입력한다.

[실행결과]
숫자 입력 : 12
1  2  3  4  6  12
12는 소수가 아니다

숫자 입력 : 37
1  37
37는 소수이다

숫자입력 
프로그램을 종료합니다.

=======================================================

package for_;

import java.util.Scanner;

import javax.naming.StringRefAddr;
import javax.naming.spi.DirStateFactory.Result;

public class For08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				System.out.print(i+" ");
				}
		}
		System.out.println();
		if (count==2) System.out.println(num + "는 소수이다");
		else System.out.println(num + "는 소수가 아니다");
	}

}

  
 */

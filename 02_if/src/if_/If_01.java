package if_;
import java.util.Scanner;
public class If_01 {

	public static void main(String[] args) {
	/*	Scanner scan= new Scanner(System.in);
		System.out.println("데이터 입렵 : " );
		int a = scan.nextInt();
		if(a >=50) System.out.println(a + "는 50보다 크거나 같다");
		System.out.println(a + "는 50보다 작다");
		System.out.println();
		*/
		
		if(true)
			if(true) System.out.println("A");
			else  System.out.println("B");
		System.out.println("C");
		System.out.println();
		//결과 a-c
		if(true)
			if(false) System.out.println("A");
			else  System.out.println("B");
		System.out.println("C");
		System.out.println();
		//결과 b-c
		
		if(false)
			if(false) System.out.println("A");
			else  System.out.println("B");
		System.out.println("C");
		System.out.println();
		//c

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a>= 'A'&& a<='Z'); //65~90
		System.out.println((char)a+"는 대문자");
		 if(a>= 'a'&& a<='z');
		System.out.println((char)a+"는 소문자"); //97~122
		
				System.out.println((char)a+"는 숫자이거나 특수 문자");

	}

}

package for_;
import java.util.Scanner;
public class For_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("x의 값은 : ");
		int x = scan.nextInt();
		System.out.println("y의 값은 : ");
		int y = scan .nextInt();
		int mul = 1; 
		for ( int i =0 ; i<=y ; i++) {
			mul *=x;
		
		}
		System.out.println(x + " 의"+y+" 승 ="+mul);
	}

}
/*[강사] [오후 5:04] For05.java
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx (2*2*2*2*2)
---------------------------
x : 3
y : 4
3의 4승 xx (3*3*3*3)*/
package for_;
import java.util.Scanner;
public class For_06_h {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x : ");
		int x = scan.nextInt();
		System.out.println("y : ");
		
		int y = scan.nextInt();
		int mul = 1;
		for(int i = 1 ; i<=y; i++) {  /*만약 int i = 0 이면 y+1번 반복이 되어버림*/
			mul *=x;// (x=2 y=4) 1회 i=1 y=4 i<y   1*x -> 	i+1 2회 (1*x)*x -> i=y 돌떄 까지 
		}
		System.out.println(x+" 의" +y +" 승은" +mul);
	}

}

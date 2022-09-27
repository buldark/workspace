package if_;
import java.util.Scanner;
public class If_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a");
		int a  = scan.nextInt();
		System.out.println("b");
		int b = scan.nextInt();
		System.out.println("c");
		int c= scan.nextInt();
		
		
		if( a<=b&&a<=c) {//a가 가장 적은 경우
			if(b<=c) System.out.println( a +"," + b +"," + c);
			else System.out.println(a+"," +c+"," +b);}
	
		else if (b<=c) { //b가 가장 작은 경우
			if(a<=c)System.out.println(b+"," +a+"," +c);
			else System.out.println(b+"," +c+"," +a);
	
		}else {//c가 가장 작은 경우
			if(a<=b) System.out.println(c +"," + a + "," +b);
			else System.out.println(c+"," +b+ "," +a);
		}

}
}


//순서대로찍어서.....


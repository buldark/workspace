package operator;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("영문자 중 하나를 입력하시오 : ");
		String a1 = s.next();
		char a1_c = a1.charAt(0);
		//System.out.println(a1_c);
		System.out.print(a1_c >= 65 && a1_c<=90 ? a1_c+"->"+(char)((int)a1_c+32):a1_c+"->"+(char)((int)a1_c-32));
		
		
		
		//char c1 = 60;
		//System.out.println(c1);
	}

}

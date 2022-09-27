package switch_;
import java.util.Scanner;
public class Switch02 {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = scan.nextInt();
		System.out.println("b의 값 : ");
		int b = scan.nextInt();
		System.out.println("연산자를(+-*/) 입력 :");
		String calc = scan.next();
		int result   ;
		
		
		//switch (calc) {
		//case "+" : result = (a+b);break;
		//case "-" : result =  (a-b);break;
		//case "*" : result = (a*b);break;
		//case "/" :(result) = a/b;break;
		//default : String = "error"; break;
		
		
		switch (calc) {
		case "+" :System.out.println(a + "+" + b +"="+ (a+b));break;
		case "-" : System.out.println(a + "-" + b +"="+ (a-b));break;
		case "*" : System.out.println(a + "*" + b +"="+ (a*b));break;
		case "/" : System.out.println(a + "/" + b +"="+(double)(a/b));break;
		default : System.out.println("연산자 error");  break;
		
	
		
			
		}
		//System.out.println(result);
		
	}

}

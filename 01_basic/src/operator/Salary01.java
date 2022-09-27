package operator;
import java.util.Scanner;
public class Salary01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("이름을 입력하시오 : "  );
		String name = scan.next();
		
		
		System.out.println("직급을 입력하시오 : " );
		String position = scan.next();
		
		
		System.out.println("본봉을 입력하시오 : " );
		int basic = scan.nextInt();
		
		System.out.println("수당을 입력하시오 : " );
		int extra = scan.nextInt();
		
		int total = basic + extra;
		double tax = total >= 50000000 ? 0.03 : total >=3000000 ? 0.02 : 0.01 ;
		double net = total - total*tax;
		
		System.out.println("*** "+name+" ***");
		
		System.out.println("이름 : " +name);
		System.out.println("직급 : " +position);
		System.out.println("기본급 : " +basic);
		System.out.println("수당 : " +extra);
		System.out.println("세율 : "+(int)(tax*100) + "%");
		System.out.println("합계 : " +total);
		System.out.println("세후 월급 : "+ net);
	}

}

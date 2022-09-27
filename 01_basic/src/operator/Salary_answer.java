package operator;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Salary_answer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name,position;
		int basepay,extrapay,total;
		System.out.println("이름 입력 : ");
		name = s.next();
		System.out.println("직급 입력 : "  );
		position = s.next();
		System.out.println("기본급 입력  ");
		basepay= s.nextInt();
		System.out.println("수당 입력  ");
		extrapay= s.nextInt();
		
		
		total = basepay+extrapay ;
	
		//조건 ? 참 : 거짓
		//조건 ? 참 : 조건 ? 참 : 거짓
		double taxRate = total >= 5000000 ? 0.03 : total >=3000000 ? 0.02 : 0.01;
		double salary = total - total*taxRate;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("기본급 : " + df.format(basepay)+"원" );
		System.out.println("수당: " + df.format(extrapay)+"원" );
		System.out.println("세금 : " + df.format(taxRate)+"원" );
		System.out.println(" : " + df.format(basepay)+"원" );
		System.out.println("기본급 : " + df.format(basepay)+"원" );
		System.out.println("기본급 : " + df.format(basepay)+"원" );
		
	
		
		
		
		
	
		
		
		
	}

}

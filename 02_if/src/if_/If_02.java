package if_;
import java.util.Scanner;
public class If_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a ,b , c ;
		System.out.println("a의 값 : ");
		a = scan.nextInt();
		System.out.println("b의 값 : ");
		b = scan.nextInt();
		System.out.println("c의 값 : ");
		c = scan.nextInt();
		double avg = (a+b+c)/3;//or (a+b+c)/3.0
		
		
		if (avg>=60) {
			if(a>=40&&b>=40&&c>=40)System.out.println("합격");
			else System.out.println("과락으로 불합격");
		
		} else {System.out.println("불합격");
		}
					
	}
}


/*
 * 3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a값  98  
b의 값 90  
c의 값 85
합격

a의 값  98  
b의 값 90  
c의 값 35
과락으로 불합격

a의 값 68  
b의 값50  
c의 값45
불합격
 */

package operator;
import java.util.Random;
public class Homework01 {

	public static void main(String[] args) {
	
		/*Random r = new Random();
		int d1 = r.nextInt(6)+1;
		int d2 = r.nextInt(6)+1;
		
		System.out.println("주사위1은 : " + d1 + " 주사위2는 : "+d2);
	
		System.out.println(d1 == d2 ? "비겼다": d1>d2 ? "1이 이겼다" : "2가 이겼다");
		*/
		double r1 = Math.random();
		double r2 = Math.random();
		
		int d1 = (int)(r1*6)+1;
		int d2 = (int)(r2*6)+1;
		System.out.println("주사위1 : " + d1 + " 주사위2 : "+d2);
		System.out.println(d1==d2 ? "주사위1과 주사위2가 같다" : d1>=d2 ? "주사위1이 "+d1+"으로 승": "주사위2이 "+d2+"으로 승");
		
		int sum = d1 +d2;
		System.out.println("주사위1의 값과 주사위2의 값의 합은 "+sum+"이다");
		

	
	
	}

}

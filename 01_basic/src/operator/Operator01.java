package operator;
import java.text.DecimalFormat;
public class Operator01 {

	public static void main(String[] args) {
		int money = 5738;
		/*System.out.println("현금" + new DecimalFormat().format(money)+"원");
		System.out.println("천의 자리 : " +((int)money/1000));
		System.out.println("백의 자리 : " + ((int)(money/100)-(int)(money/1000)*10));
		System.out.println("십의 자리 : " + ((int)(money/10)-(int)(money/100)*10));
		System.out.println("일의 자리 : " +((int)(money/1)-(int)(money/10)*10));*/
		
		int t = money/1000;
		int h = money%1000/100;
		
		
		
		
		//System.out.println("현금" + new DecimalFormat().format(money)+"원"); // 1회성
		//System.out.println("천의 자리 : " +(money/1000));
		//System.out.println("백의 자리 : " + ((money/100)-(money/1000)*10)+"원");
		//System.out.println("십의 자리 : " + ((money/10)-(money/100)*10)+"원");
		//System.out.println("일의 자리 : " +((money/1)-(money/10)*10)+"원");
		
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(money)); // 계속.....
	}

}
/*
[문제] 
현금이 5738원 있다. 각 자리별로 출력 하시오

[결과]
현금 5,738원
천의 자리 : 5
백의 자리 : 7
십의 자리 : 3
일의 자리 : 8 
*/

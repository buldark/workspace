package variable;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 320;
		short b = 258;
		short sum = (short)(a + b) ; // char or byte or short 형으로 계산하면 int형으로 변환한다.
		//short sum2 = 'a'+'b';
		System.out.println(a+"+"+b+"="+sum);
		//int sum3 = a +b;
		
		short sub = (short)(a-b);
		int mul = a*b; // short로 하면 넘어가서 int로 바꿔줘야 함 
		double div = (double)a/b; //강제형변환/자동형변환 
		
		
		
		
		//String.format(%2f,div)
		
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"*"+b+"="+new DecimalFormat().format(mul));//
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"/"+b+"="+String.format("%.5f",div));
		System.out.println(a+"/"+b+"="+String.format("%7.5f",div));
		//System.out.println(a+"/"+b+"="+String.format("%0.5f",div));
		
		
		
	}

}




/*
[문제] 변수를 이용하여 320과 258의 합(sum) 차(sub) 곱(mul) 몫(div) 을 구하시오

[실행결과]

320+258=xxxx
320-258=
320 * 258=
320/258 =
320 258은 정수형

*/
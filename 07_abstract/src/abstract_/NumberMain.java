package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class NumberMain {

	public static void main(String[] args) {
		NumberFormat nf7  =NumberFormat.getInstance();// - 추상클래스라서 직접 new하여 생성 불가능 
		NumberFormat nf = new DecimalFormat(); //df는 nf의 자식 클래스 
		System.out.println(nf.format(12345678.456789)); //소수점 3쨰자리까지 표출 
		System.out.println(nf.format(12345678));
		System.out.println();
		//숫자의 3자리마다 쉼표를 찍고 싶다!! 
		
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); //df는 nf의 자식 클래스  
		System.out.println(nf2.format(12345678.456789)); //소수점 3쨰자리까지 표출 12,345,678.46원
		System.out.println(nf2.format(12345678));//12,345,678원//소수점이하자리 아무것도 없어서 표시 ㅌㅌ

		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원"); //df는 nf의 자식 클래스 .00원" 소수점 뒤에 자리가 0이더라도  소주점 아래자리 표시!! 
		System.out.println(nf3.format(12345678.456789)); //소수점 3쨰자리까지 표출  //12,345,678.46원
		System.out.println(nf3.format(12345678));//12,345,678.00원
		System.out.println();

		
		
		NumberFormat nf4 = NumberFormat.getInstance(); //메소드이용
//		NumberFormat nf4 = NumberFormat.getCurrencyInstanc();//메소드 이용 원가 표시
		
		nf4.setMaximumFractionDigits(2);
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println();
		
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance();//메소드 이용 원가 표시
		
		nf5.setMaximumFractionDigits(2);
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println();
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		nf6.setMaximumFractionDigits(2);
		nf6.setMinimumFractionDigits(2);
		System.out.println(nf6.format(12345678.456789));
		System.out.println();
		
	}

}

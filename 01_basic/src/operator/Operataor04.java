package operator;

public class Operataor04 {
	public static void main(String[] args) {
		int a = 5 ;
		a=2;
		a=3;
		System.out.println(a);
		// 이럴 경우 덮어 쓴다 논리적 신호이기에  기존의 값을 없애고 마지막의 값 3만 살아남음 !! 저금통이 아님!!  
		int b =5;
		b+=2 ; //이항연산자 ->3항연사자 b= b+2
		b*=3;
		System.out.println("b ="+b); //21
		
		/*누적을 하려면 
		 * a=5
		 * a = a+2 이래야 함 / a = 7 =? 
		 * a=a*3 / a =21 	 a *=3
		 * a= a/6 / a = 3	a /=6 
 		 *  이렇게 3줄은 3항 연산자 
		 */
	
		/*
		 증감 연산자 독립적으로 혼자 쓰일 떄는 선행 후행 연산을 따지지 않는다. 
		 a=a+1 => a+=1 => ++a(선행연산자) or a++(후행연산자)
		 */
		b++ ;
		System.out.println("b ="+b); //22
		
		int c = b++; //이럴 경우 후행 연산 선행 연산이지 따짐!!!! 괄호가 먼저 계산!! &== --
		/* 순서 1) int c=b가 먼저! -> 2)b+1이 되는것임!!
		 
		 */
		System.out.println("b ="+b + " c = "+ c); //b=23 c =22
		
		int d = ++b - c--;  // d= 2 -> 앞에 부터 있는 애들이 먼저 1) ++ 먼저 계산 ++b ->b=24 2) int d = b-c 3) c-- =>c =21
		System.out.println("b ="+b + " c = "+ c +"d = "+d); //b=24 c =21 d=2
		

		System.out.println("b++="+b++ );//b=24 b뒤에 ++이 붙었으니깐 먼저 b 
		System.out.println("b="+b); //b=25
	}

}
//
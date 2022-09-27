package variable;
import java.util.Random;
public class Variable03 {

	public static void main(String[] args) {
	System.out.println("25,36 둘중에 큰값은 = " + Math.max(25,36));
	System.out.println("78.9,55.8 둘중에 큰값은 = " + Math.max(78.9,55.8));
	System.out.println();
	
	//System.out.println(random()); -> 이럼 어느 클래스의 random인지 모르니깐 아래처럼 써줘야함
	System.out.println(Math.random());
	System.out.println("난수의 값은 65~90 사이의 ="+ (int)(Math.random()*(90-65+1)+65));
	System.out.println("난수의 값은 65~90 사이의 ="+ (int)(Math.random()*26+65));
	System.out.println("난수를 문자로 표현하고자 하면 +(char)"+"\t"+(char)(Math.random()*26+65));
	
	System.out.println();


	System.out.println(new Random().nextDouble() );// 일회용 
	
		}
	
	}

//Random r = new Random();
	//System.out.println(nextDouble(r));
	//private static char[] nextDouble(Random r) {
		// TODO Auto-generated method stub
		//return null;







/*난수 -컴퓨터가 불규칙하게 발생하는 수 
0<=난수<1 0~0.999999999999\


a~b의 사이의 난수 발생 -> (int)(Math.random()*(b-a+1)+a)

 */

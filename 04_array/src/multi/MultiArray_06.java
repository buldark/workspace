package multi;
import java.util.Scanner;
public class MultiArray_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 입력 : ");
		int pnumber = scan.nextInt();
		
		int count =0;
		System.out.println("과목수를 입력 : ");
		int snumber = scan.nextInt();
		String[][] name = new String [pnumber][snumber];
		
		
		
		//while(true) {
			
			for(int i = 0; i<pnumber;i++) {System.out.println("이름 입력");
			String nameput = scan.next();
			count++;
			System.out.println("과목 입력");
			String sunput = scan.next();
			//for(int i=0 ;i<pnumber;i++) {
				
			
			//}//for()
			if(count==pnumber)break;
			}//fori
			/*if(count==pnumber)break;*///}//while
		
		
	}
}

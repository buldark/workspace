package for_;

import java.util.Scanner;

public class For_03 {

	public static void main(String[] args) {
		
			Scanner scan= new Scanner(System.in);
			int sum = 0;//돼지저금통
				
			int mul = 1 ; //복리이자 계산
			for (int i=1; i<=9;i++){
				sum= sum+i;
				System.out.println(i+ "\t"+10);
			
	}//for 돼지 저금통
			for ( int i =1; i<=10;i++) {
				sum+=i;
				mul*=i;
				System.out.println(i + " \t"+sum+ " \t" +mul);
				
			}
}
}
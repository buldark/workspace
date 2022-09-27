package array;

import java.util.Scanner;

public class HomeWork_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int ch = 2;
			int num = 0;
			
			for(int i =0 ; i<=4 ; i++) {
				int a = (int)(Math.random()*89+11);
				int b= (int)(Math.random()*89+11);
				int sum = a+b;
				int count=0;
					
				for(; ch<=0;ch--) {
				 	System.out.print(num + "번 " +a + "+"+b + ": ");
					int user = scan.nextInt();
						if(user==sum) {System.out.println("딩동댕");
						count++;
						break;}
						else System.out.println("땡");
							 ch--;}//for2
			}//for1
			
			
		}//while

		
		
		
		
		
		
		
		
	}
}

		/*while(true) {
			
			int ch = 2;
			int num = 0;
			
			for(int i =0 ; i<=4 ; i++) {
				int a = (int)(Math.random()*89+11);
				int b= (int)(Math.random()*89+11);
				int sum = a+b;
				int count=0;
				
				
				for(; ch<=0;ch--) 
				 	System.out.print(num + "번 " +a + "+"+b + ": ");
					int user = scan.nextInt();
						if(user==sum) {System.out.println("딩동댕");
						count++;
						break;
					
						}
						else IF {System.out.println("떙")
						 	ch-;
						
					
							
						}
					//else {System.out.println("딩동댕");count++;}
					//	}continue;
					
					
			}//for
		
		}//while

	}
	
*/
	

package array;
import java.util.Scanner;
import java.util.Random;
public class Baseball_as {

	public static void main(String[] args) {
		Random r = new Random();
	    Scanner scan = new Scanner(System.in);
	    int[]com = new int[3];
	    int[]user= new int[3];
	    String yn;
	    String str;
	    int strike,ball;
	    while(true) {//게임 진행하겠습니까??
	    	System.out.println("게임 진행 (Y/n)?");
	    	yn=scan.next();
	    	 if(yn.equals("Y")||yn.equals("y")||yn.equals("N")||yn.equals("n"));break;// if yn조건이면 while 1구문 빠져나간다.
	     	
	 	    
	     	 
	    	//무한 루프이기에 빠져나갈 조건을 달아줘야함
	    	
	    	
	    }//while1
	    if(yn.equals("Y")||yn.equals("y")) {
 		System.out.println();
	    System.out.println("게임을시작합니다");
	   
	    //난수발생
	    	for(int i=0;i<com.length;i++) {
	    		com[i]=(int)(Math.random()*9+1);
	    		//중복체크
	    		for(int j = 0 ;j<i ; j++)	{
	    			if(com[i]==com[j]) {
	    				i--;
	    				break;
	    			}
	    		}//for j
	    	}//for i
	    
	     
	     System.out.println(com[0]+","+com[1]+","+com[2]);
	     
	     //사용자 입력 while문으로!!
	     while(true) {
	    	 System.out.println("숫자입력 : ");
	    	 str = scan.next(); //"458"입력
	    	 for(int u=0 ; u<user.length;u++) {
	    		 user[u]=str.charAt(u)-48;//여기서 char라서  Ascill코드 숫자가 아닌 문자로 나와서문자 : ascii '0' : 48 '1' :49 .....그래서 숫자로 나오기 위해서 -48
	    	 } //for u 
	    	 /*user[0]=str.charAt(0);
	    	 user[1]=str.charAt(1)
	         user[2]=str.charAt(2) for u 반복문이 이렇게 되는거임*/
	    	 
	    	//com과 user비교 이중for문입력
	    	 strike=ball=0;
	    	 for(int i =0; i<com.length;i++) {
	    		 for(int j=0;j<user.length;j++) {
	    			if(com[i]==user[j]) {
	    				if(i==j) strike++;
	    				else ball++;
	    				
	    			}
	    		  }
	    	 
	    	 	}
	    	 System.out.println(strike+"스트라이크 "+ball +"볼");
	    	 if(strike==3) break;
	    	 }//for i 
	    	
	     }//while2 : 사용자 입력
	    System.out.println("프로그램 종료합니다");
	    
	    }//if Y
	    
	    
	    
	    
	    
	}


/*
 게임 진행 (Y/n)?
y

게임을시작합니다
6,4,1
숫자입력 : 
645
2스트라이크 0볼
숫자입력 : 
200
0스트라이크 0볼
숫자입력 : 
645
2스트라이크 0볼
숫자입력 : 
641
3스트라이크 0볼
프로그램 종료합니다

 */
/*public class BaseBall {

   public static void main(String[] args) {
      Random r = new Random();
      Scanner sc = new Scanner(System.in);
      int []ar = new int[3];
      int [] ar1 = new int[3];
      String start;
      while(true) {
         System.out.print("게임을 실행하시겠습니까(Y/N) " );
         start =sc.next();
         if(start.equals("Y")||start.equals("y")) {
            System.out.println("시작");
         }else if(start.equals("N")||start.equals("n")) {
            System.out.println("종료");
            break;
         }else {
            System.out.println("잘못입력하였습니다");
            continue;
         }
         for(int i = 0; i<ar.length; i++) {
            ar[i] = r.nextInt(9)+1;
            for(int j = 0; j<i; j++) {
               if(ar[i] == ar[j]) {
                  i--;
                  break;
               }
            }
         }
         while(true) {
            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            ar1[0] = a/100;
            ar1[1] = a%100/10;
            ar1[2] = a%100%10/1;
            int strike = 0;
            int ball = 0;
            for(int i=0; i<ar.length; i++) {
               if(ar[i]==ar1[i]) {
                  strike++;
               }
            }
            for(int i = 0; i<ar.length; i++) {
               for (int j = 0; j<ar1.length; j++) {
                  if(i==j) continue;
                  if(ar[i]==ar1[j]) {
                     ball++;
                  }
               }
            }
            System.out.println(strike+"스트라이크 "+ball+"볼");
            if(strike==3) break;
         }
         break;
      }
   }   
}


*/
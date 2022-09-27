package for_;

public class Multifor_04_as {

	public static void main(String[] args) {
	
	 int dan,i;
	
	 
	 for(int w = 2 ; w<=8 ;w+=3) {//3번   w=1 , w=2 .w=3 =>
		 
		 
		 
		 for(i=1;i<=9;i++) {
				 for (dan=w; dan<=w+2;dan++) {
					 if(dan !=10) System.out.print(dan+"*"+i+"="+dan*i+"\t");
				 
			 }//fordan
			 System.out.println();
		 
		 }//fori
		 System.out.println();
		 	 
	 }//forw
	 
	
	}

}
/*
 [강사] [오전 10:17] public class AddGame {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a, b, dab, count;
      String yn;
      
      while(true) {
         count = 0;
         for(int i=1; i<=5; i++) { //5문제
            a = (int)(Math.random() * 90 + 10); //10 ~ 99
            b = (int)(Math.random() * 90 + 10); //10 ~ 99
            
            for(int j=1; j<=2; j++) { //기회를 1번 더
               System.out.print("[" + i + "] " + a + " + " + b + " = ");
   ...
 */
 
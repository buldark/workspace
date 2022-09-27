package while_;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A B C D E-Z
		//1줄에 7개씩 출력하시오 -> int coount =0;  -> 안에 if문을 써서 처리 오
		char ch = 'A';
		int count = 0;
		do {
			
			System.out.print(ch + " ");// A C D E F G H ~~~Z -> 출력은 이 부분 !! 
			ch++; // B~~~~~<
			
			count++;//1 2 3 4 5 6 7
			if(count%7==0)System.out.println();
		
		}while(ch <= 'Z');
		
		
		

	}

}

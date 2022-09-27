package multi;
//다차원 배열 파이썬 빅데이터는  4차까지....

public class MultiArray_01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2];//new는 동적할당 java는 동적할당 해줘야 함 //메모리 활용 더 효율적 가능
		
		//이중 for문 // 행에 대한 주소갑 ar.length 열에 대한 주소값 1행의 열 ar[0].length ar[2].lenght
		ar[0][0] = 10;
		ar[0][1] = 20;
		
		ar[1][0] = 30;
		ar[1][1] = 40;
		
		ar[2][0] = 50;
		ar[2][1] = 60;
		for(int i = 0 ;/*행에 대한 주소값은 ar이 가지고 있음!!*/i<ar.length;i++) {
			for (int j = 0 ; j<ar[i].length ; j++) {
				System.out.println("ar["+i+"]["+j+"]= "+ar[i][j]);
			}//for j
			
		}//for i
		
		

	}

}
/*
ar[0][0]= 10
ar[0][1]= 20
ar[1][0]= 30
ar[1][1]= 40
ar[2][0]= 50
ar[2][1]= 60

*/


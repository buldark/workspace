package multi;

public class MultiArray_02 {

	public static void main(String[] args) {
		int[][] ar = new int [10][10];
		int num =0;

		
		for(int i = ar.length-1 ;i>=0; i--) {
			for (int j =ar[i].length-1 ;j>=0;j--) {
				num++;//1
				ar[i][j] = num;
				
				}
		}
		
		for(int i = 0 ;i<ar.length; i++) {
			for (int j =0 ;j<ar[i].length;j++) {
				System.out.print(String.format("%4d",ar[i][j] ) );
			}
		System.out.println();
		}

		
//들어가는 방향 조절 ->2차원 배열 입력 for 부분 
//	입력	for(int i = 0 ;i<ar.length; i++) {
//			for (int j =0 ;j<ar[i].length;j++) {
//				num++;//1
//				ar[j][i] = num;
//		
// 출력		for(int i = 0 ;i<ar.length; i++) {
//			for (int j =0 ;j<ar[i].length;j++) {
//				System.out.print(String.format("%4d",ar[i][j] ) );
//			}
//		System.out.println();
//		}

//=====================================================================
		
//		//입력for
//		for(int i = 0 ;i<ar.length; i++) {
//			for (int j =0 ;j<ar[i].length;j++) {
//				num++;//1
//				ar[i][j] = num;
//				
//			}
//		}
		
		
		//출력for 
//		for(int i = 0 ;i<ar.length; i++) {
//			for (int j =0 ;j<ar[i].length;j++) {
//				System.out.print(String.format("%4d",ar[i][j] ) );
//			}
//		System.out.println
//		}
	}

}
		

	
	//출력과 입력 부분을 나눈이유는 
	//출력은 밑으로 내려가면 끝남 그래서 출력은 무조건 ----->이방향임 
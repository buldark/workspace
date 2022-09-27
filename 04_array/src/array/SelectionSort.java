package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {25,48,35,72,50};
		int tmp = 0;
		
		System.out.println("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + "   ");
		
		}
		System.out.println();
		
		//Arrays.sort(ar); 이렇게 java에 있는거 쓰는거 직접 짜애 할 수도.....
		
		for(int i = 0 ; i<ar.length; i++) {
			for(int j=0 ; j<ar.length ;j++) {
				if(ar[i]>ar[j]) 
						if(i<j) {
							
							tmp=ar[i];
							ar[i]=ar[j];
							ar[j]=tmp;
						} else; 
						
					/*자리 교환 공식
					 먼저 int tmp =0 ;으로 초기화
					 ar[1]=30
					 ar[3]=20 
					 tmp = ar[1]//큰수
					 ar[1]=ar[3]//ar[1]에 ar[3]값 넣어주는거 / 같다는 뜻이 아님 
					 ar[3] = tmp ar[3]에 tmp 즉 처음 ar[1]값 대입 해주기!!
								
				*/
				
			}
		}
		
		
		System.out.println("정렬 후 : ");
		for(int data : ar) /*확장 for문 ar[0]~~ar[n] 까지의 값을 data에 넣어주기!!*/{
			System.out.print(data + "   ");
		
		}
		System.out.println();

	}

}

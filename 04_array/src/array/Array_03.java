package array;
import java.util.Scanner;
public class Array_03 {

	public static void main(String[] args) {
		System.out.println("배열 크기 입력 : " );
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt(); //3
		
		//ar= new int[scan.nextInt()];
		int[] ar = new int[size];
		int sum=0;
		
		for(int i = 0 ;i<ar.length /*or i <size */ ; i++) {
			
			System.out.print("ar["+i+"] 입렵 : ");
			ar[i]=scan.nextInt();
			
			sum += ar[i];
			
			
			}
		int max ,min; 
		max =  min  = ar[0]; 
		for (int i=1;i<size;i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];	
			
				}
		for(int data : ar){
		System.out.print(data + " ");}
		
		
		
		System.out.println();
		System.out.println("합= "+sum);
		System.out.println("최대값= "+max); // max의 초기값은 0이 아니라 ar[0]이 한다 (data 중에 하나를 갖는다) max값이 ar[0]이기에 1부터 시작!!->if(ar[1]> max) max = ar[1] if(ar[2]> max) max = ar[2] if(ar[3]> max) max = ar[3] if(ar[4]> max) max = ar[4] 
		
	}
	}

/*
ar[0] 입력 : 25




화면 25 -50 78

이경우 입력for문 따로
출력 for 문 따로 

*/
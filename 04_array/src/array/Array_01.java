package array;

public class Array_01 {

	public static void main(String[] args) {
		
		int[] ar  ;// 배열을 선언 / 정수형 변수
		ar = new int[5];//생성 []에 들어가는 숫자가 방의개수  총 5개의 방이 들어옴 ar[0] ar[1] ar[3] ar[4] ar[5]
		
		ar[0] =25;
		ar[1] =78;
		ar[2] =30;
		ar[3] =43;
		ar[4] =52;
		// 배열과 for는 실과 바늘임
		
		System.out.println("배열명 ar =" +ar) ; // [I@3d012ddd 앞에 I는 integer라는거를 뜻함 주소값음 (class)@16진수
		System.out.println("배열의 크기는 " + ar.length);
		
		for(int i= 0 ; i<=4 ; i ++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}//for문
		
					
		System.out.println("거꾸로 출력");
		for(int i = ar.length-1;/*int i = 4와 같음 ar.length = 5 */ i>=0;i--) /*첫번째 for 구문에서 소멸 다시 사용 가능 */{
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		
		System.out.println("짝수의 데이터만 출력");
		for(int i= 0 ; i<ar.length;/*이것보다는 앞에것임i<=4*/  i ++) {
			if(ar[i]%2==0) 
			System.out.println("ar["+i+"] = "+ar[i]);
		}//for문 ar.length를 여기서 적극 활용????????몰라
		
		System.out.println("확장 for문");
		for(int data/* 앞에 어떤 형이 써주고 뒤에 ...정수형이니깐 int를 써준거임 */ : ar) {
			System.out.println(data);
			
		}
		
		//ar.length라고 안써도 배열의 크기만큼 for 문이 반복한다. 대신 방번호는 쓸 수 없음 방번호를 통해서가 아니라 데이터를 직접적으로 쥼  

}
}

/*에러가 뜸 !! 이유 Index 5 out of bounds for length 5
			at array.Array_01.main(Array_01.java:22) 5번 방이 없음 
		 for(int i= 0 ; i<=5 ; i ++) {
		 
		 System.out.println("ar["+i+"] = "+ar[i]);
		}
		
		*System.out.println("거꾸로 출력");
		for(int i = 4 ; i>=0;i--) /*첫번째 for 구문에서 소멸 다시 사용 가능 */
		
		
		
		
		
		
		/* 배열 ar 쓰는 방식 
		int[]ar = {10,20,30};
		int[] ar2 ;
		ar2 = new int[3];
		int[] ar3 = new int[]{10,20,30};
		
		
		// 에러 : 오른쪽에 int[3] 이렇게 쓰면 안됨ㅇ.....int[] ar = new int[3]{10, 20, 30}; - X
		 에러 : 오른쪽에 데이터 값 {10,20,30} 쓰면 안됨...int[] ar; ar = {10, 20, 30}; - */

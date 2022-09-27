package for_;

public class For_01 {

	public static void main(String[] args) {
		int i = 1; 
		for (; i <=10 ; i++) {
			System.out.println("Hello Java :" + i);
		}// for 조건에 맞을 때 {} 안에 있는 값이 나타남 (참)
		System.out.println("탈출 i = "+ i);//{}밖인 여기에 쓰면 에러 뜸 local variable 구역안에 잡혀 있는...{}여기 밖을 벗어나면 소멸... 이건 자바의 특징 cf) c 언어는 메소드 범위 자바는 지역 범위 그래서 int i 를 ㄹfor() 위에 쓰면 범위가 넓어짐 
//===================================================================
		
		System.out.println("-----------------------------");
		for (i=10; i>=1 ; i--) {
			System.out.print(i+" ");
		}
		
		
		
		
		//A b C D E F G Z Y Z
		for (i='A';i<='Z'; i++) {
			System.out.print((char)i);//casting 필수!! 
		}
	}

}

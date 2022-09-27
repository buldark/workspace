package class2;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성! 이렇게 생성 가능 한것 String class 뿐!!!
		String b = "apple"; //오버라이딩 되어서 객체 a,b의 값은 주소값이 아닌 apple이 뜸
		//extends object class 생략 그리고 object클래스안에 String매소드가 있고 결국!! String은 결국 모두 다 오버라이딩이 되어서 주소값이 아닌 그 문자열값이 나옴! 
		if(a==b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b))System.out.println("a와 b는 문자열은 같다");
		else System.out.println("a와 b는 문자열은 다르다");
		
		
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d))System.out.println("c와 d는 문자열은 같다");
		else System.out.println("c와 d는 문자열은 다르다");
		
		String e = "오늘 날짜는 "+ 2022 + 9 + 27;
		System.out.println("e = " + e);
		System.out.println("문자열 크기 = "+e.length()); //문자열 크기 구하는거는 .length() 배열 크기는 .length
		for(int i = 0; i<e.length();i++) {
			System.out.println(i + " : "+e.charAt(i));
		}
	
		System.out.println("부분 문자열 추출 ="+e.substring(7));//0번 부터시작!!! 
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));//정확하게는 7번부터 10번까지 꺼내오는것!! 
		
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색"+ e.indexOf("짜"));//indexOF위치를 가져와라!!! 
		System.out.println("문자열 검색"+ e.indexOf("날짜"));
		System.out.println("문자열 검색"+ e.indexOf("개바부")); // 없으면 에러가 뜨는 것이 아니라 -1이 뜸!! 주로 검색기능 애서 찾고자 하는 문자열이 없다면 -1이 떠서!!! 
	
		
		System.out.println("문자열 치환 = "+e.replace("날짜","일자"));//치환!! 
	}

}
/*
 문자열은 편집이 안되므로 메모리 4번생성된다
 JVM에 의해서 삭제 시 Garbage COllector로 보낸다.
 Garbage Collector는 실행되면 컴퓨터는 멈춘다. 
 
 "오늘 날짜는 " 1회성으로 생성
 "오늘 날짜는 2022" 1회성으로 생성
 "오늘 날짜는 20229" 1회성으로 생성
 
 e----->"오늘 날짜는 2022927" 얘만 살아남음!! 
 
  
  */
 
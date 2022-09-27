package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
	public static void main(String[] args) throws ParseException{ 
		Date date = new Date(); //시스템의 설정된 시간의 값으 가져옴 얘네들도 오버라이딩 - 그래서 주소값이 아닌 시간이...
		System.out.println("오늘 날짜 : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));
		
		
		//생일 - 1991 07 15 10:35:15 입력
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");//순수하게 데이터만 년과 월을 바꾸면 안된다....
	//	Date birth = "19910716103515" 서로의 데이터의 자료형이 달라서 에러뜸  
	//		Date		String
	//	Date birth = input.parse("19910716103515");//Unhandled exception type ParseException : parse Exception 처리 해줘라.......
		Date birth = input.parse("19910716103515");
		System.out.println("내 생일 : "+ birth);
		System.out.println("내 생일 : "+ sdf.format(birth));
		
	//	int aa = (int) "123"; ->이럼 에러뜸 String 클래스는 int 강제 변환 노노
		int aa = Integer.parseInt("123"); // 강제 변환이 아닌 클래스안의 .parseInt()라는 메소드를 활용하여... 
	}

}





/*
 
 
 */
 
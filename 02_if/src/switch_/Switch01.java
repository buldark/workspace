package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입렵  : ");
		int month = scan.nextInt();
		int days ;
		
	//	if (month==1) days=31;
	//	else if()


		//switch 가독성 
			
			
	switch(month) {
	case 1 : days=31 ;break;
	case 2 : days= 28;break;
	case 3 : days=31;break;
	case 4 :days=30;break;
	case 5 :days= 31;break;
	case 6 :days=30;break;
	case 7 : days=31;break;
	case 8 : days=31;break;
	case 9 : days=30;break;
	case 10 : days=31;break;
	case 11 :days=30;break;
	case 12 : days=31;break;
	default : days = 0; 
	
	}
	System.out.println(month +"월은 " +days+" 일 입니다.");
	}

}

//if구문과 switch 차이 & 깔끔하게 만들기... break 이용!!! 

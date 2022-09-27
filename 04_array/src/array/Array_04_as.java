package array;
import java.util.Scanner;
public class Array_04_as {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] ar = new boolean[5]; // 배열로 잡으면 쓰레기 값이 없어서 처음에는 무조건 boolean의 경우 false 
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("   주차관리시스템 "    );
			System.out.println("************************");
			System.out.println( "   1 . 입차");
			System.out.println("   2 . 출차");
			System.out.println( "   3 . 리스트\n" + "   4 . 종료\n" + "************************\n" + "      메뉴 : ");
			num = scan.nextInt();
			if(num==4) break;//4번 종료 선택시 그냥 while반복 안하고 while 아래로 나가기
			if(num<1||num>4) {
				System.out.println("1~4번 까지만 입력하세요");
				continue;// 1~4 이외으 ㅣ숫자 입력시 위로 올라가서 메뉴 반복
				}
			if(num==1) {
				System.out.println("위치 입력 : ");
				int position = scan.nextInt();//3입력시 ar[2]번 위치임 
				//ar[]= false 면 빈자리 ar[] = true면 주차 되어있음
				if(ar[position-1]==true)  // ar[i]= false는 ar[i]에 대입 /  ==false 은 false랑 같을 경우 의미  사용 하지말기 = ==차이 다시 확인
					System.out.println("이미 주차 되어있습니다");
					
				else{/*ar[position -1]=false;*///boolean은 true or false이니깐 굳이 앞에다 반대 반복 쓸 필요없이 바로 false => flase니깐 빈자리 -> 주차가능 -> 주차 출력 -> 주차 되었으니깐 ar[]을 true로 변경
					System.out.println(position + "위치에 입차");	
					ar[position -1]=true;
					
				}
				
			}else if(num==2) {
				System.out.println("위치입력: ");
				int position = scan.nextInt();
				
				if(ar[position-1]) {
					ar[position-1]=false;
					System.out.println(position+"위치에서 출차");	
				}else
					System.out.println("주차 되어있지 않습니다");
				
				
			}else if(num==3) {
				for(int i = 0 ; i <ar.length;i++) {
					System.out.println((i+1)+" 위치 : "+ ar[i]);
					
				}
				
			}
			
		
		}//while
		
		 System.out.println("주차관리 프로그램을 종료합니다.");
	}

}





















/*
[강사] [오후 4:43] /*
주차장 관리 프로그램 while 과 if 문 만 들어감 
**************
   1. 입차      input()
   2. 출차      output()
   3. 리스트      list()
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다


*
*
*
*public class ParkingLot {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      boolean[] lot = new boolean[10]; //주차공간 생성
      int Car = 0; //현재 주차중인 차량

      while (true) {//프로그램 가동
         System.out.print("   주차관리시스템      \n" + "************************\n" + "   1 . 입차\n" + "   2 . 출차\n"
               + "   3 . 리스트\n" + "   4 . 종료\n" + "************************\n" + "      메뉴 : ");
         int menu = scan.nextInt();//메뉴선택
         
         if (menu == 1) { // 입차메뉴
            for (;;) {
               if (Car == lot.length) {
                  System.out.println("현재 주차자리가 없습니다.");break;
               }   
               System.out.print("\n위치 입력 : ");
               int site = scan.nextInt();
               if (lot[site - 1] == false) {
                  lot[site - 1] = true;
                  System.out.println(site + "번 자리 주차");
                  Car++;
                  break;
               } else
                  System.out.println("이미 주차되어있습니다.");
               continue;
            }
         }
         System.out.println();

         if (menu == 2) {
            for (;;) {
               
               if (Car == 0) {
                  System.out.println("현재 주차중인 차량이 없습니다.");break;
               }               
               System.out.print("\n위치 입력 : ");
               int site = scan.nextInt();
               if (lot[site - 1] == true) {
                  lot[site - 1] = false;
                  System.out.println((site - 1) + "번 자리에서 출차");
                  Car--;
                  break;
               } else
                  System.out.println("주차되어있지 않습니다.");
               continue;
            }
         }
         System.out.println();

         if (menu == 3) {
            
            System.out.println();
            for (int i = 0; i < 10; i++) {
               String a;
               if(lot[i]==false)   a=" ";
               else a="주차중";
               System.out.println((i + 1) + "번 자리\t:\t" + a);
               
            }
            System.out.println("현재 차량수 : "+Car+"대\n");
         }

         if (menu == 4) {
            break;
         }
      }
      System.out.println("주차관리 프로그램을 종료합니다.");
   }
}*/
package class_;

import java.util.Scanner;

//모든일은 여기에서 잡음
public class MemberService { //일하는 클래스 
	
	private MemberDTO[] ar = new MemberDTO[5];//5명까지니깐 //단순 dto 방 다섯개를 가지고 있을 뿐 -> 배열만 생성 !! 클래스 생성은 아님!! 
	
	public void menu() { //이 함수 메뉴는 스스로 발생 X main 에서 new 하고 생성자+ 
		Scanner scan =new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.println("***********************");
			System.out.println("1번 메뉴");
			System.out.println("2번 메뉴");
			System.out.println("3번 메뉴");
			System.out.println("4번 메뉴");
			System.out.println("메뉴 :  ");
			num = scan.nextInt();
			if(num==5) break;//while을 벗어나라 
			if(num==1)insert();//호출
			else if(num==2)list();
			else if(num==3)update();
//			else if(num==4)delete();
//			else(System.out.println("1부터 5만 입력");
			}//while
		}

	public void insert() {//빈자리인지 확인  : null값인가?? 
		Scanner scan =new Scanner(System.in);
		
		int i ;
		for(i =0 ;i<ar.length;i++) {
			if(ar[i]==null) break;
			
		}//for i 
		if(i==ar.length) {System.out.println("5명의 정원이 꽉 찼습니다.");
			return;//메소드를 빠져나가라 뜻...(void에는 return이 없는 거!!)
			}//for i에서 break를 나간적이 없음 i가 5가 되어 5명 정원이 꽉 찼다고 출력 
		
		
	
			
				//데이터 입력
				System.out.print("이름 입력 : ");
				String name = scan.next();
				System.out.print("나이 입력 : ");
				int age = scan.nextInt();
				System.out.print("핸드폰 입력 : "); 
				String phone = scan.next();
				System.out.print("주소 입력 : "); 
				String address = scan.next();
				ar[i] = new MemberDTO(name,age,phone,address); // 1. new 시켜주시 2. 생성자로 가라!!!-이건 위에 입력된 값이 memberdto로 가게끔/이 생성자통해서 데이터 보관??
				System.out.println("1 row created");
				int count =0 ;
				for(i =0 ;i<ar.length;i++) {
					if(ar[i]==null) count++;}
				System.out.println(count+"자리 남았습니다.");
	
		
	}//insert()
	
	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(MemberDTO memberDTO:ar) {
			System.out.println(memberDTO);
			

			//			if(memberDTO!=null) System.out.println(memberDTO.getName()+"\t"+
//													memberDTO.getAge()+"\t"+
//													memberDTO.getPhone()+"\t"+
//													memberDTO.getAddress());
			
		}//list
	}
	public void update() {
		int i ;
		System.out.println();
		Scanner scan =new Scanner(System.in);
		System.out.println("핸드폰 번호 입력");
		String phone =scan.next();
		for(i = 0 ; i<ar.length;i++) {
			if(ar[i]!=null) {
				if(ar[i].getPhone().equals(phone)/*문자열이라서 ==아닌 .equals()로!!*/) {
					System.out.println("이름\t나이\t핸드폰\t주소");
					System.out.println(ar[i]);
					//수정
					System.out.println();
					System.out.println("수정할 이름 : ");
					ar[i].setName(scan.next());
					System.out.println("수정할 나이 : ");
					ar[i].setAge(scan.nextInt());
					System.out.println("수정할 번호 : ");
					ar[i].setPhone(scan.next());
					
					System.out.println("수정할 주소  : ");
					ar[i].setAddress(scan.next());
					
					
					
					
					
					break;
			 }
			}	
		}//fori
		if(i==ar.length) System.out.println("찾는 회원이 없습니다");
		
	}//update
	
	public void delete() {	
		int i ;
		System.out.println();
		Scanner scan =new Scanner(System.in);
		System.out.println("핸드폰 번호 입력");
		String phone =scan.next();
		for(i = 0 ; i<ar.length;i++) {
			if(ar[i]!=null) {
				if(ar[i].getPhone().equals(phone)/*문자열이라서 ==아닌 .equals()로!!*/) {
					ar[i]=null;
					
					System.out.println("1 row deleted");
					break;}
			}
		}
	}
}
				
					
	
			






	

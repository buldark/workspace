package class_;

public class MemberMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();//memberservice클래스 생성 클래스는 첫글자 대문자 클래스의 객체는 첫글자 소문자!!
		memberService.menu();//memberservice클래스 안의 menu 함수호출
		
		
		
		
		System.out.println("프로그램을 종료합니다");

	}

}

/*
클럽 회원관리 프로그램 작성 -순수하게 if와 for만 들어감 
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다 //객체배열
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다 //회원가입 - 입력 주소는 시만
회원 가입, 수정, 출력 프로그램을 작성하시오 //출력 -1인분의 정보로 .............
각각의 메소드로 구성하시오
DTO - Data Transfer Object : 데이터 이동 객체(Person,Computer,Sungjuk이 여기)  cf) VO : Value Object 
MemberDTO -> 1인분
MemberService =-> 일,menu(),insert() delete()
MemberMain 은 Service에서 가져오기만 하면 됨 
[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : number

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 : name
나이 입력 :age
핸드폰 입력 :phone
주소 입력 :address

1 row created
xx자리 남았습니다

[2번 경우]
list() //if 걸어서 배열 자체에 빈게 있으면/if(!=null)  안되서 비어 있지 않으면 출력해라 
이름   나이   핸드폰      주소-

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234 //짝대기도 넣어주기
홍길동   25   xxx   xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
*/

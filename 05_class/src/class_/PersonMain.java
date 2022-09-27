package class_;

//Person이라는 class안에 getName getAge setAge setName setData setData 총 6개의 메소드가 생성 
class Person{
	private/*private : 데이터를 감추겠다-> 이럼 다른 클래스안에서는 다 에러가 나옴 */ String name; // 필드 초기화 null
	private int age ; //메뉴판을 작성한것과같은 상황
	
	public String getName(){
		return name ;
	}
	public int getAge() {
		return age;
	}
	//public  getData(String n,int a){
	//  return namer = n ; age = a ;는 
	//  }
	//위와 같은 경우 불가능 void 혹은 빈칸일 경우 입력될 리턴값이 없을 경우인데 지금 get일 경우에는 리턴값이 필요한 경우인데 앞에 리턴값이 두개의 다른 자료형을 쓰는경우 앞에 받을 리턴값 자료형 선언이 어려우니 지금 getData의 경우 불가능 선언이 존나 망했어 
	public void setName(String n/*문자열을 받을 거니깐 String*/) {//구현부
		name =n;
	}
	public void setAge(int a) {
		age =a ;
	}
	public void setData(String n ,int a ) {
		name =n ;
		age = a;
	}
	public void setData() {//-> 똑같은 메소드가 두개 생기는것을 overload setData 2개가 생김 하나는 n.a를 받고 하나는 비워있는 
		
	}
	
	
}//c-person






//---------------------------------------------
public class PersonMain {
//객체지향언어 쓰는 이유 1)중복 되는것을 피하기 위해서 cf) DB - aap 관점 지향
				// 2)결합성을 낮추기 위해서 


	public static void main(String[] args) {
	
//		int aa -> 실수형 변수
//		double aa ->실수형 변수
//		Person aa  -> 객체(클래스변수)
		Person aa;//객체
		aa =new Person();//메모리생성 cf)Scanner scan ; scan = new Scanner();
		System.out.println("객체 aa = "+aa); // syso(aa)는 데이터의 주소값을 출력 
		//name = "홍길동"; ->error//누구 안에 있는 이름을 말해줘야함 
		aa.setName ("홍길동");
		aa.setAge (25);
		
		System.out.println("이름은 "+aa.getName()+ "\t+ 나이는 " +aa.getAge());
		
		System.out.println();
		
		Person bb = new Person(); //각자 주인이 다르다일뿐 메뉴판은 하나임(메뉴판은 위에 class person 	
		System.out.println("객체 bb = "+bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println("이름은 "+bb.getName()+ "\t+ 나이는 " +bb.getAge()); 
		//클래스(person)는  하나지만 음식은 여러개 가능(aa,bb)
		Person cc = new Person();
		cc.setData("둘리",100);
		System.out.println("이름 = "+cc.getName()+ "\t+ 나이는 "+ cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		System.out.println("객체 dd = "+dd);
		dd.setData();
		System.out.println("이름 = "+dd.getName()+ "\t+ 나이는 "+ dd.getAge());
		System.out.println();
				}

}












package class_;

class This{
	private int a; //필드의 a; //이럼 This 클래스 밖에서 접근 불가능 예 class Thismain에서 new 못시킴 에러뜸 ->setter(입력:set.~~) getter(출력:get.!!) 메소들 만들어함
	
	public void setA/*a에 집어 넣을 거니깐*/(int a /*여기에 입력되는*/) {
		//a=a;//둘다 인수임 필드로 못나감->그래서 setA에 입력 된 값이 ....위에 필드로 입력 못함 필드 값에 입력한다 라는 의미로 앞에this를 써서 ...
		this.a=a;
	}
	
	public int getA() {
		System.out.println("this = "+this);
		return a;//this가 생략
	}
}
///////==========================================
public class ThisMain {

	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체 t = "+ t);
		t.setA(10);
		System.out.println(t.getA());
		System.out.println();
		This s  = new This();
		System.out.println("객체 s = "+ s);
		s.setA(20);
		System.out.println(s.getA());
	}

}

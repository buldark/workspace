package inhertance;

public class Sub extends Super/*상속 걸기*/{
	
	protected String name;
	protected int age;
	// sub의 필드의 값은 name /age + 부모의 키와 몸무게
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	public Sub(String name,int age , double weight,double height) {
		System.out.println("Sub 생성자");
		this.age =age;
		super.weight =weight;
		super.height=height; //super로 쓰면 sub것이 아닌 super것임을 보여줌
//		this.weight =weight;
//		this.height=height; 이것도 맞음 
	}
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 ="+ weight);
		System.out.println("키 = "+ height);
	}
	public static void main(String[] args) {
		Sub aa = new Sub("홍길동",25,70.5,182.3); //sub 참조했지만 만 했지만 부모값까지 다 뜸 
		aa.disp();//sub에는 없음 -> 부모super클래스에 있음 거기서 찾아서 씀!!
		System.out.println();
		aa.output();
		System.out.println("---------------");
		
		Super bb = new Sub("코난",13,35.6,152.7); //bb라는 애는 super를 참조한다는뜻  그래서 super안에서만 처리 가능 그래서 sub의 안에잇는 name age output은 못부름.
//		bb.output(); 에러뜸
		bb.disp();
	}

}

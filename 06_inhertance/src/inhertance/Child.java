package inhertance;

public class Child extends Super {
	protected String name;
	protected int age;
	public Child() {
		System.out.println("Child 기본 생성자");
	}
	public Child(String name,int age , double weight,double height) {
		super(weight,height); //무조건 첫번째 줄에 써야함....
		System.out.println("Child 생성자");
		
		this.name =name ;
		this.age =age;
		super.weight =weight;
		super.height=height;} //super로 쓰면 sub것이 아닌 super것임을 보여줌

		// TODO Auto-generated method stub
		
	
//		this.weight =weight;
//		this.height=height; 이것도 맞음 
		
		public void disp() {
			System.out.println("이름 = "+name);
			System.out.println("나이 = "+age);
			System.out.println("몸무게 ="+ weight);
			System.out.println("키 = "+ height);
		}
	
		
	public static void main(String[] args) {
	Child aa = new Child("홍길동",25,70.5,182.3); 
	aa.disp();
	System.out.println();
	System.out.println("----------------");
	
	Super  bb= new Child("코난",13,35.6,152.7);
	bb.disp();
	//aa.disp()와 bb.disp()의 결과는 같음  super로 잡더라도....오버라이드일 경우 무조건 자기자신 메소드 먼저 연산 즉 이경우 child의 disp()먼저 해서 결국...같아짐
	}
}

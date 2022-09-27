package constructor;
class Hello{
		private String name ;
		private int age;
		
		public Hello() { /*생성자에는 void쓰면 안됨 void 쓰면 생성자가 아닌 일반 함수가 되어버림...*/
			System.out.println("기본 생성자 ");
		}
		public Hello(String name) {
			this.name = name ; //필드값과 인수 구분을 위해
		}
		public Hello(int age) {
			this();//Overload된 다른 생성자를 호출 할 수 있다. 
			//this("코난");
			this.age = age;
		}
		
		//위에 Hello 오버로드임 /생성자들은 생성자들끼리 불러낼 수 있으ㅇ
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	
	
	
}

//=======================================================================
public class ConstructorMain {

	public static void main(String[] args) {
		Hello aa = new Hello();  
		System.out.println(aa.getName());
		System.out.println();
		
		Hello bb = new Hello("홍길동");
		
		System.out.println(bb.getName()+"\t"+aa.getAge());
		System.out.println();
		
		Hello cc = new Hello(25);
		
		System.out.println(cc.getName()+"\t"+cc.getAge());
		System.out.println();
	
	}

}

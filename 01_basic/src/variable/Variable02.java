package variable;

public class Variable02 {
	static int a ; // 필드, static이 붙어 있어 초기화 되어 있다  static이 붙이면 메모리에 잡혀(고정되어 들어가는)
	//int b; syso(Varialbe02.b) ->  에러
	int b; // new 시켜줘야함 ....static이 안붙어 있어서 ...

	public static void main(String[] args) {
		//int a ;// local variable (지역변수) , 쓰레기값-> 반드시 초기화(initialized) 해야 함
		int a = 5;
		System.out.println("지역변수 a ="+a);// 여기서 a 는 지역변수(가 먼저 잡힘....) 
		System.out.println("필드 a ="+ Variable02.a);//
		System.out.println("필드b="+ new Variable02().b);
	

	}

}

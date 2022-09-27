package method;

public class Method_02 {

	public void disp() {//구현 ->반드시 호출 필요!!
		System.out.println("non static method");	
		}

	public static void output() {//구현
		System.out.println("stativ mathod");
		
	}
	
	public static void main(String[] args) {
		
		//Method_02.output();//호출- Method_02라는 클래스의 output의 메소드를 호출 그런데 현재 지금 여기는 Method_02 구역내라서 굳이 Method_02를 쓸 필요 없음 
		output();
		
		//disp()- > 에러 뜸  static이 아니니간 new 시켜줘야 함 
		Method_02 m = new Method_02();
		m.disp(); // new는 메인 안에서 쓰는거
		
	}
}

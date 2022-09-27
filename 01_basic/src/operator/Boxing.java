package operator;

public class Boxing {

	public static void main(String[] args) {
	int a =25;
	//double b =a/3;//java는 정수형 정수형 연산이라 정수형 8이 나옴
	double b= (double)a /3 ; // Casting (강제형변환 : 이때만 잠깐 double 형)
	String c ="25";
	// int d = c; -> 오류 뜸 기본-기본끼리 객체는객체끼리 casting 가능 객제타입인 String은 기본형인 int로 casting 안되고 이떄 wrapper class가 와야함 
	 int d = Integer.parseInt(c); //auto boxing
	 
	 
	 int  e = 5;
	 Integer f = e ; //왼쪽은 객체형 오른쪽은 기본형이지만 오토박싱이 일어나서 오류가 안남 java 5이후
	 
	 /*예전에는 */Integer g = new Integer(e) ; //jdk 5.0 이하
	 
	 Integer h = 5;
	 int i =h ; // unautoboxing
	 //int j = h.intValue();//jdk 5.0이하...
	 
	
	}

}

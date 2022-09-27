package class_;
import java.util.Scanner;
public class ComputerMain {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		Computer[] com = new Computer[3]; //객체 배열을 생성 ,결합도 1 :1 관계  결합도 100퍼!! cf) Objec[] com = new Computer[3] -> 이러면 결합도가 낮아짐!! //클래스를 new 했다

		/*입력*/
		for(int i =0 ; i<com.length;i++) {
			com[i] = new Computer();
			System.out.println("x 입력 ");
			int x = scan.nextInt();
//			com[i].setData(scan.nextInt(),scan.nextInt());
			System.out.println("y 입력 : ");
			int y = scan.nextInt();
			com[i].setData(x, y);
			com[i].calc();
			System.out.println();


		}
		///*출력*
		System.out.println("x\ty\t합\t차\t곱\t나누기");
		for(int i =0 ; i<com.length;i++) {
			System.out.println(com[i]. getX()+"\t"+com[i].getY()+"\t"+com[i].getSum()+"\t"+com[i].getSub()+"\t"+com[i].getMul()+"\t"+com[i].getDiv());

		}

	} // for문 정렬  ctrl+i 누르면 자동으로 정렬!!

}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
      double div
메소드 : setX(~)
      setY(~)
      calc() - 합차곱몫을 계산
      getX()
      getY()
      getSum()
      getSub()
      getMul()
      getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/


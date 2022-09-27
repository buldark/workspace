package operator;

import java.util.Scanner;

public class Oprerator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //static이 없어서 new를 해줘야함 + import
		System.out.print("점수를 입력하시오 : ");
		int score = scan.nextInt();
		String result1 = score>=80 && score <=100 ? "합격" : "불합격";
		System.out.println(result1);
		
		//int score1 = 50;
		//score >=80 && score<=100 ? "합격" : "불합격";		이건 error 
		//System.out.println(score1 >=80 && score1<=100 ? "합격" : "불합격");
		//String result = score1 >=80 && score1<=100 ? "합격" : "불합격"; // 오른쪽이 문자열형이니깐 String을 붙여줘야지 에러가 안남
		//System.out.println(result);
	}

}

package class2;
import java.util.StringTokenizer;
public class Token {
	
	public static void main(String[] args) {
		String str = "학원,집 ,,게임방";
		
		
		StringTokenizer st = new StringTokenizer(str,","); //쉼표를 기준으로  str문자열을 분리시켜라 //공란은 표시 X
		System.out.println("토큰개수 = "+st.countTokens());
		
		while(st.hasMoreTokens())/*현재 위치에 토큰이 있냐 ...토큰이 있으면 true 없으면 false while문안에 true대신 함수를 사용해서 true false 사용 */ {
			System.out.println(st.nextToken()); //nextToken -> 토큰을 꺼내주고 다음 토큰으로 이동! 
			
		
			
		}
		System.out.println("---------------------------");
		
		String[] ar =str.split(","); //쉼표를 기준으로 나누고!! 공란도 표시!!! 
		for(String data : ar) {
			System.out.println(data);
		}
		
		
		
	}
}

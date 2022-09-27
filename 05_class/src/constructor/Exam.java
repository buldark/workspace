package constructor;
import java.util.Scanner;
public class Exam {
	
	private String name;
	private String dap;
	private char[] ox; //배열로 처리 해줘야함........ //이게 먼저 선언 
	private int score;
	private final String JUNG="11111";
	public Exam() {
		ox = new char[5];// -> 필드 에서 선언된것을 여기서 
		//char [] ox = new char[5] - >이럼 생성자 exam 안에서  만들어지고 끝남....아래에 compare에서 비교되는 ox는 필드에서 오는값인데 이럼 오류......		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = scan.next();
		this.name = name;
		System.out.println("답 입력: ");
		String dap = scan.next();
		this.dap =dap;
		
	}
	public void Compare() {
		    
		for(int i = 0 ; i<dap.length();i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i] = 'O';
				score+=20;
						
			}else ox[i]='x';
		}
//		if(dap.charAt(i)==JUNG.charAt(i)){
//			ox[0]='0';
//			else ox[0]='x;'
		}
			
			
	
	public String getName() {
		
		return name;		
	}
	
	public char[]/*배열값이 리턴이니깐 char가 아닌 char[]로!!*/ getOx(){
		return ox;
	}
	
	public int getScore() {
		return score;
	}	
	
}







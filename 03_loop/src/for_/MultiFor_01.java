package for_;

public class MultiFor_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =2 ; i<=4 ; i+=2) { //i=2 i=4 총 두번 돈다
			for(int j =1 ; j<=3 ; j++) { // j=1 j=2 j=3 번 돈다 i의 횟수*j의 횟수 =>총 6번 반복 
				System.out.println("i = " + i +" j = " +j);
			}//for j
			System.out.println();
		}//for i
	}

}

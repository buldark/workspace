package multi; //가변길이 - 왜냐면 과목수가 다르기에.... 입력 출력?
//변수로 잡으면 나중에 홍길동 다음에 이기자 데이터를 쓰면 홍길동 데이터가 날라가서 출력이 안됨
//그래서 배열로 잡아야 함 

//
import java.util.Scanner;
public class MultiArray_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원 수를 입력하세요 : ");
		int cnt  = scan.nextInt();//인원수입력 2: 베열보다 이거 먼저 해야 함 왜냐면 방이 몇개인지 잡아야 하니깐
		
		String [] name = new String[cnt]; // 그럼 방이 두개!!
		
		int subjectCnt;//출력 부분(결과)에 과목수는 출력이 안됨 그래서 과목수는 배열로 잡을 필요 가 없음
 
		String[][] subject = new String[cnt][];		//but 과목명은 출력부분에 나타남 // 과목 -> 성적 이차원 배열
		// 2차원 배열 / 행을 아는데(입력된 사람 수!! 열은 모름....그래서 뒤에 []는 비워둠?? 
		int[][] jumsu = new int[cnt][];//-> 성적도 출력 필요 변수가 아닌 이차원 배열 
		double[] avg = new double[cnt];//
		

//입력 , 계산 -for문을 통해서 -----------------------------------------------------------------
		for(int i =0;i<cnt;i++) {
			System.out.println("이름 입력 : ");
			name[i] =scan.next();
			System.out.println("과목수 입력 : ");
			subjectCnt = scan.nextInt();
			
			//과목명
			
			subject[i] =new String[subjectCnt];//<-과목명!! 과목명은 위에 과목수 만큼!! 
			
			for(int j = 0 ;j<subjectCnt;j++) {
				System.out.println("과목명 입력 : ");
				subject[i][j]=scan.next();
			}//for j1
			
			//점수[SubjectCnt(과목별점수 방) + 1(총점 방)]
			jumsu[i]= new int[subjectCnt+1]; // 과목별 점수 + 총점을 입력 위해 +1(총점방)
			for(int j = 0 ;j<subjectCnt;j++) {
				System.out.println(subject[i][j]+"점수 입력 : ");
				jumsu[i][j]=scan.nextInt();
				
				
				jumsu[i][subjectCnt]+= jumsu[i][j];//총점계산
				
			}//for j2 - j1은 j1에서 끝났으니 여기서 다시 j사용 가능 
			
			
			//평균
			avg[i]=(double)jumsu[i][subjectCnt]/subjectCnt;//(double 강제 cast )
			
			
			
			System.out.println("==========================================");
		}//for i
		
		
//출력--------------------------------------------------------
		for(int i  = 0 ;i<cnt;i++) {
			//제목
			System.out.print("이름\t");
			for(int j =0 ; j<subject[i].length;j++) {
				System.out.print(subject[i][j]+"\t");//과목명 출력
				
			}//for j
			System.out.println("총점 \t평균");
			
			
			//데이터
			System.out.print(name[i]+"\t");
			for (int j =0 ; j<jumsu[i].length;j++) {
				System.out.print(jumsu[i][j]+"\t");
			}//for j 
			
			System.out.println(avg[i]);
			System.out.println();
		}//fori
		
	}
		
}		
		
		
/*

인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균(실수)
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/

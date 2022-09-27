package class_;

public class PracticeMain {

	public static void main(String[] args) {
		Practice st1 = new Practice();
		st1.setData("홍길동" , 80, 90,0);
		st1.calc();
		
		System.out.println("---------------------------------------------");
		System.out.println("이름 \t수학\t영어 \t국어\t총점\t평균\t성적");
		
		System.out.println(st1.getName()+"\t"+st1.getMath()+"\t"+st1.getEng()+"\t"+st1.getKor()+"\t"+st1.getTot()+"\t"+st1.getAvg()+"\t"+st1.getGrade());
		System.out.println("---------------------------------------------");
	}

}

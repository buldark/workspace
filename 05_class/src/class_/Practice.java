package class_;

public class Practice {
	private String name ;
	private int kor , eng , math, tot;
	private double avg;
	private char grade;
	
	
	
	
	public void setData(String n , int k , int m , int e){
		name = n;
		kor=k;
		math=m;
		eng=e;
		}

	
	
	public void calc() {
		tot = kor + math + eng;
		avg = tot/3.0;
		if(avg>=90) { grade = 'a';}
		else if (avg>= 80) {grade ='b';}
		else if  (avg>= 70) {grade ='c';}
		else if(avg>= 60) {grade ='d';}
		else grade='f';
		
	}
	
	public String getName(){
		return  name;}
	public int getKor() {
		return kor;}
	public int getMath() {
		return math;}
	public int getEng() {
		return eng;}
	public int getTot() {
		return tot;}
	public String getAvg() {
		return String.format("%.2f",avg);}
	public char getGrade() {
		return grade;

	}
	
}

package class_;

public class Computer {
	private int x,y,sum,sub,mul; //필드
    private double div;
    
    public void calc() {
		this.sum = this.x+this.y;
		sub = x-y;
		mul = x*y;
		div =(double) x/y; //강제 변환!!! (double)
	}
    public void setData(int x ,int y) {
    	this.x = x;//필드값이랑 ()랑 구분이 안되니깐 앞에 필드값에 this붙여주기 
    	this.y=y;
    }
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
		
	}
	public int getSum() {
		return sum;
		
	}
	public int getSub() {
		return sub;
		
	}
	public int getMul() {
		return mul;
		
	}
	public String getDiv() {
		return String.format("%.2f",div);
		
	}






}






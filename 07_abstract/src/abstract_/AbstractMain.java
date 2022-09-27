package abstract_;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
	AbstractTest at = new AbstractMain(); //추상클래스는 절대 뉴할 수 없다!! 

	}

}

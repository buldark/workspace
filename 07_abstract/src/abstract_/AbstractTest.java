package abstract_;

public abstract class AbstractTest {//POJO형식 (plain old java object)
	protected/*또는 비워버리면 디폴트가 되어 버려서 같은 패키지 안에 있는 애들은 언제나 접근 가능*/ String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name);//추상으로 걸려 있음 
	
	
	}



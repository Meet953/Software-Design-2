import java.io.Serializable;

public class Info implements Serializable {
	
	private String name;
	private String type;
	
	public Info(String n, String t){
		setName(n);
		type=t;
	}
	
	public String readName(){return getName();}
	public String readType(){return type;}

	public void resetName(String n){
		setName(n);
	}
	
	public void resetType(String t){
		type = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

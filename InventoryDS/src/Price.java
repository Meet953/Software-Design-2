import java.io.Serializable;

public class Price implements Serializable{

	private int euro,cents;
	
 	public Price(int e,int c){
 		euro=e; cents=c;
 	}
 	
 	public String toString(){
 		return euro+"."+cents;
 	}
 	
 	public void reset(int e,int c){
 		euro=e; cents=c;
 	}
}

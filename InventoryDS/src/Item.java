import java.io.Serializable;

public class Item extends Info implements Serializable{

	private Price item_price;
	 
	public Item(String name, String type, int euro, int cents){
		super(name, type);
		item_price=new Price(euro,cents);
	}
	
	public String readPrice(){
		return item_price.toString();
	}
	
	public void resetItemPrice(int e,int c){
		item_price.reset(e,c);
	}
	
	public void print(){
		System.out.print("["+super.readName()+ " - "+ super.readType()+" :  "+ item_price.toString() + "]->");
	}
	
	public String toString(){
		return (super.readName()+ " - "+ super.readType()+" :  "+ item_price.toString() );
	}
}

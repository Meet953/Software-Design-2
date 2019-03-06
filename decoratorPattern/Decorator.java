public class Decorator extends Counter{

	protected Counter counter;
	
	public Decorator(Counter aa){
        super(aa);
        counter=aa;
       }

	
}
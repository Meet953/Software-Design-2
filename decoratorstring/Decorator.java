public class Decorator extends Display{

	protected Display display;
	
	public Decorator(Display aa){
        super(aa);
        display=aa;
       }

	
}

class LowerLine extends Decorator{

	public LowerLine(Display aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}

	public void print()
	{
		 
		display.print();
		 System.out.println("**********ll");
	}
	
}

class UpperLine extends Decorator{

	public UpperLine(Display aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}

	public void print()
	{ 
		 System.out.println("**********ul");
		display.print();
	}
	
}
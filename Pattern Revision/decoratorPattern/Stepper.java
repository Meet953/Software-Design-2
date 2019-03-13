package decoratorPattern;






public class Stepper {

	private int value;

	public Stepper()
	{
		value=0;}


	public Stepper(Stepper aa) {
		// TODO Auto-generated constructor stub
		value =aa.value;
	}


	public void stepUp(int amt)
	{
		value+=amt;
	}

	public void stepDown(int amt)
	{
		value-=amt;
	}

	public int readValue(){
		return   value;
	}
	
	 
	
}

package decoratorPattern;

public class Decorator extends Stepper {

	protected Stepper stepper;
	
	public Decorator(Stepper aa) {
		super();
		stepper = aa;
	}
}


class TraceStepper extends Decorator{

	public TraceStepper(Stepper aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}
	
	
	public void stepUp(int amt)
	{
		System.out.println("STEP UP PERFORMED");
		stepper.stepUp(amt);
		
		
	}

	public void stepDown(int amt)
	{
		System.out.println("STEP DOWN PERFORMED");
		stepper.stepDown(amt);
		
	}

	public int readValue(){
		return stepper.readValue();
	}
	
}


class LimitedStepper  extends Decorator{

	public LimitedStepper (Stepper aa) {
		super(aa);
		// TODO Auto-generated constructor stub
	}
	
	
	public void stepUp(int amt)
	{
		if(stepper.readValue() + amt > 100) {
			System.out.println("Error Not Allowed to Exceed 100");
		}
		else {
			stepper.stepUp(amt);
		}
		
	}

	public void stepDown(int amt)
	{
		if(stepper.readValue() - amt < 0) {
			System.out.println("Error Not Allowed to go below 0");
		}
		else {
			stepper.stepDown(amt);
		}
	}

	public int readValue(){
		return stepper.readValue();
	}
	
}
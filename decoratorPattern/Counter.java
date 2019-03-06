public class Counter {

	private int value;

	public Counter()
	{
		value=0;}


	public Counter(Counter aa) {
		// TODO Auto-generated constructor stub
		value = aa.value;
	}


	public void increment()
	{
		System.out.println("Main inc");
		value++;
	}

	public void decrement()
	{
		value--;
	}

	public int readValue(){
		return   value;
	}
}
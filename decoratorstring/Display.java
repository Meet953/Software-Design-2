


public class Display {

	private String name;

	public Display(String n)
	{
		name=n;}


	public Display(Display aa) {
		// TODO Auto-generated constructor stub
		name = aa.name;
	}


	public void update(String n)
	{
		name=n;
	}

	public void print()
	{
		System.out.println("Name="+name);
	}

}

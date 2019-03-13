package bookfactory;

abstract class Book {
	protected String title;
	protected String isbn;
	protected double  price;
	public Book(String t, String i, double p){
		title=t;
		isbn=i;
		price=p;
		}
	public void printDetails(){
		System.out.println("\nBook Details");
		System.out.println("============");
		System.out.println("Title: "+title);
		System.out.println("isbn: "+title);
		System.out.println("Price: "+price);
	}
	public void resetPrice(double p){price=p;}
    public double readPrice(){return price;}
    abstract public double readNetPrice();   
   }

  class StandardBook extends Book {

	public StandardBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double readNetPrice() {
		// TODO Auto-generated method stub
		return price+2.25;
	}

  }
  
 class HeavyBook extends Book  {

	public HeavyBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double readNetPrice() {
		// TODO Auto-generated method stub
		return price+3.25;
	}
	 
 }

  class BookFactory {

	public Book getBook(String title, String isbn, double p, int w) {
		// TODO Auto-generated method stub
		
		if(w<300)  
			return new StandardBook(title, isbn, p);
		 
		else
		return new HeavyBook(title, isbn, p);
	}

  }
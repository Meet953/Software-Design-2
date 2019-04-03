class Book extends Details{
	
	public Rule rules;
	public String author; 
	public Book next;
	public Book(int id, String name,String author, int time, String notes){
		super(id, name);
		this.author = author;
		rules=new Rule(time,notes);
	}

	
	public String readRule(){return rules.toString();}
	
	
	public void print(){
		System.out.println("["+super.readDetails()+ " Author : " + author  + " Rules : " +rules+"]->");
	}
}
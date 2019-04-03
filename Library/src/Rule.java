class Rule{
 	private int time;
 	private String notes;
 	public Rule(int t,String n){
 		time=t; notes=n;}
 	public String toString(){
 		return "Available for "+time+" days. Notes : "+notes;
 	}
 	public void reset(int t,String n){
 		time=t; notes=n;}
 	}
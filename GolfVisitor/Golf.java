package Golf;



import java.io.Serializable;


//package Ex15;
interface Visitor {	
	public void visit(Visitable v);
}


interface Visitable {
	public void accept(Visitor v);
}


public class Golf implements Visitable {
	private int holes_played, shots;
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public Golf()
	{
		this.holes_played = 0;
		this.shots = 0;
		}
	
	public void add_next_score(int score)
	{
		this.holes_played++;
		this.shots+=score;

	}

	public int read_score()
	{
		return   this.shots - (holes_played*3);
	}
	public int readShots()
	{
		return   this.shots;
	}
	
	
	
	public void setShots(int s)
	{
		this.shots=s;
	}
	
	public int readHolesPlayed()
	{
		return   this.holes_played;
	}
	
	public void setHolesPlayed(int s)
	{
		this.holes_played=s;
	}
	public void print_details()
	{
		System.out.println("\nPlayer Details");
		System.out.println("============");
		System.out.println("Holes Played:" + holes_played);
                System.out.println("Total Shots:" +  shots);
                System.out.println("Score:" +  read_score());
                System.out.println();
	}
}

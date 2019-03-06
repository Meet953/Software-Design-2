
interface Visitor {	
	public void visit(Visitable v);
}


interface Visitable {
	public void accept(Visitor v);
}




public class Match implements Visitable  {
	private String team1;
	private String team2;
	private int score1;
	private int score2;
	
	public void accept(Visitor v) {
		v.visit(this);
	}


	public Match()
	{
		this.setTeam1("City");
		this.setTeam2("United");}


	public void team1_score()
	{
		setScore1(getScore1() + 1);
	}

	public void team2_score()
	{
		setScore2(getScore2() + 1);
	}

        public int readTeam1Score(){return getScore1();}
        public int readTeam2Score(){return getScore2();}
        public void setTeam1Score(int s){setScore1(s);}
        public void setTeam2Score(int s){setScore2(s);}
	public void print_score(){
		System.out.println("\nScore:");
		System.out.println(""+getTeam1()+"\t"+getTeam2());
		System.out.println(" " +
				""+getScore1()+"\t "+getScore2());}


	public int getScore1() {
		return score1;
	}


	public void setScore1(int score1) {
		this.score1 = score1;
	}


	public int getScore2() {
		return score2;
	}


	public void setScore2(int score2) {
		this.score2 = score2;
	}


	public String getTeam1() {
		return team1;
	}


	public void setTeam1(String team1) {
		this.team1 = team1;
	}


	public String getTeam2() {
		return team2;
	}


	public void setTeam2(String team2) {
		this.team2 = team2;
	}
}

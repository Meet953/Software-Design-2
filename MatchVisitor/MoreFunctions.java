
public class MoreFunctions implements Visitor{

	private Match match;
	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		match = (Match) v;
	}

	public void restartMatch() {
		match.setScore1(0);match.setScore2(0);
	}
	
	public String readResult() {
		int s1 = match.getScore1();
		int s2 = match.getScore2();
		if(s1>s2) {
			return match.getTeam1() + " Winning";
		}
		else if(s2>s1) {
			return match.getTeam2()+ " Winning";
		}
		else {
			return "Draw";
		}
	}
}

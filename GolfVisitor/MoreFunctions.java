package Golf;

public class MoreFunctions implements Visitor{

	private Golf golf;
	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		golf = (Golf) v;
	}

	public void restartRound() {
		golf.setShots(0);golf.setHolesPlayed(0);
	}
	
	 
	 public int readHolesLeftToPlay()   {
		 return 9 - golf.readHolesPlayed();
	 }
}

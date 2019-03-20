
public class MoreFunctions implements Visitor {

	private Outing o;

	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		o = (Outing) v;
	}
	
	public void book() {
		o.count++;
	}
	
	public void reset() {
		o.count = 0;
	}
	
}

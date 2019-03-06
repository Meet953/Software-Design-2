class MoreFunctions implements Visitor{
	private Counter co;
	
	public void visit(Visitable a){co=(Counter)a;}
	
	public void increment(){
		int val=co.readValue();
		val++;
		co.setValue(val);
	}

	}

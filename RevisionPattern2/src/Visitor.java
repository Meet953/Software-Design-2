interface Visitor{         // In this Example MoreFunctions
	public void visit(Visitable v);
}


interface Visitable{      // In this Example Account
	public void accept(Visitor v);
}

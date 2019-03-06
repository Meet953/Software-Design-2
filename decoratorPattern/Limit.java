class  Limit10Counter extends Decorator {

	public Limit10Counter(Counter aa){super(aa);
    }

	public int readValue()
    { return counter.readValue(); }

	public void increment() {  
		System.out.println("Limit10 inc");
		if (counter.readValue() == 10){
        System.out.println("Exceeds UpperLimit");}
		else
			counter.increment();
	}
	
	public void decrement() {
		counter.decrement();
	}

	
}
  class  NoNegative extends Decorator {

		public NoNegative(Counter aa){super(aa);
	    }

		public int readValue()
	    { return counter.readValue(); }

		public void decrement() {     
			if (counter.readValue() == 0){
	        System.out.println("Already 0");}
			else
				counter.decrement();
		}
		
		public void increment() {
			System.out.println("NoNeg inc");
			counter.increment();
		}

		
	}
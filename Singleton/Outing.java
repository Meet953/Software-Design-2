	class Outing
	{
		
		private static Outing single;
		private static boolean created=  false;
		
		protected int count;
		protected int max;
		private Outing()
		{
			single = this;
			created = true;
			this.count = 0;
			this.max=20;
		}

		public static Outing getInstance() {
		
			if(!created) {
				single=new Outing();
			}
			return single;
		}
		
		public boolean cancel()
		{ if (count>0){
			this.count--;
			return true;}
		  else
		    return false;
		}
		
		public boolean add()
		{ if (count<max){
			this.count++;
			return true;}
		  else
		    return false;
		}
		public int readCount(){
			return count;
		}
		public int readMax(){
			return max;
		}
		public void print_details()
		{
			System.out.println();
			System.out.println("Outing Details:");
			System.out.println("Number on Outing: "+count);
		}
}
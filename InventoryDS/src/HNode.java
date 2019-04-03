
class HNode implements Iterator, Container{
	int key;
	Item item;
	  HNode next;
	  
	  static int l=0;
	private int index = 0; 
	  static HNode[] nodearr = new HNode[10];


	HNode(int k, Item it)
		{ key = k;
		  item = it;
		  next = null;  }
	
	HNode(){};
	
	public int readKey(){return key;}
 
	public Item readItem(){return item;}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return this;

	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < l){
            return true;
         }
         return false;

	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			return nodearr[index++];
		}
		return null;

	}
	
	
	
}
interface Iterator
{
    boolean hasNext();
    Object next();
}


interface Container
{
    Iterator iterator();
}

public class ItemCollection implements Container, Iterator {

	 private Item[] list;
    private int index;
    
    
    public ItemCollection(Item[] li) {
    list = li;	
    index = 0;
    }
    
    public String printList()
    {
    	StringBuffer sb = null ;
    	for(Item i : list) {
    		sb.append(i.toString());
    	}
    	return sb.toString();
         
    }
    
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		 
		return index<list.length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(this.hasNext()){
            return list[index++];
         }
         return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ItemCollection(list);
	}

}

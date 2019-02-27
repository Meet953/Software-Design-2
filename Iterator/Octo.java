




class Octo implements Container,Iterator
{
	
   // private int [] list;
    private int index =0;

    
    private int v1,v2,v3,v4,v5,v6,v7,v8;
    int length=8;
     
    public Octo(int[] li) { v1 = li[0]; v2 = li[1]; v3 = li[2];
                              v4 = li[3]; v5 = li[4]; v6 = li[5];
                              v7=li[6]; v8=li[7];
                              
    
                             	//list = li;
                             	 
    						}

    public String printList()
    {
        return "["+v1+","  +v2 + "," + v3 + "," + v4 +","+ v5+","+ v6+","+v7+","+v8+  "]";
    }
    public void gotoFirst() { index = 0; }
   
    public int[] toArray(){
    	return new int[]{v1,v2,v3,v4,v5,v6,v7,v8};
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//return index<list.length;
		return index<8;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		//int res=list[index++];
		//return res;
		
		int[] temp = this.toArray();
		return temp[index++];
		
	}   

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		//return new Octo(list);
		
		return new Octo(this.toArray()); 
	}



    
    
}

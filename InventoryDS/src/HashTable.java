

class HashTable{
	    public int hash(int id){ return id%20;}
	
        private HNode[] head=new HNode[20];
        
	    public  HashTable(){for(int i=0;i<20;i++)head[i]=null;}

		public  void insert(int k, Item it)
	        {      HNode temp =new HNode(k,it);
	        		HNode.nodearr[HNode.l]  = temp;
	        		HNode.l++;
	           
	        		int index=hash(k);
	               temp.next=head[index];
			       head[index]=temp;}


		int count =0 ;
		
		public int getCount() {
			return count;
		}
		public  HNode search(int k)
	        {     
			count =0;
			int index=hash(k);
			HNode temp=head[index];	 
			boolean found=false;
			while(temp!=null&&found==false) {
					count++;
				   if (temp.key==k){found=true; break;}
	               temp=temp.next;
	        }
            return temp;
            }

		public boolean delete(int k)
		{
			int index=hash(k);
			if(this.search(k)==null) {
				return false;
			}
			HNode temp=head[index];
			HNode remove=temp;
			if (temp.key==k){
				head[index]=temp.next;
			   }else {
				while(temp!=null&&temp.key!=k) {
				   remove=temp;
	               temp=temp.next;
				}	
				remove.next = temp.next;
			   }
			return true;
		}


   }


   
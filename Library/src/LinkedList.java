

class LinkedList{
        private Book head;
        
	    public  LinkedList(){head=null;}

		public  void insert(int id,String n,String a, int t, String no)
	        {      Book temp =new Book(id, n,a, t,no);
			       temp.next=head;
			       head=temp;
			}
       
	/*	public  Flight readFlight(int el)
        {      if (head==null|| this.count()<el)
        	                 return null;
			   Flight temp=head;
               int current=1;
               while(current!=el) {
                       current++;
                       temp=temp.next;}
               return temp; } */


		public  int count()
	        {      Book temp=head;
                   int res=0;
	               while(temp!=null) {
                          res++;
	                      temp=temp.next;}
	               
	               return res; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readDetails();
		             head = head.next;
		             return res;
             }
		
		
		public void delete_all()
	       {         head=null;
               }


	     public void printlist()
	                        {
		               Book temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }

	     public  String search(String search)
	        {    
				String str = " ";
				Book temp=head;
				while(temp!=null) {
	              if((temp.name).equals(search))
	              {
	            	str = "Book ID : " + temp.id + " Name : " + temp.name + "\n Author : " + temp.author + temp.rules + "\n";
	              }
	               temp=temp.next;
				}
				return str;              
	        }
	     
	     
	     void deleteNode(int position) 
	     { 
	         // If linked list is empty 
	         if (head == null) 
	             return; 
	   
	         // Store head node 
	         Book temp = head; 
	   
	         // If head needs to be removed 
	         if (position == 1) 
	         { 	
	             head = temp.next;   // Change head 
	             return; 
	         } 
	   
	         // Find previous node of the node to be deleted 
	         for (int i=2; temp!=null && i<position; i++) 
	             temp = temp.next; 
	   
	         // If position is more than number of ndoes 
	         if (temp == null || temp.next == null) 
	             return; 
	   
	         // Node temp->next is the node to be deleted 
	         // Store pointer to the next of node to be deleted 
	         Book next = temp.next.next; 
	   
	         temp.next = next;  // Unlink the deleted node from list 
	     } 
	     
	     public String getDetails()
         {
    Book temp=head;
   String res= "";
    while(temp!=null) {
        res += "Book ID : " + temp.id + " Name : " + temp.name + "\n Author : " + temp.author + temp.rules + "\n";  
        temp=temp.next;}
        
    return res;
     }
   }


   
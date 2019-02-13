import java.util.Iterator;
import java.util.Stack;



class ListFunctions{	
	
	public static void printlist(Stack<Node> list){
	    Node temp;
	    System.out.println("\nTOP\n");
	    int i=list.size()-1;
	    while(i>=0) {
	    	temp=(Node)list.get(i); i--;
	        temp.print();System.out.println();
	        }
	    }
	
	
	
	
   }


   
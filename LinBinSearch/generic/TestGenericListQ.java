import java.util.Scanner;

class GenericList<T extends Number & Comparable>{
	private T []   myList;
	private int elements;
	private int max;

	public GenericList(int max)
	    {this.max=max;elements=0;
	     myList=(T[])new Number[max];
	    }

	 public boolean    add(T el) { 
               if (elements==max)     return  false;
               else   { myList[elements]=el;
                        elements++;
                        return true; }
               }

	 
	 public T readElement(int i){
		    return myList[i];
	 }
	 
	 public T removeLast(){
		 if(elements > 0)
		 {
			 T res = myList[0];
			 myList[elements] = null;
				elements--;
				res = myList[elements];
				return res;
		 }
		return null;	
		
	 }

	 public void printElements(){
		
		 
		 for(int i=0;i<elements;i++) {
			 System.out.print("[");
			 System.out.print(myList[i] + "]->");
		 }
		 

		 }
	 
}


public class TestGenericListQ {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	GenericList<Integer> gl=new GenericList<Integer>(12);

	Integer value;

	int choice=0;
	while (choice!=5){
			System.out.println();
    	System.out.println("Menu:");
		System.out.println("1: Insert at Last Position");
		System.out.println("2: Read an Element");
		System.out.println("3: Print_list");
        System.out.println("4: Remove last Element");
		System.out.println("5: Exit \n");
		
		System.out.print("Enter Choice: ");
		choice =sc.nextInt();
		switch(choice){
			    case 1:	         
					System.out.print("Enter a Value: ");
					value =sc.nextInt();
                                 boolean res1=gl.add(value);
			         if (res1==false) {System.out.println("List is Full");}
				       break;
			    case 2:
					System.out.print("Enter an Index:: ");
					int index =sc.nextInt();
			         value=gl.readElement(index);
			         if (value==null){System.out.println("Error Invalid Index");}
			         else            { System.out.println("Value ["+ index+"] ="+value);}
				       break;

			    case 3:   gl.printElements();
				        break;

			    case 4:
			         value = gl.removeLast();
			         if (value==null){System.out.println("Error list empty");}
			         else            { System.out.println("Value removed ="+value);}
				       break;
		}
	}

}}

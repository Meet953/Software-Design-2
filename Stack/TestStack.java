
import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;



public class TestStack{

	public static void main(String[] args){

		Stack<Node> l=new Stack<Node>();
		Scanner sc = new Scanner(System.in);

		String name;
		int age;

		int choice=0;
		while (choice!=10){
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Print_Stack");
			System.out.println("4: Peek");
			System.out.println("9: Initialize");
			System.out.println("10: Exit \n");

			System.out.print("Please enter choice-->");
			choice =sc.nextInt();


			switch(choice){
			case 1:
				System.out.print("Enter Name:");
				name =sc.next();

				System.out.print("Enter Age:");
				age =sc.nextInt();

				l.push(new Node(name,age));
				break;
			case 2:
				if (l.isEmpty()) System.out.println("List Empty");
				else {
					Node d= l.pop();
					System.out.println(d.readname()+" deleted");
				     }
				break;

			case 3:   ListFunctions.printlist(l);
			          break;

			case 4:Node d= l.peek();
				System.out.println(d.readname()+" peeked");
					d.print();
				//   add code to peek first item & print out details
					
				break;


			case 9:  
				l.push(new Node("A",25));
				l.push(new Node("B",15));
				l.push(new Node("C",14));
				l.push(new Node("D",18));
				l.push(new Node("B",25));
				l.push(new Node("B",20));				

				break;     



			default:}
		}
	}
	
////////////////////////////////////////////////////////////////

}







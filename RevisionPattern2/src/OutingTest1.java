


import java.util.Scanner;




	public class OutingTest1{
	public static void main(String [] args)
	{	Scanner sc = new Scanner(System.in);
	    Outing ro = new Outing(5);
       
	    MoreFunctions mf=new MoreFunctions();
        ro.accept(mf);
		
        
        int choice = 1;
		while(choice!=5)
		{    System.out.println();
			 System.out.println("1.Book place");
			 System.out.println("2.Cancel");
			 System.out.println("3.Reset to 0");
			 System.out.println("4.Print details");
		     System.out.println("5.Exit");
				System.out.print("Please enter a value-->");
				choice =sc.nextInt();
			if(choice==1)
			{
			 
			 	mf.book();
			 	
			}
			else if(choice==2)
			{
				boolean res1=ro.cancel();
				if(res1==true){
					System.out.println("Cancelled successfully.");
							      }
				else  {
					System.out.println("Not Cancelled successfully.");
			      }
			}
			else if(choice==3)
			{

				mf.reset();
			}
			else if(choice==4)
			{
		        ro.print_details();

			}

		}  // end while
	}

	}
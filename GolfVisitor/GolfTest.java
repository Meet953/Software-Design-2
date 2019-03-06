package Golf;

//package Ex15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GolfTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Golf g = new Golf();
Scanner sc = new Scanner(System.in);
MoreFunctions mf = new MoreFunctions();
g.accept(mf);



		int choice = 1;

		while(choice!=6)
		{
		 System.out.println();
		 System.out.println("1.Add New Score");
		 System.out.println("2.Read Score");
		 System.out.println("3.Print Details");
                 System.out.println("4.Number of Holes Left to Play");
                 System.out.println("5.Restart Round");
		 System.out.println("6.Exit");



			System.out.print("Please enter a value-->");
			choice =sc.nextInt();
			if(choice==1)
			{	System.out.print("enter score for next hole-->");
			    int s =sc.nextInt();
				g.add_next_score(s);
			}

			else if(choice==2)
			{
			    System.out.println("Score="+g.read_score());

			}


			else if(choice==3)
			{
				g.print_details();
			}
			else if(choice==4)
			{
			     System.out.println("Left to Play="+mf.readHolesLeftToPlay());

			}


			else if(choice==5)
			{
				 mf.restartRound();
			}


		}  // end while



	}

	}



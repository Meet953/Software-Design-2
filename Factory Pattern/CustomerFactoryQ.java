import java.util.Scanner;

abstract class Customer {
	protected String name;
	protected int  age;
	protected double  price;
	public Customer(String n, int a,double p){
		name =n;
		age =a;
		price=p;}
	// missing abstract method
	 
	
	public void setNewPrice(double p){ price=p;}
	
	public abstract double readPrice();
}


class RegularCustomer extends Customer{

	public RegularCustomer(String n, int a, double p) {
		super(n, a, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double readPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}


class ChildCustomer extends Customer{

	public ChildCustomer(String n, int a, double p) {
		super(n, a, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double readPrice() {
		// TODO Auto-generated method stub
		
		return price*(1-0.5);
	}
	
}



 class CustomerFactory {

	public Customer getCustomer(String n, int a,double p) {
 		if (a<17)
 			return new ChildCustomer(n,a, p);
 		  

 		   else   return new RegularCustomer(n,a, p);
 		}
     }



public class CustomerFactoryQ{
public static void main(String[] args){
	             Scanner sc = new Scanner(System.in);
                 double origPrice=62.48;
                 CustomerFactory cfactory = new CustomerFactory();
                
          		System.out.print("Enter Name:");
         		String name =sc.next();            

         		System.out.print("Enter Age:");
        		int age =sc.nextInt();
        		System.out.print("Enter Gross Price:");
        		origPrice =sc.nextDouble();
                 Customer c = cfactory.getCustomer(name,age,origPrice);
                 int choice=1; double val=0;
                 while(choice!=4){
	               System.out.println("1: Enter New Price");
	               System.out.println("2: Read Net Price");
	               System.out.println("3: Enter New Customer Details:");	               
	               System.out.println("4: Exit");
	       		System.out.print("Please enter a value-->");
	    		choice =sc.nextInt();
	               switch(choice){
	                  case 1:
		            		System.out.print("Enter Price:");
		            		val =sc.nextDouble();
		                    
		                    
		                    c.setNewPrice(val); break;
	                  case 2:  double res=(double)c.readPrice();
		                       System.out.println("Price: "+res);
		                       break; 
	                  case 3:           		
	                	  System.out.print("Enter Name:");
	           		      name =sc.next();            
                          System.out.print("Enter Age:");
	        		      age =sc.nextInt();
	        		      System.out.print("Enter Gross Price:");
	        		      origPrice =sc.nextDouble();
	        		      c = cfactory.getCustomer(name,age,origPrice);
                              break;          
	               
	               }}}}

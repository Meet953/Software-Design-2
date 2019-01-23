
class Display2 implements Runnable{
	 
	public String name;
	public Display2(String nm){
		        name=nm;
	}     
      public void run(){
    	  //change method name to run
		for(int i=0; i<4;i++)
			 { System.out.println(name+": "+i);
			   try{ Thread.sleep(1000);}
		         catch(Exception e){}
		       }
      }
}  


public class RunInterface
{
public static void main(String[] args)
    {
            Display2 d1=new Display2("First");
            Display2 d2=new Display2("Second");
            
            Thread t1 = new Thread(d1);
            Thread t2 = new Thread(d2);
            
            t1.start();
            t2.start();
      }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class Counter2 extends Thread implements ActionListener {
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l=new JLabel();
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	Container content;
	private JButton b1=new JButton("Suspend");
	private JButton b2=new JButton("Resume");

	private boolean suspendFlag = false;
	
	Counter2(){
		counter=0;
		content=f1.getContentPane();
		l.setFont(fnt);
		l.setText("Counter:  "+0);
       	             f1.setLayout(new FlowLayout());
                          f1.setSize(192,150);f1.setResizable(false);
                          content.add(l)	;	
                          content.add(b1)	;
                          content.add(b2)	;	
                          b1.addActionListener(this);
                          b2.addActionListener(this);
                          f1.setVisible(true);
                          
                          }
	
	public void mySuspend() {
		suspendFlag = true;
	}
	
	public synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
	   
	public void actionPerformed(ActionEvent e){
		  Object target=e.getSource();
		  if (target == b1){   
			this.mySuspend();
			  
			  System.out.println("Test11");  }
		  if (target == b2){  
				this.myResume();
				System.out.println("Test22"); }
	  }

	   public void run(){
                          while(counter <100)
                         {          counter++;
                                    l.setFont(fnt);
                                    l.setText("Counter:    "+counter);
                                    try{Thread.sleep(1000);
                                    synchronized(this) {
                                        while(suspendFlag) {
                                                wait();     }
                                        
                                    }

                                    }
                                    catch(Exception e){}}
                    } }   
       
public class WaitNotify{
public static void main(String[] args)
{
                   Counter2 c=new Counter2();
                   c.start();}
}


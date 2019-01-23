import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class Counter extends Thread implements ActionListener {
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l=new JLabel();
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	Container content;
	private JButton b1=new JButton("Suspend");
	private JButton b2=new JButton("Resume");

	Counter(){
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
	
	   
	public void actionPerformed(ActionEvent e){
		  Object target=e.getSource();
		  if (target == b1){   
			this.suspend();
			  
			  System.out.println("Test1");  }
		  if (target == b2){  
				this.resume();
				System.out.println("Test2"); }
	  }

	   public void run(){
                          while(counter <100)
                         {          counter++;
                                    l.setFont(fnt);
                                    l.setText("Counter:    "+counter);
                                    try{Thread.sleep(1000);}
                                    catch(Exception e){}}
                    } }   
       
public class SuspendResume{
public static void main(String[] args)
{
                   Counter c=new Counter();
                   c.start();}
}


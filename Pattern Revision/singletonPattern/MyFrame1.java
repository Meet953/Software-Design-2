
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener{
	
	
	private static MyFrame1 single;
	private static boolean created=  false;

	public static MyFrame1 getInstance() {
		
		if(!created) {
			single=new MyFrame1();
		}
		return single;
	}
	
	
	private JLabel l0 = new JLabel("  Login Page  ");
	
	private JLabel l1=new JLabel("Enter Name");
	private JTextField t1=new JTextField();
	private JButton b1=new JButton("Login");
	private JButton b2=new JButton("Exit");
	private JPanel p1=new JPanel();
	
	public MyFrame1(){
		super("Main Window");
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(2,2));
		l0.setFont(f); l1.setFont(f);t1.setFont(f); b1.setFont(f);b2.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(b2);
		content.add(p1);
		b1.addActionListener(this);   b2.addActionListener(this);   
		setSize(250,200);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	 		     
	          		MyFrame2 f =new MyFrame2();
	          		f.setName(t1.getText());
	          		f.setVisible(true);
	          		this.setVisible(false);
	 	           }
	 	
	 	if (target==b2){
      		        System.exit(0);}
	 	
	 	
	             }
	 }


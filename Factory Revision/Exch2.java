import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exch2 extends JFrame implements ActionListener{
          private JLabel jlabel1=new JLabel("            Enter Name");
          private JLabel jlabel3=new JLabel("     Full Name");
          private JTextField jtextInput1 = new JTextField(16);
          private JTextField jtextRes = new JTextField(7);
          private JButton comp=new JButton("Compute");
          private JButton clear=new JButton("Clear");
          NameFactory cfactory = new NameFactory();
         private JPanel jp1=new JPanel();

        Container content;
        public Exch2(){super("Euro Converter");
    	content=getContentPane();
    	setSize(370,180);
    	content.setLayout(new FlowLayout());
    	jp1.setLayout(new GridLayout(3,2));

    	jp1.add(jlabel1);         jp1.add(jtextInput1);    	
    	jp1.add(comp);             jp1.add(clear);
    	jp1.add(jlabel3);         jp1.add(jtextRes); 
    	
        content.add(jp1);

    	comp.addActionListener(this);
    	clear.addActionListener(this);
    	setVisible(true);}
        
        public void actionPerformed(ActionEvent e){
            Object target = e.getSource();
            if (target==comp){
                  // int amt=Integer.parseInt(jtextInput2.getText());
                  Namer name = cfactory.getNamer(jtextInput1.getText());
             	jtextRes.setText(""+name.readFullName()); }
            else{
             	jtextInput1.setText("");

                  jtextRes.setText("");  }
              }

       public static void main(String[] args){
        	 Exch2 exc=new Exch2();
      			}
      }


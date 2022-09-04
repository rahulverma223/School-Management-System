/****************************************************************************
*******************************
Class			: WelcomeForm
Purpose			: USE FOR WELCOME FORM WITH RESPECT TO PROJECT.
Creation date		: 23/11/2021
Day & Time		: Saturday 
Written by		: Lakhan chaudhary
******************************************
**************************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WelcomeForm implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3;
	JButton b1;
	Font f1,f2,f3;
	ImageIcon image;
	WelcomeForm() //CONSTRUCTOR START
	{
		
		//JOptionPane.showMessageDialog(null,"WELCOME FORM");
		f = new JFrame("# WELCOME FORM #");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  CLOSE THE WINDOW
	   	f.setSize(1000, 650);// window size
		f.setLayout(null);
		f.setVisible(true);
		
		Container c=f.getContentPane();
		c.setBackground(Color.orange);
		
		ImageIcon image=new ImageIcon("Images/imag.PNG");
		l3=new JLabel("");
		l3.setBounds(120,200,750,350);
		l3.setIcon(image);
		f.add(l3);
		
		f1 = new Font("Times New Roman",Font.BOLD|Font.CENTER_BASELINE,25);
		f2 = new Font("Century Schoolbook",Font.BOLD,10);
		f3 = new Font("Elephant",Font.BOLD,40);
		
		l1 = new JLabel("HELLO WELCOME TO EVERYBODY");		
		l1.setBounds(250,40,515,30);				
		l1.setForeground(Color.BLUE);
		l1.setFont(f1);
		f.add(l1);
		
		l2 = new JLabel("All is Well ||All is Well ");
		l2.setBounds(550,80,200,15);				
		l2.setFont(f2);
		l2.setForeground(Color.black);
		f.add(l2);
		
		b1 = new JButton("SSMV");
		b1.setBounds(420,250,200,40);					
		b1.setFont(f3);
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.addActionListener(this);
		f.add(b1);
		
	}//CONSTRUCTOR CLOSE
	public void actionPerformed(ActionEvent ae) //ACTIONLISTENER OF METHOD 
	{
		try 
		{
			new LoginForm(); 
			f.setVisible(false);		
		}
		catch(Exception e) 
		{
			System.out.println("EXCEPTION OF actionPerformed() IN WelcomeFormClass = " + e.getMessage());
		}
	} //ACTIONLISTENER OF METHOD CLOSE

	public static void main(String args[])
	 {
		new WelcomeForm();
	 }
}



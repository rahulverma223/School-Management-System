/*****************************************************************
************************************
Class			: LoginForm
Purpose			: USE FOR USER NAME AND PASSWORD.
Creation date		: 3/02/2021
Written by		: Rahul Kumar
******************************************
*****************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm implements ActionListener
{
	JFrame f;
	JLabel label1, label2,l1,l2,l3, redColor, greenColor;
	TextField t1, t2;
	JButton b1,b2,b3;
	Font f1,f2,f3;
	ImageIcon image;
	
	LoginForm() //CONSTRUCTOR START
	{
		//JOptionPane.showMessageDialog(null,"LOGIN FORM");
		f = new JFrame("# LOGIN FORM #");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CLOSE THE WINDOW
		f.setSize(1010, 650);// window size
		f.setLayout(null);
		f.setVisible(true);
		
		ImageIcon image=new ImageIcon("Images/ima.PNG");
		l3=new JLabel("");
		l3.setBounds(450,50,650,500);
		l3.setIcon(image);
		f.add(l3);
		
		Container c=f.getContentPane();
		c.setBackground(Color.green);
		
		f1 = new Font("Century Schoolbook",Font.BOLD|Font.ITALIC|Font.CENTER_BASELINE,20);
		f2 = new Font("Century Schoolbook",Font.BOLD,10);
		f3 = new Font("Century Schoolbooki",Font.BOLD,16);
		
		label1 = new JLabel("STUDENT MANAGEMENT RECORD");
		label1.setBounds(100,20,515,30);				
		label1.setFont(f1);
		label1.setForeground(Color.red);
		f.add(label1);
		
		label2 = new JLabel("Work is|the worship");
		label2.setBounds(330,50,200,15);				
		label2.setFont(f2);
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setForeground(Color.BLUE);
		f.add(label2);
		
		l1 = new JLabel("USER NAME");
		l1.setBounds(120, 190, 120, 30);						
		l1.setForeground(Color.black);
		l1.setFont(f3);
		f.add(l1);
		
		l2 = new JLabel("PASSWORD");
		l2.setBounds(120, 250, 120, 30);		
		l2.setForeground(Color.black);
		l2.setFont(f3);
		f.add(l2);
		
		redColor = new JLabel();// use for validation
		redColor.setBounds(100,100,300,30);
		redColor.setForeground(Color.RED);
		f.add(redColor);
		
		greenColor = new JLabel();// use for validation
		greenColor.setBounds(100,100,300,30);				
		greenColor.setForeground(Color.BLUE);
		f.add(greenColor);
		
		b1 = new JButton("LOGIN");
		b1.setBounds(120, 400, 90, 35);					
		b1.addActionListener(this);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		f.add(b1);
		
		b2 = new JButton("RESET");
		b2.setBounds(230, 400, 90, 35);					
		b2.addActionListener(this);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		f.add(b2);
		
		b3 = new JButton("BACK");
		b3.setBounds(340, 400, 90, 35);					
		b3.addActionListener(this);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		f.add(b3);
		
		t1 = new TextField("student");
		t1.setBounds(250, 190, 180, 30);					
		t1.setFont(f3);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		f.add(t1);
		
		t2 = new TextField("");
		t2.setBounds(250, 250, 180, 30);					
		t2.setForeground(Color.black);
		t2.setEchoChar('*');// password symbol
		t2.setFont(f3);
		f.add(t2);
		
	}// END  CONSTRUCTOR
	
	public void actionPerformed(ActionEvent ae) 
	{
		try 
		{
			String loginButton = "LOGIN";
			String resetButton = "RESET";
			String backButton = "BACK";
			String s = ae.getActionCommand();
			if(loginButton.equals(s))
			{
				
				if(t1.getText().equals("")) 
				{
					redColor.setText("PLEASE ENTER  USERNAME!");
					greenColor.setText("");
				}
				else if(!(t1.getText().equals("student")))
				{
					redColor.setText("INVALID  USERNAME !");
					greenColor.setText("");
				}
				else if(t2.getText().equals("")) 
				{
					redColor.setText("PLEASE ENTER  PASSWORD!");
					greenColor.setText("");
				} 
				else if(!(t2.getText().equals("student")))
				{
					redColor.setText("INVALID  PASSWORD !");
					greenColor.setText("");
				}		
				else if(t2.getText().equals("student")||t2.getText().equals("student")) 
				{
					greenColor.setText("LOGINFORM SUCCESSFULLY"); 
					redColor.setText("");
					
					new MainForm(); 
					f.setVisible(false);
				}
				else 
				{
					redColor.setText("INVALID  USERNAME OR PASSWORD !!");
					greenColor.setText("");
				}
			}// end of main if
		
			if(resetButton.equals(s)) 
			{
				t1.setText("");
				t2.setText("");	
				redColor.setText("");
				greenColor.setText(""); 
			}
			if(backButton.equals(s)) 
			{
				new WelcomeForm();
				f.setVisible(false);
			}
		}// end of try block
		catch(Exception e) 
		{
			System.out.println("EXCEPTION OF actionPerformed() IN LoginFormClass = " + e.getMessage());
		}
	} // END OF ACTION METHOD
	
	public static void main(String args[])
 	{
		new LoginForm();
	}
}



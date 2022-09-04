/*****************************************************************
************************************
Class			: MainForm
Purpose			: USE FORE MAINTAIN STUDENT RECORD.
Creation date		: 10/02/2021
Written by		: Rahul Kumar
******************************************
*****************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class MainForm implements ActionListener
{
	JFrame f;
	JLabel 	label1,label2,l1,l2,l3,l4,la,lb,l5,label3,l6,l7,l8,label4,lc,ld,l9,le,lf,l10,l11,l12,
	l13,l14,l15,l16,lg,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,
	l28,l29,l30,l31,l32,l33,l34,l35,l36,label5,l37,l38,l39,l40;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,
	t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40;
	Choice c1,c2,c3,c4,c5,c6,c7;
	JButton b1,b2,b3,b4,b5,b6,b7;
	Font ff,fff;
	Connection con;
	PreparedStatement pstmt;
	ImageIcon saveImage,updateImage,resetImage,deleteImage,homeImage,backImage,searchImage;

	MainForm()
	{
		JOptionPane.showMessageDialog(null,"MainForm");
		f=new JFrame("# MAIN FORM #");
            		f.setSize(1360,720);// window size
             		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CALL WHEN CLOSE THE WINDOW
	
		saveImage = new ImageIcon("Images/saveImage.png");
		updateImage = new ImageIcon("Images/updateImage.png");
		resetImage = new ImageIcon("Images/resetImage.png");
		deleteImage = new ImageIcon("Images/deleteImage.png");
		homeImage = new ImageIcon("Images/homeImage.png");
		backImage = new ImageIcon("Images/backImage.png");
		searchImage = new ImageIcon("Images/searchImage.png");
	
		ff = new Font("Century Schoolbook",Font.BOLD,22);
		fff = new Font("Century Schoolbook",Font.BOLD,15);

		label1=new JLabel("@@@@@  STUDENT  RECORD  @@@@@");
		label1.setBounds(300,20,500,20);
		label1.setForeground(Color.RED);
		label1.setFont(ff);
		f.add(label1);
	
		label2=new JLabel("STUDENT PERSONAL DETAIL");
		label2.setBounds(20,55,250,20);
		label2.setForeground(Color.BLUE);
		label2.setFont(fff);
		f.add(label2);

		l1=new JLabel("Student Name*");
		l1.setBounds(20,80,100,20);
		f.add(l1);
	
		l2=new JLabel("Father's Name*");
		l2.setBounds(20,110,100,20);
		f.add(l2);
	
		l3=new JLabel("Mother's Name*");
		l3.setBounds(20,140,100,20);
		f.add(l3);	
	
		l4=new JLabel("Date of Birth*");
		l4.setBounds(20,170,100,20);
		f.add(l4);
	
		la=new JLabel("Gender*");
		la.setBounds(20,200,100,20);
		f.add(la);	
	
		lb=new JLabel("Category*");
		lb.setBounds(20,230,100,20);
		f.add(lb);	
	
		l5=new JLabel("Address*");
		l5.setBounds(20,270,100,20);
		f.add(l5);
	
		label3=new JLabel("STUDENT IDENTITY DETAIL");
		label3.setBounds(20,435,250,20);
		label3.setForeground(Color.BLUE);
		label3.setFont(fff);
		f.add(label3);
	
		l6=new JLabel("Mobile Number*");
		l6.setBounds(20,460,100,20);
		f.add(l6);
		
		l7=new JLabel("Aadhar Number*");
		l7.setBounds(20,490,100,20);
		f.add(l7);
	
		l8=new JLabel("Email ID*");
		l8.setBounds(20,520,100,20);
		f.add(l8);

		label4=new JLabel("STUDENT ACADAMIC DETAIL");
		label4.setBounds(400,55,250,20);
		label4.setForeground(Color.BLUE);
		label4.setFont(fff);
		f.add(label4);
	
		lc=new JLabel("10th Board*");
		lc.setBounds(300,80,70,20);
		f.add(lc);
		
		ld=new JLabel("10th Stream*");
		ld.setBounds(500,80,80,20);
		f.add(ld);	
	
		l9=new JLabel("College Name*");
		l9.setBounds(710,80,120,20);
		f.add(l9);	
			
		l10=new JLabel("10th MM*");
		l10.setBounds(300,110,70,20);
		f.add(l10);
		
		l11=new JLabel("Obt.Marks*");
		l11.setBounds(500,110,80,20);
		f.add(l11);
		
		l12=new JLabel("Marks in %*");
		l12.setBounds(710,110,80,20);
		f.add(l12);
	
		le=new JLabel("12th Board*");
		le.setBounds(300,140,70,20);
		f.add(le);	
		
		lf=new JLabel("12th Stream*");
		lf.setBounds(500,140,80,20);
		f.add(lf);
		
		l13=new JLabel("College Name*");
		l13.setBounds(710,140,120,20);
		f.add(l13);
		
		l14=new JLabel("12th MM*");
		l14.setBounds(300,170,70,20);
		f.add(l14);
		
		l15=new JLabel("Obt.Marks*");
		l15.setBounds(500,170,80,20);
		f.add(l15);
		
		l16=new JLabel("Mark in %*");
		l16.setBounds(710,170,80,20);
		f.add(l16);
		
		lg=new JLabel("B.C.A*");
		lg.setBounds(300,200,70,20);
		f.add(lg);
		
		l17=new JLabel("B.C.A.MM*");
		l17.setBounds(500,200,80,20);
		f.add(l17);
	
		l18=new JLabel("B.C.A.MNMM*");
		l18.setBounds(710,200,80,20);
		f.add(l18);
		
		l19=new JLabel("I Sem.MM*");
		l19.setBounds(300,230,80,20);
		f.add(l19);
		
		l20=new JLabel("I Sem.Obt.M*");
		l20.setBounds(500,230,80,20);
		f.add(l20);
		
		l21=new JLabel("Marks in %*");
		l21.setBounds(710,230,80,20);
		f.add(l21);
		
		l22=new JLabel("II Sem.MM*");
		l22.setBounds(300,260,80,20);
		f.add(l22);
		
		l23=new JLabel("II Sem.Obt.M*");
		l23.setBounds(500,260,80,20);
		f.add(l23);
		
		l24=new JLabel("Marks in %*");
		l24.setBounds(710,260,80,20);
		f.add(l24);	
		
		l25=new JLabel("III Sem.MM*");
		l25.setBounds(300,290,80,20);
		f.add(l25);
		
		l26=new JLabel("III Sem.Obt.M*");
		l26.setBounds(500,290,80,20);
		f.add(l26);
	
		l27=new JLabel("Marks in %*");
		l27.setBounds(710,290,80,20);
		f.add(l27);	
		
		l28=new JLabel("IV Sem.MM*");
		l28.setBounds(300,320,80,20);
		f.add(l28);
		
		l29=new JLabel("IV Sem.Obt.M");
		l29.setBounds(500,320,80,20);
		f.add(l29);
		
		l30=new JLabel("Marks in %*");
		l30.setBounds(710,320,80,20);
		f.add(l30);	
		
		l31=new JLabel("V Sem.MM*");
		l31.setBounds(300,350,80,20);
		f.add(l31);
		
		l32=new JLabel("V Sem.Obt.M*");
		l32.setBounds(500,350,80,20);
		f.add(l32);
		
		l33=new JLabel("Marks in %*");
		l33.setBounds(710,350,80,20);
		f.add(l33);	
		
		l34=new JLabel("VI Sem.MM*");
		l34.setBounds(300,380,80,20);
		f.add(l34);
		
		l35=new JLabel("VI Sem.Obt.M");
		l35.setBounds(500,380,80,20);
		f.add(l35);
		
		l36=new JLabel("Marks in %*");
		l36.setBounds(710,380,80,20);
		f.add(l36);
			
		label5=new JLabel("UNIVERSITY IDENTITY DETAIL");
		label5.setBounds(300,435,265,20);
		label5.setForeground(Color.BLUE);
		label5.setFont(fff);
		f.add(label5);
		
		l37=new JLabel("Registration No*");
		l37.setBounds(300,460,100,20);
		f.add(l37);
		
		l38=new JLabel("Roll Number*");
		l38.setBounds(300,490,100,20);
		f.add(l38);
		
		l39=new JLabel("Enrollment No*");
		l39.setBounds(300,520,100,20);
		f.add(l39);
		
		l40=new JLabel("Search by Roll No*");
		l40.setBounds(900,230,180,20);
		l40.setForeground(Color.BLUE);
		l40.setFont(fff);
		f.add(l40);
		
		b1=new JButton("SAVE",saveImage);
		b1.setBounds(900,450,125,40);
		b1.addActionListener(this);
		f.add(b1);
		
		b2=new JButton("UPDATE",updateImage);
		b2.setBounds(900,530,125,40);
		b2.addActionListener(this);
		f.add(b2);
		
		b3=new JButton("RESET",resetImage);
		b3.setBounds(1050,450,125,40);
		b3.addActionListener(this);
		f.add(b3);
		
		b4=new JButton("DELETE",deleteImage);
		b4.setBounds(1050,530,125,40);
		b4.addActionListener(this);
		f.add(b4);
		
		b5=new JButton("HOME",homeImage);
		b5.setBounds(1200,450,125,40);
		b5.addActionListener(this);
		f.add(b5);
		
		b6=new JButton("LOGOUT",backImage);
		b6.setBounds(1200,530,125,40);
		b6.addActionListener(this);
		f.add(b6);
		
		b7=new JButton("SEARCH",searchImage);
		b7.setBounds(1050,320,130,40);
		b7.addActionListener(this);
		f.add(b7);
		
		c1=new Choice();
		c1.add("Select Gender");
		c1.add("Male");
		c1.add("Female");
		c1.setBounds(120,200,120,20);
		f.add(c1);
		
		c2=new Choice();
		c2.add("Select Category");
		c2.add("General");
		c2.add("OBC");
		c2.add("SC");
		c2.add("ST");
		c2.setBounds(120,230,120,20);
		f.add(c2);	
	
		c3=new Choice();
		c3.add("Select Board");
		c3.add("UP Board");
		c3.add("CBSC Board");
		c3.setBounds(370,80,120,20);
		f.add(c3);
	
		c4=new Choice();
		c4.add("Select Stream");
		c4.add("Science");
		c4.add("Commerce");
		c4.add("Art");
		c4.setBounds(580,80,120,20);
		f.add(c4);	
		
		c5=new Choice();
		c5.add("Select Board");
		c5.add("UP Board");
		c5.add("CBSC Board");
		c5.setBounds(370,140,120,20);
		f.add(c5);
		
		c6=new Choice();
		c6.add("Select Stream");
		c6.add("Science");
		c6.add("Computer Science");
		c6.add("Commerce");
		c6.setBounds(580,140,120,20);
		f.add(c6);	
		
		c7=new Choice();
		c7.add("B.C.A");
		c7.add("I  year");
		c7.add("II year");
		c7.add("III year");
		c7.setBounds(370,200,120,20);
		f.add(c7);				
	
		/****** TextField  OF  PERSONAL  DETAIL******/
	
		t1=new JTextField("");
		t1.setBounds(120,80,120,20);
		f.add(t1);
	
		t2=new JTextField("");
		t2.setBounds(120,110,120,20);
		f.add(t2);
		
		t3=new JTextField("");
		t3.setBounds(120,140,120,20);
		f.add(t3);
		
		t4=new JTextField("");
		t4.setBounds(120,170,120,20);
		f.add(t4);
		
		t5=new JTextField("");
		t5.setBounds(120,260,150,40);
		f.add(t5);
		
		/****** TextField  OF  IDENTITY  DETAIL******/
		
		t6=new JTextField("");
		t6.setBounds(120,460,120,20);
		f.add(t6);
	
		t7=new JTextField("");
		t7.setBounds(120,490,120,20);
		f.add(t7);
			
		t8=new JTextField("");
		t8.setBounds(120,520,120,20);
		f.add(t8);
		
		/****** TextField  OF ACADAMIC  DETAIL******/
		
		t9=new JTextField("");
		t9.setBounds(800,80,120,20);
		f.add(t9);
		
		t10=new JTextField("");
		t10.setBounds(370,110,50,20);
		f.add(t10);
		
		t11=new JTextField("");
		t11.setBounds(580,110,50,20);
		f.add(t11);
		
		t12=new JTextField("");
		t12.setBounds(800,110,50,20);
		f.add(t12);
		
		t13=new JTextField("");
		t13.setBounds(800,140,120,20);
		f.add(t13);
		
		t14=new JTextField("");
		t14.setBounds(370,170,50,20);
		f.add(t14);
		
		t15=new JTextField("");
		t15.setBounds(580,170,50,20);
		f.add(t15);
		
		t16=new JTextField("");
		t16.setBounds(800,170,50,20);
		f.add(t16);
	
		t17=new JTextField("");
		t17.setBounds(580,200,50,20);
		f.add(t17);
	
		t18=new JTextField("");
		t18.setBounds(800,200,50,20);
		f.add(t18);
	
		t19=new JTextField("");
		t19.setBounds(370,230,50,20);
		f.add(t19);
	
		t20=new JTextField("");
		t20.setBounds(580,230,50,20);
		f.add(t20);
	
		t21=new JTextField("");
		t21.setBounds(800,230,50,20);
		f.add(t21);
		
		t22=new JTextField("");
		t22.setBounds(370,260,50,20);
		f.add(t22);
		
		t23=new JTextField("");
		t23.setBounds(580,260,50,20);
		f.add(t23);
	
		t24=new JTextField("");
		t24.setBounds(800,260,50,20);
		f.add(t24);
		
		t25=new JTextField("");
		t25.setBounds(370,290,50,20);
		f.add(t25);
		
		t26=new JTextField("");
		t26.setBounds(580,290,50,20);
		f.add(t26);
		
		t27=new JTextField("");
		t27.setBounds(800,290,50,20);
		f.add(t27);
		
		t28=new JTextField("");
		t28.setBounds(370,320,50,20);
		f.add(t28);
		
		t29=new JTextField("");
		t29.setBounds(580,320,50,20);
		f.add(t29);
	
		t30=new JTextField("");
		t30.setBounds(800,320,50,20);
		f.add(t30);
		
		t31=new JTextField("");
		t31.setBounds(370,350,50,20);
		f.add(t31);
			
		t32=new JTextField("");
		t32.setBounds(580,350,50,20);
		f.add(t32);
		
		t33=new JTextField("");
		t33.setBounds(800,350,50,20);
		f.add(t33);
		
		t34=new JTextField("");
		t34.setBounds(370,380,50,20);
		f.add(t34);
		
		t35=new JTextField("");
		t35.setBounds(580,380,50,20);
		f.add(t35);
		
		t36=new JTextField("");
		t36.setBounds(800,380,50,20);
		f.add(t36);
		
		/****** TextField  OF UNIVERSITY IDENTITY  DETAIL******/
		
		t37=new JTextField("");
		t37.setBounds(400,460,120,20);
		f.add(t37);
		
		t38=new JTextField("");
		t38.setBounds(400,490,120,20);
		f.add(t38);
		
		t39=new JTextField("");
		t39.setBounds(400,520,120,20);
		f.add(t39);
		
		t40=new JTextField("");
		t40.setBounds(1060,230,265,30);
		f.add(t40);
		
		/************************************* CODE FOR MS ACCESS DATA BASE CONNECTIVITY ***********************************/
		try 
		{
    			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");               
    			Connection con = DriverManager.getConnection("jdbc:odbc:yoyo");//source name
    			System.out.println("connection created");   
   		}
   		catch(Exception e) 
		{
    			System.out.println("connection is not created");
    			System.out.println("exception is = "+e.getMessage());
   		}
		
	 }//AND OF THE CONSTRUCTOR
	

	public void actionPerformed(ActionEvent ae) 
	{
	     	
		    String s = ae.getActionCommand();

			if(s.equals("SAVE"))
		              	 {
				if(t1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter Name");
				}
				else if(t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter FatherName");
				}
				else if(t3.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter MotherName");
				}
				else if(t4.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter Date of Birth");
				}
				else if(c1.getSelectedItem().equals("Select Gender"))
				{
					JOptionPane.showMessageDialog(null,"Plz Selected Gender");
				}
				else if(c2.getSelectedItem().equals("Select Category"))
				{
					JOptionPane.showMessageDialog(null,"Plz Selected Category");
				}				
				else if(t6.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter Mobile Number");
				}
				else if(t38.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter Roll Number ");
				}
				else if(t40.getText().equals("180981106008"))
				{
					JOptionPane.showMessageDialog(null,"data allready has been saved ");
				}
				else if(t40.getText().equals("180981106022"))
				{
					JOptionPane.showMessageDialog(null,"data allready has been saved ");
				}
				else if(t40.getText().equals("180981106031"))
				{
					JOptionPane.showMessageDialog(null,"data allready has been saved ");
				}
				else
				{
					saveAll();
				}

		            	}
			
			 if(s.equals("UPDATE"))
			{
				updateAll();
			}
			 if(s.equals("RESET"))
			{
				if(t40.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Data Could Not Reset");
				}
				else
				{
				resetAll();
				}
	
			}			
			 if(s.equals("DELETE"))
			{
				deleteAll();
			}
			 if(s.equals("HOME"))
			{
				JOptionPane.showMessageDialog(null, "home page");
				homePage();
			}
			 if(s.equals("LOGOUT"))
			{
				JOptionPane.showMessageDialog(null, "login page");
				loginPage();
			}
			
			 if(s.equals("SEARCH"))
			 {
				if(t40.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Plz enter Search Name");
				}
				else
				{
					searchAll();
				}	
			 }
				
	}// END OF actionPerformed() METHOD
	
	void saveAll()
	{
	        try
	       {		
			String str = "insert into Dush values			(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(str);
			
			String student="1";
			pstmt.setString(1,t1.getText());
			pstmt.setString(2,t2.getText());
			pstmt.setString(3,t3.getText());
			pstmt.setString(4,t4.getText());
			pstmt.setString(5,c1.getSelectedItem());
			pstmt.setString(6,c2.getSelectedItem());
			pstmt.setString(7,t5.getText());
			pstmt.setString(8,t6.getText());
			pstmt.setString(9,t7.getText());
			pstmt.setString(10,t8.getText());
			pstmt.setString(11,c3.getSelectedItem());
			pstmt.setString(12,c4.getSelectedItem());
			pstmt.setString(13,t9.getText());
			pstmt.setString(14,t10.getText());
			pstmt.setString(15,t11.getText());
			pstmt.setString(16,t12.getText());
			pstmt.setString(17,c5.getSelectedItem());
			pstmt.setString(18,c6.getSelectedItem());
			pstmt.setString(19,t13.getText());
			pstmt.setString(20,t14.getText());
			pstmt.setString(21,t15.getText());
			pstmt.setString(22,t16.getText());
			pstmt.setString(23,c7.getSelectedItem());
			pstmt.setString(24,t17.getText());
			pstmt.setString(25,t18.getText());
			pstmt.setString(26,t19.getText());
			pstmt.setString(27,t20.getText());
			pstmt.setString(28,t21.getText());
			pstmt.setString(29,t22.getText());
			pstmt.setString(30,t23.getText());
			pstmt.setString(31,t24.getText());
			pstmt.setString(32,t25.getText());
			pstmt.setString(33,t26.getText());
			pstmt.setString(34,t27.getText());
			pstmt.setString(35,t28.getText());
			pstmt.setString(36,t29.getText());
			pstmt.setString(37,t30.getText());
			pstmt.setString(38,t31.getText());
			pstmt.setString(39,t32.getText());
			pstmt.setString(40,t33.getText());
			pstmt.setString(41,t34.getText());
			pstmt.setString(42,t35.getText());
			pstmt.setString(43,t36.getText());
			pstmt.setString(44,t37.getText());
			pstmt.setString(45,t38.getText());
			pstmt.setString(46,t39.getText());
			pstmt.setString(47,student);
			
			int result = pstmt.executeUpdate();
			if(result==1)
			{
				JOptionPane.showMessageDialog(null, "DATA HAS BEEN SUCCESSFUULY SAVED");
				System.out.println("Data Successfully Saved");
				if(result==1)
				{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				c1.select("Select Gender");
				c2.select("Select Category");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				c3.select("Select Board");
				c4.select("Select Stream");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				c5.select("Select Board");
				c6.select("Select Stream");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				c7.select("B.C.A");
				t17.setText("");
				t18.setText("");
				t19.setText("");
				t20.setText("");
				t21.setText("");
				t22.setText("");
				t23.setText("");
				t24.setText("");
				t25.setText("");
				t26.setText("");
				t27.setText("");
				t28.setText("");
				t29.setText("");
				t30.setText("");
				t31.setText("");
				t32.setText("");
				t33.setText("");
				t34.setText("");
				t35.setText("");
				t36.setText("");
				t37.setText("");
				t38.setText("");
				t39.setText("");
			
				}

			}
			
			
	            }
		catch(Exception e) 
		{
			System.out.println("EXCEPTION OF actionPerformed() IN LoginFormClass = " + e.getMessage());
		}
	}// AND OF THE  saveAll() METHOD
	
	
	void updateAll()
	{
		try
		{	
			String search = t40.getText();
			
			//JOptionPane.showMessageDialog(null,search);
			
			String Name = t1.getText();
			String FatherName = t2.getText();
			String MotherName = t3.getText();
			String DOB = t4.getText();
			String Gender = c1.getSelectedItem();
			String Category = c2.getSelectedItem();
			String Address = t5.getText();
			String MobileNumber = t6.getText();
			String AadharNumber = t7.getText();
			String EmailID = t8.getText();
			String CollegeName = t9.getText();
			String RegistrationNumber = t37.getText();
			String RollNumber = t38.getText();
			String EnrollmentNumber = t39.getText();
			
			String query = "update Dush set Name='"+Name+"',FatherName='"+FatherName+"', MotherName='"+MotherName+"',DOB='"+DOB			+"',Gender='"+Gender+"',Category='"+Category+"',Address='"+Address+"', MobileNumber ='"+MobileNumber +"',AadharNumber ='"+ 			AadharNumber +"', EmailID ='"+EmailID +"',CollegeName ='"+CollegeName +"',RegistrationNumber ='"+RegistrationNumber  			+"',RollNumber ='"+RollNumber+"',EnrollmentNumber='"+EnrollmentNumber +"'where RollNumber='"+search+"'";
			
			pstmt = con.prepareStatement(query);
			
			int result = pstmt.executeUpdate();
			//JOptionPane.showMessageDialog(null,result);
			if(result==1)
			{
				JOptionPane.showMessageDialog(null, "DATA SUCCESSFUULY UPDATED");
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Data Could Not Update!!!");
				
			}
		}
		catch(Exception e) 
		{
			System.out.println("Exceptoin in updateAll() method = " +e.getMessage());
			System.out.println("Exceptoin in updateAll() method = " +e);
		}

	}// AND OF THE  updateAll() METHOD
	
	

	void resetAll()
	{
		try
		{	
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			c1.select("Select Gender");
			c2.select("Select Category");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			c3.select("Select Board");
			c4.select("Select Stream");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t12.setText("");
			c5.select("Select Board");
			c6.select("Select Stream");
			t13.setText("");
			t14.setText("");
			t15.setText("");
			t16.setText("");
			c7.select("B.C.A");
			t17.setText("");
			t18.setText("");
			t19.setText("");
			t20.setText("");
			t21.setText("");
			t22.setText("");
			t23.setText("");
			t24.setText("");
			t25.setText("");
			t26.setText("");
			t27.setText("");
			t28.setText("");
			t29.setText("");
			t30.setText("");
			t31.setText("");
			t32.setText("");
			t33.setText("");
			t34.setText("");
			t35.setText("");
			t36.setText("");
			t37.setText("");
			t38.setText("");
			t39.setText("");
			t40.setText("");
			
		}
		catch(Exception e) {
			System.out.println("Exceptoin in resetAll() method = " +e.getMessage());
			System.out.println("Exceptoin in resetAll() method = " +e);
		}
	}// AND OF THE  resetAll() METHOD
		
	void deleteAll()
	{
		try
		{
			String search = t40.getText();
			
			//JOptionPane.showMessageDialog(null,search);
			String query = "update Dush set student='0' where RollNumber='"+search+"'";
			//String query = "delete from Dush where Name='"+search+"'";
			
			pstmt = con.prepareStatement(query);
			
			int result = pstmt.executeUpdate();
			//JOptionPane.showMessageDialog(null,result);
			if(result==1)
			{
				JOptionPane.showMessageDialog(null,"Data Successfully Deleted");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				c1.select("Select Gender");
				c2.select("Select Category");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				c3.select("Select Board");
				c4.select("Select Stream");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				c5.select("Select Board");
				c6.select("Select Stream");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				c7.select("B.C.A");
				t17.setText("");
				t18.setText("");
				t19.setText("");
				t20.setText("");
				t21.setText("");
				t22.setText("");
				t23.setText("");
				t24.setText("");
				t25.setText("");
				t26.setText("");
				t27.setText("");
				t28.setText("");
				t29.setText("");
				t30.setText("");
				t31.setText("");
				t32.setText("");
				t33.setText("");
				t34.setText("");
				t35.setText("");
				t36.setText("");
				t37.setText("");
				t38.setText("");
				t39.setText("");
				t40.setText("");
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Data Could Not Delete!!!");	
			}
		}
		catch(Exception e)
		{
			System.out.println("Exceptoin in deleteAll() method = " +e.getMessage());
			System.out.println("Exceptoin in deleteAll() method = " +e);
		}
	}// AND OF THE  deleteAll() METHOD
	
	void homePage()
	{
		try
		{	
			new WelcomeForm();
			f.setVisible(false);
		}
		catch(Exception e) {
			System.out.println("Exceptoin in homePage() method = " +e.getMessage());
			System.out.println("Exceptoin in homePage() method = " +e);
		}
	}// AND OF THE  homePage() METHOD

	void loginPage()
	{
		try
		{	
			new LoginForm();
			f.setVisible(false);
		}
		catch(Exception e) {
			System.out.println("Exceptoin in homePage() method = " +e.getMessage());
			System.out.println("Exceptoin in homePage() method = " +e);
		}
	}// AND OF THE  loginPage() METHOD
		

	void searchAll()
	{
		try
		{	
			String search = t40.getText();
			
			JOptionPane.showMessageDialog(null,search);
			Statement st = con.createStatement();
                
			String query = "select * from Dush where RollNumber='"+search+"'and student='1'";
			ResultSet rs = st.executeQuery(query);

			 boolean recordfound = rs.next();
			JOptionPane.showMessageDialog(null,recordfound);
			if(recordfound)
			{
				t1.setText(rs.getString("Name"));
				t2.setText(rs.getString("FatherName"));
				t3.setText(rs.getString("MotherName"));
				t4.setText(rs.getString("DOB"));
				c1.select(rs.getString("Gender"));
				c2.select(rs.getString("Category"));
				t5.setText(rs.getString("Address"));
				t6.setText(rs.getString("MobileNumber"));
				t7.setText(rs.getString("AadharNumber"));
				t8.setText(rs.getString("EmailID"));
				c3.select(rs.getString("10thBoard"));
				c4.select(rs.getString("10thStream"));
				t9.setText(rs.getString("CollegeName"));
				t10.setText(rs.getString("10thMM"));
				t11.setText(rs.getString("10thObtMM"));
				t12.setText(rs.getString("10thMarks%"));
				c5.select(rs.getString("12thBoard"));
				c6.select(rs.getString("12thStream"));
				t13.setText(rs.getString("12thCollegeName"));
				t14.setText(rs.getString("12thMM"));
				t15.setText(rs.getString("12thObtMM"));
				t16.setText(rs.getString("12thMarks%"));
				c7.select(rs.getString("BCA"));
				t17.setText(rs.getString("BCAMM"));
				t18.setText(rs.getString("BCANMMM"));
				t19.setText(rs.getString("1semMM"));
				t20.setText(rs.getString("1semObtMarks"));
				t21.setText(rs.getString("1sem%"));
				t22.setText(rs.getString("2semMM"));
				t23.setText(rs.getString("2semObtMarks"));
				t24.setText(rs.getString("2sem%"));
				t25.setText(rs.getString("3semMM"));
				t26.setText(rs.getString("3semObtMarks"));
				t27.setText(rs.getString("3sem%"));
				t28.setText(rs.getString("4semMM"));
				t29.setText(rs.getString("4semObtMarks"));
				t30.setText(rs.getString("4sem%"));
				t31.setText(rs.getString("5semMM"));
				t32.setText(rs.getString("5semObtMarks"));
				t33.setText(rs.getString("5sem%"));
				t34.setText(rs.getString("6semMM"));
				t35.setText(rs.getString("6semObtMarks"));
				t36.setText(rs.getString("6sem%"));
				t37.setText(rs.getString("RegistrationNumber"));
				t38.setText(rs.getString("RollNumber"));
				t39.setText(rs.getString("EnrollmentNumber"));
					
			}
			
		}
		catch(Exception e) {
			System.out.println("Exceptoin in searchAll() method = " +e.getMessage());
			System.out.println("Exceptoin in resetAll() method = " +e);
		}
	}// AND OF THE  searchAll() METHOD	
	
	public static void main(String args[])
	{
         		new MainForm();
        	 }
  } // END OF MAIN CLASS	
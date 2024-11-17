package assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 implements ActionListener {
	JFrame frame1;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JTextField firstname;
	JTextField lastname;
	JTextField username;
	JComboBox lecturetype;
	JTextField password;
	JPanel panel;
	JButton submmit;
	JButton back;
	Form2(){
		frame1 = new JFrame();
		frame1.setBounds(200,100,1000,600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.getContentPane().setBackground(Color.CYAN );
		frame1.setVisible(true); 
		panel = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		firstname = new JTextField();
		lastname = new JTextField();
		username = new JTextField();
		password = new JTextField();
		submmit = new JButton();
		back = new JButton(); 
		
		String course[] = {"python","c++","java","database","alcorithem"};
		lecturetype = new JComboBox(course);
		lecturetype.setBounds(750,30,200,40);
		
		panel.setBounds(0,150,1000,300);
		panel.setBackground(Color.BLUE);
		panel.setLayout(null);
		
		l1.setText("First Name: ");
		l1.setFont(new Font("sarif",Font.BOLD,20));
		l1.setForeground(Color.CYAN);
		l1.setBounds(100,30,150,50);
		
		l2.setText("Last Name: ");
		l2.setFont(new Font("sarif",Font.BOLD,20));
		l2.setForeground(Color.CYAN);
		l2.setBounds(100,90,150,50);
		
		l3.setText("Username:  ");
		l3.setFont(new Font("sarif",Font.BOLD,20));
		l3.setForeground(Color.CYAN);
		l3.setBounds(100,150,150,50);
		
		firstname.setBounds(250,30,200,40);
		lastname.setBounds(250,90,200,40);
		username.setBounds(250,150,200,40);
		
		l4.setText("Lecture Type:");
		l4.setFont(new Font("sarif",Font.BOLD,20));
		l4.setForeground(Color.CYAN);
		l4.setBounds(500,30,150,50);
		
		l5.setText("Password:  ");
		l5.setFont(new Font("sarif",Font.BOLD,20));
		l5.setForeground(Color.CYAN);
		l5.setBounds(500,90,150,50);
		
		
		password.setBounds(750,90,200,40);
		
		submmit.setText("Submmit");
		submmit.setBounds(450,210,200,40);
		submmit.addActionListener(this);
		
		back.setText(" << Back");
		back.setBounds(20,500,200,40);
		back.addActionListener(this);
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(firstname);
		panel.add(lastname);
		panel.add(username);
		panel.add(lecturetype);
		panel.add(password);
		panel.add(submmit);
		frame1.add(back);
		frame1.add(panel);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			frame1.dispose();
			Login1 backwindow = new Login1();
		}
		else if(e.getSource() == submmit) {
			
			String fname = firstname.getText().toString();
			String lname = lastname.getText().toString();
			String uname = username.getText().toString();
			String subject = lecturetype.getSelectedItem().toString();
			String psword = password.getText().toString();
			
			
			JFrame f = new JFrame();
			int x = JOptionPane.showConfirmDialog(f,"are you sure?");
			if(x == JOptionPane.YES_OPTION) {
				TextSetup2 ts = new TextSetup2();
				ts.main(fname,lname,uname,subject,psword);
				
				frame1.dispose();
				Login2 backwindow = new Login2();
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		}

	}
}


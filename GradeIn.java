package assignment2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GradeIn implements ActionListener {
	JFrame frame;
	JTextField name,username,quiz,tast,assignment,mid,fina;
	JComboBox subjct;
	JLabel name1,username1,subject1,quiz1,tast1,assignment1,mid1,fina1;
	JButton submmit;
	GradeIn() {
		frame = new JFrame();
		frame.setBounds(410,100,790,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.setVisible(true);
		name = new JTextField();
		username = new JTextField();
		quiz = new JTextField();
		tast = new JTextField();
		assignment = new JTextField();
		mid = new JTextField();
		fina = new JTextField();
		
		
		name1 = new JLabel();
		username1 = new JLabel();
		quiz1 = new JLabel();
		tast1 = new JLabel();
		assignment1 = new JLabel();
		mid1 = new JLabel();
		fina1 = new JLabel();
		subject1 = new JLabel();
		
		submmit = new JButton("Submmit");
		
		String[] subjects = {"Python","Applid-I", "Chamistry","Physices","Civic","English-I","Emerging Technology","Applid-II","Logic","c++",
							"Drawing","English-II","Electrical circuit-I","Applid-III","Fundamental of EE","DSA","Geography","OOP","Database",
							"Algorithm","Discrit Maths","Signal","History"};
		subjct = new JComboBox (subjects);
		
		
		name1.setText("Name");
		username1.setText("Username");
		quiz1.setText("Quiz");
		tast1.setText("Tast");
		assignment1.setText("Assignment");
		mid1.setText("Mid");
		fina1.setText("Final ");
		subject1.setText("Subject ");
		name1.setBounds(50,50,60,30);
		username1.setBounds(240,50,60,30);
		subject1.setBounds(430,50,60,30);
		quiz1.setBounds(200,130,100,30);
		tast1.setBounds(200,200,100,30);
		assignment1.setBounds(200,280,100,30);
		mid1.setBounds(200,360,100,30);
		fina1.setBounds(200,440,100,30);
		
		name.setBounds(120,50,100,30);
		username.setBounds(310,50,100,30);
		subjct.setBounds(500,50,100,30);
		quiz.setBounds(300,130,100,30);
		tast.setBounds(300,200,100,30);
		assignment.setBounds(300,280,100,30);
		mid.setBounds(300,360,100,30);
		fina.setBounds(300,440,100,30);
		
		submmit.setBounds(400,500,100,30);
		submmit.addActionListener(this);
		
		frame.add(name1);
		frame.add(name);
		frame.add(username);
		frame.add(username1);
		frame.add(subjct);
		frame.add(subject1);
		frame.add(quiz);
		frame.add(quiz1);
		frame.add(tast);
		frame.add(tast1);
		frame.add(assignment1);
		frame.add(assignment);
		frame.add(mid);
		frame.add(mid1);
		frame.add(fina);
		frame.add(fina1);
		frame.add(submmit);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submmit) {
			
			String nm = name.getText().toString();
			String assig = assignment.getText().toString();
			String uname = username.getText().toString();
			String qz = quiz.getText().toString();
			String tst = tast.getText().toString();
			String md = mid.getText().toString();
			String fn = fina.getText().toString();
			String subjc = subjct.getSelectedItem().toString();
			
			
			TextSetup3 ts = new TextSetup3();
			ts.main(nm,uname,subjc,qz,tst,assig,md,fn);
			
			frame.dispose();
			GradeIn recall = new GradeIn();
		}
	}

}

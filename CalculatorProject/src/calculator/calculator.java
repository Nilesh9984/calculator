package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton Buttonadd = new JButton();
	JButton Buttonsub = new JButton();
	JButton Buttonmul = new JButton();
	JButton Buttondiv = new JButton();
	JButton Buttonclear = new JButton();
	
	JButton Buttondot = new JButton();
	JButton Buttonequal = new JButton();
	
	double number1,number2,result;
	int addc=0,mulc=0,divc=0,subc=0;
	private Object color;
	
	public calculator()
	{
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Nilesh Singh");
		
		//frame.setResizable(false);
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder (Color.RED,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button1.png"));
		
		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button2.png"));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button3.png"));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button4.png"));
		
		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button5.png"));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button6.png"));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button7.png"));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button8.png"));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button9.png"));
		
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Button0.png"));   
		
		Buttondot.setPreferredSize(new Dimension(100,40));
		Buttondot.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttondot.png"));
		
		Buttonsub.setPreferredSize(new Dimension(100,40));
		Buttonsub.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttonsub.png"));
		
		Buttonmul.setPreferredSize(new Dimension(100,40));
		Buttonmul.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttonmul.png"));
		
		Buttonadd.setPreferredSize(new Dimension(100,40));
		Buttonadd.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttonadd.png"));
		
		Buttonequal.setPreferredSize(new Dimension(100,40));
		Buttonequal.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttonequal.png"));

		Buttonclear.setPreferredSize(new Dimension(100,40));
		Buttonclear.setIcon(new ImageIcon("C:\\Users\\Thakur\\Downloads\\Number Icon\\Buttonclear.png"));
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(Buttondot);
		panel.add(Buttonsub);
		panel.add(Buttonmul);
		panel.add(Buttondiv);
		panel.add(Buttonadd);
		panel.add(Buttonequal);
		panel.add(Buttonclear);
		
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		Buttondot.addActionListener((ActionListener) this);
		Buttonadd.addActionListener((ActionListener) this);
		Buttonsub.addActionListener((ActionListener) this);
		Buttonmul.addActionListener((ActionListener) this);
		Buttondiv.addActionListener((ActionListener) this);
		Buttonclear.addActionListener((ActionListener) this);
		Buttonequal.addActionListener((ActionListener) this);
	}



	public void actionPerformed(ActionEvent e)
	{
		Object source = new e.getSource();
		if(source==Buttonclear)
		{
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		
		if(source==button1)
		{
			textarea.append("1");
		}
		if(source==button2)
		{
			textarea.append("2");
		}
		if(source==button3)
		{
			textarea.append("3");
		}
		if(source==button4)
		{
			textarea.append("4");
		}
		if(source==button5)
		{
			textarea.append("5");
		}
		if(source==button6)
		{
			textarea.append("6");
		}
		if(source==button7)
		{
			textarea.append("7");
		}
		if(source==button8)
		{
			textarea.append("8");
		}
		if(source==button9)
		{
			textarea.append("9");
		}
		if(source==button0)
		{
			textarea.append("0");
		}
		if(source==Buttondot)
		{
			textarea.append(".");
		}
		if(source==Buttonadd)
		{
			number1= number_reader();
			textarea.setText("+");
			addc=1;
			divc=0;
			subc=0;
			mulc=0;
			
		}
		if(source==Buttondiv)
		{
			number1= number_reader();
			textarea.setText("");
			addc=0;
			divc=1;
			subc=0;
			mulc=0;
		}
		
		if(source==Buttonsub)
		{
			number1= number_reader();
			textarea.setText("+");
			addc=0;
			divc=0;
			subc=1;
			mulc=0;
			
		}
		if(source==Buttonmul)
		{
			number1= number_reader();
			textarea.setText("+");
			addc=0;
			divc=0;
			subc=0;
			mulc=1;
			
		}
		if(source==Buttonequal)
		{
			number2= number_reader();
			if(addc>0) {
				result=number1+number2;
				textarea.setText(Double.toString(result));
			}
			if(subc>0) {
				result=number1-number2;
				textarea.setText(Double.toString(result));
			}
			if(mulc>0) {
				result=number1*number2;
				textarea.setText(Double.toString(result));
			}
			if(divc>0) {
				result=number1/number2;
				textarea.setText(Double.toString(result));
			}
			
			
		}
	}
	
	public double number_reader()
	{
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
}

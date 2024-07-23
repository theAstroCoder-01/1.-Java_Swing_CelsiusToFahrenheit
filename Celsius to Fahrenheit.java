package FahrenheitToCelciusGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class mainApp extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel label1, label2, label3, label4;
	private JButton button1, button2, button3, button4;
	private JTextField textField1, textField2;
	
	public mainApp() {
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Temperature Converter || The_Astro_Coder");
		
		label1 = new JLabel("TEMPERATURE CONVERTER");
		label1.setBounds(18, 5, 300, 30);
		label1.setFont(new Font("Calibri", 1, 20));
		label1.setForeground(new Color(0, 0, 0));
		add(label1);
		
		label2 = new JLabel("Celsius");
		label2.setBounds(18, 50, 200, 30);
		label2.setFont(new Font("Calibri", 2, 15));
		label2.setForeground(new Color(0, 0, 0));
		add(label2);
		
		label3 = new JLabel("Fahrenheit");
		label3.setBounds(18, 150, 200, 30);
		label3.setFont(new Font("Calibri", 2, 15));
		label3.setForeground(new Color(0, 0, 0));
		add(label3);
		
		label4 = new JLabel("The_Astro_Coder");
		label4.setBounds(150,300,200,30);
		label4.setFont(new Font("Calibri", 2, 12));
		label4.setForeground(new Color(0, 0, 0));
		add(label4);
		
		textField1 = new JTextField();
		textField1.setBounds(75, 50, 200, 25);
		textField1.setBackground(new Color(224,224,224));
		textField1.setFont(new Font("Calibri", 1, 14));
		textField1.setForeground(new Color(0,0,0));
		add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(97, 150, 180, 25);
		textField2.setBackground(new Color(224,224,224));
		textField2.setFont(new Font("Calibri", 1, 14));
		textField2.setForeground(new Color(0,0,0));
		add(textField2);
		
		button1 = new JButton("Convert Cº to Fº");
		button1.setBounds(13, 75, 266, 30);
		button1.setBackground(new Color(224,224,224));
		button1.setFont(new Font("Calibri", 1, 14));
		button1.setForeground(new Color(0,0,0));
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Convert C to F
				String cText = textField1.getText(); 
				double c = Double.parseDouble(cText); 
				double f = (c * 9 / 5) + 32; 
				textField2.setText(String.valueOf(f));
				
			}
			
		});
		
		add(button1);
		
		button2 = new JButton("Convert Fº to Cº");
		button2.setBounds(13, 175, 266, 30);
		button2.setBackground(new Color(224,224,224));
		button2.setFont(new Font("Calibri", 1, 14));
		button2.setForeground(new Color(0,0,0));
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Convert F to C
				 String fText = textField2.getText(); 
				 double f = Double.parseDouble(fText); 
				 double c = (f - 32) * 5 / 9; 
				 textField1.setText(String.valueOf(c));
				
			}
			
		});
		
		add(button2);
		
		button3 = new JButton("EXIT");
		button3.setBounds(287, 250, 100, 30);
		button3.setBackground(new Color(255,255,255));
		button3.setFont(new Font("Calibri", 1, 14));
		button3.setForeground(new Color(0, 0, 0));
		
		button3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		});
		
		add(button3);
		
		button4 = new JButton("Clear");
		button4.setBounds(15, 250, 100, 30);
		button4.setBackground(new Color(255,255,255));
		button4.setFont(new Font("Calibri", 1, 14));
		button4.setForeground(new Color(0, 0, 0));
		
		button4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//this command will erase the written data.
				textField1.setText("");
				textField2.setText("");
			}

		});
		
		add(button4);
	}
	
	public static void main(String[] args) {
		
		mainApp main = new mainApp();
		main.setBounds(0, 0, 400, 350);
		main.setResizable(false);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

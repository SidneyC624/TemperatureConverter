import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TemperatureConverter implements ActionListener{
	
	JFrame frame;
	JLabel cLabel;
	JLabel fLabel;
	JTextField cTextField;
	JTextField fTextField;
	JButton cTofButton;
	JButton fTocButton;
	
	TemperatureConverter() {
		
		frame = new JFrame("Temperature Converter");
		cLabel = new JLabel("Celsius");
		fLabel = new JLabel("Fahrenheit");
		cTextField = new JTextField();
		fTextField = new JTextField();
		cTofButton = new JButton("Convert C to F");
		fTocButton = new JButton("Convert F to C");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		cLabel.setBounds(0,0,200,25);
		cLabel.setForeground(new Color(50,0,75));
		cLabel.setOpaque(false);
		cLabel.setHorizontalAlignment(JTextField.CENTER);
		cLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		cTextField.setBounds(25,25,150,25);
		cTextField.setBorder(BorderFactory.createBevelBorder(1));
		cTextField.setFont(new Font("Ink Free", Font.PLAIN, 15));
		
		fLabel.setBounds(0,75,200,25);
		fLabel.setForeground(new Color(50,0,75));
		fLabel.setOpaque(false);
		fLabel.setHorizontalAlignment(JTextField.CENTER);
		fLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		fTextField.setBounds(25,100,150,25);
		fTextField.setBorder(BorderFactory.createBevelBorder(1));
		fTextField.setFont(new Font("Ink Free", Font.PLAIN, 15));
		
		fLabel.setBounds(0,75,200,25);
		fLabel.setForeground(new Color(50,0,75));
		fLabel.setOpaque(false);
		fLabel.setHorizontalAlignment(JTextField.CENTER);
		fLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		cTofButton.setBounds(25,160,150,30);
		cTofButton.setFont(new Font("MV Boli", Font.PLAIN, 15));
		cTofButton.setFocusable(false);
		cTofButton.addActionListener(this);
		
		fTocButton.setBounds(25,200,150,30);
		fTocButton.setFont(new Font("MV Boli", Font.PLAIN, 15));
		fTocButton.setFocusable(false);
		fTocButton.addActionListener(this);
		
		frame.add(cLabel);
		frame.add(cTextField);
		frame.add(fLabel);
		frame.add(fTextField);
		frame.add(cTofButton);
		frame.add(fTocButton);
		
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cTofButton) {
			Double celsius = Double.parseDouble(cTextField.getText());
			Double fahrenheit = (celsius * 9/5) + 32;
			fTextField.setText(String.valueOf(fahrenheit));
		}
		
		if(e.getSource() == fTocButton) {
			Double fahrenheit = Double.parseDouble(fTextField.getText());
			Double celsius = (fahrenheit - 32) * 5/9;
			cTextField.setText(String.valueOf(celsius));
		}
		
	}

}

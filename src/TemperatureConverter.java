import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TemperatureConverter implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel cLabel;
	JLabel fLabel;
	JTextField cTextField;
	JTextField fTextField;
	JButton cTofButton;
	JButton fTocButton;
	
	TemperatureConverter() {
		
		frame = new JFrame("Temperature Converter");
		panel = new JPanel();
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
		
		panel.setBounds(0,0,180,220);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		cLabel.setSize(180,25);
		cLabel.setForeground(new Color(50,0,75));
		cLabel.setOpaque(false);
		cLabel.setHorizontalAlignment(JTextField.CENTER);
		cLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		cTextField.setBorder(BorderFactory.createBevelBorder(1));
		cTextField.setFont(new Font("Ink Free", Font.PLAIN, 15));
		
		fLabel.setForeground(new Color(50,0,75));
		fLabel.setOpaque(false);
		fLabel.setHorizontalAlignment(JTextField.CENTER);
		fLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		fTextField.setBorder(BorderFactory.createBevelBorder(1));
		fTextField.setFont(new Font("Ink Free", Font.PLAIN, 15));
		
		fLabel.setForeground(new Color(50,0,75));
		fLabel.setOpaque(false);
		fLabel.setHorizontalAlignment(JTextField.CENTER);
		fLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		
		cTofButton.setFont(new Font("MV Boli", Font.PLAIN, 15));
		cTofButton.setFocusable(false);
		cTofButton.addActionListener(this);
		
		fTocButton.setFont(new Font("MV Boli", Font.PLAIN, 15));
		fTocButton.setFocusable(false);
		fTocButton.addActionListener(this);
		
		panel.add(cLabel);
		panel.add(cTextField);
		panel.add(Box.createVerticalStrut(10));
		panel.add(fLabel);
		panel.add(fTextField);
		panel.add(Box.createVerticalStrut(10));
		panel.add(cTofButton);
		panel.add(Box.createVerticalStrut(10));
		panel.add(fTocButton);
		
		frame.add(panel);
		
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

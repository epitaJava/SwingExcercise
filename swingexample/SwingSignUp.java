package swingexercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingSignUp {
	
	JFrame f = new JFrame("Registeration Form");
	SwingSignUp(){
		JLabel name, email, phone_number, password;
		final JTextField namefield = new JTextField();
		final JTextField emailfield = new JTextField();
		final JTextField phonenumberfield = new JTextField();
		JPasswordField passwordfield = new JPasswordField();
		
		name = new JLabel("Enter Name:");
		name.setBounds(50, 50, 100, 30);
		namefield.setBounds(160, 50, 100, 30);
		
		email = new JLabel("Enter Mail Id:");
		email.setBounds(50, 100, 100, 30);
		emailfield.setBounds(160, 100, 100, 30);
		
		phone_number = new JLabel("Enter Telephone:");
		phone_number.setBounds(50, 150, 100, 30);
		phonenumberfield.setBounds(160, 150, 100, 30);
		
		password = new JLabel("Enter password:");
		password.setBounds(50, 200, 100, 30);
		passwordfield.setBounds(160, 200, 100, 30);
		
		JButton b = new JButton("Register");
		b.setBounds(100, 300, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "Registered");
			
			}
			});
		
		
		f.add(name);
		f.add(email);
		f.add(phone_number);
		f.add(password);
		f.add(namefield);
		f.add(emailfield);
		f.add(phonenumberfield);
		f.add(passwordfield);
		f.add(b);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new SwingSignUp();

	}

}

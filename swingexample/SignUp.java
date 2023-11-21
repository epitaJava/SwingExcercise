package studentTab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	JFrame f = new JFrame("Signup");

	SignUp() {
		JLabel firstname, lastname, email, password;
		final JTextField firstnamefield = new JTextField();
		final JTextField lastnamefield = new JTextField();
		final JTextField emailfield = new JTextField();
		JPasswordField passwordfield = new JPasswordField();
		
		firstname = new JLabel("First Name");
		// objectname.setBounds(x axis, y axis, width, height)
		firstname.setBounds(50, 50, 100, 30);
		firstnamefield.setBounds(140, 50, 100, 30);
		
		lastname = new JLabel("Last Name");
		// objectname.setBounds(x axis, y axis, width, height)
		lastname.setBounds(50, 100, 100, 30);
		lastnamefield.setBounds(140, 100, 100, 30);

		email = new JLabel("Email");
		// objectname.setBounds(x axis, y axis, width, height)
		email.setBounds(50, 150, 100, 30);
		emailfield.setBounds(140, 150, 130, 30);
		
		password = new JLabel("Password");
		// objectname.setBounds(x axis, y axis, width, height)
		password.setBounds(50, 200, 100, 30);
		passwordfield.setBounds(140, 200, 100, 30);
		
		JButton b = new JButton("Register");
		b.setBounds(100, 300, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "Registered");
			
			}
			});
		
		f.add(firstname);
		f.add(lastname);
		f.add(email);
		f.add(password);
		f.add(firstnamefield);
		f.add(lastnamefield);
		f.add(emailfield);
		f.add(passwordfield);
		f.add(b);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new SignUp();
	}
}

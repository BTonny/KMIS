package com.ooad.kmis;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;


	Connection con;
	PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		Connect();
	}
	
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KMIS");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel.setBounds(205, 21, 111, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(130, 77, 265, 176);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(21, 58, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(21, 87, 61, 16);
		panel.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(94, 53, 130, 26);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String userName = txtUsername.getText();
                String password = String.valueOf(txtPassword.getPassword());
                
                try {
                	//prepared statement
                	pst = con.prepareStatement("");
                } catch(SQLException sqle) {}
			}
		});
		btnNewButton.setBounds(71, 124, 117, 29);
		panel.add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(94, 82, 130, 26);
		panel.add(txtPassword);
	}
}

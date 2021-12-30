//package com.ooad.kmis;
//
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.JPasswordField;
//import java.awt.FlowLayout;
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import java.awt.GridBagLayout;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import javax.swing.SwingConstants;
//
//public class LoginPanel extends JPanel {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JTextField textField;
//	private JPasswordField passwordField;
//
//	/**
//	 * Create the panel.
//	 */
//	public LoginPanel() {
//        this.setPreferredSize(new Dimension(800, 450));
//        this.setBackground(new Color(0x008000));
//        
//        JPanel panel = new JPanel();
//        panel.setBorder(null);
//        
//        JLabel lblNewLabel_1 = new JLabel("Username");
//        lblNewLabel_1.setBounds(21, 58, 61, 16);
//        lblNewLabel_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//        
//        JLabel lblNewLabel_1_1 = new JLabel("Password");
//        lblNewLabel_1_1.setBounds(21, 87, 61, 16);
//        lblNewLabel_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//        
//        textField = new JTextField();
//        textField.setBounds(94, 53, 195, 26);
//        textField.setColumns(10);
//        
//        JButton btnLogin = new JButton("Login");
//        btnLogin.setBounds(144, 111, 100, 29);
//        
//        passwordField = new JPasswordField();
//        passwordField.setBounds(94, 82, 195, 26);
//        GroupLayout groupLayout = new GroupLayout(this);
//        groupLayout.setHorizontalGroup(
//        	groupLayout.createParallelGroup(Alignment.LEADING)
//        		.addGroup(groupLayout.createSequentialGroup()
//        			.addGap(100)
//        			.addComponent(panel, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
//        			.addGap(100))
//        );
//        groupLayout.setVerticalGroup(
//        	groupLayout.createParallelGroup(Alignment.LEADING)
//        		.addGroup(groupLayout.createSequentialGroup()
//        			.addGap(100)
//        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 151, Short.MAX_VALUE)
//        			.addGap(125))
//        );
//        panel.setLayout(null);
//        panel.add(lblNewLabel_1);
//        panel.add(textField);
//        panel.add(lblNewLabel_1_1);
//        panel.add(passwordField);
//        panel.add(btnLogin);
//        setLayout(groupLayout);
//
//	}
//}

//package com.ooad.kmis;
//
//import java.awt.EventQueue;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//
//import com.ooad.kmis.auth.Login;
//
//public class Main {
//
//	private JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main window = new Main();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	Connection con;
//	PreparedStatement pst;
//	ResultSet rs;
//
//	public void Connect() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");
//		} catch (ClassNotFoundException e) {
//			JOptionPane.showMessageDialog(Main.this, "Failed to locate JDBC Driver");
//		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(Main.this, "Failed to connect to database");
//		}
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public Main() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}

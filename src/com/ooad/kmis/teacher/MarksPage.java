package com.ooad.kmis.teacher;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MarksPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String name = "Marks";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTable table;
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");
		} catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(MarksPage.this, "Failed to locate JDBC Driver");
		} catch (SQLException e) {
            JOptionPane.showMessageDialog(MarksPage.this, "Failed to connect to database");
		}
	}

	/**
	 * Create the panel.
	 */
	public MarksPage() {
		Connect();
        this.setPreferredSize(new Dimension(800, 450));
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(60, 179, 113));
        panel.setBounds(0, 0, 800, 33);
        add(panel);
        
        JButton btnRegisterStudents = new JButton("Register Students");
        btnRegisterStudents.setForeground(Color.BLACK);
        btnRegisterStudents.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
        panel.add(btnRegisterStudents);
        
        JButton btnSearchStudent = new JButton("Search students");
        btnSearchStudent.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
        panel.add(btnSearchStudent);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(30, 51, 741, 375);
        add(tabbedPane);
        
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("P1", null, panel_1, null);
        
        JScrollPane scrollPane = new JScrollPane();
        panel_1.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("P2", null, panel_2, null);
        
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("P3", null, panel_3, null);
        
        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("P4", null, panel_4, null);
        
        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("P5", null, panel_5, null);
        
        JPanel panel_6 = new JPanel();
        tabbedPane.addTab("P6", null, panel_6, null);
        
        JPanel panel_7 = new JPanel();
        tabbedPane.addTab("P7", null, panel_7, null);

	}
}

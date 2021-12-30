package com.ooad.kmis.teacher;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class MarksPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String name = "Marks";

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	String searchTerm;
	Calendar cal = Calendar.getInstance();
	int currentYear = cal.get(Calendar.YEAR);
	
	String subject = "English";
	String year = String.valueOf(currentYear);
	String term = "1";

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

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 51, 741, 375);
		add(tabbedPane);

		JPanel panel_1 = new ClassMarkPanel("P1");
		tabbedPane.addTab("P1", null, panel_1, null);
		panel_1.setLayout(null);

		JPanel panel_2 = new ClassMarkPanel("P2");
		tabbedPane.addTab("P2", null, panel_2, null);

		JPanel panel_3 = new ClassMarkPanel("P3");
		tabbedPane.addTab("P3", null, panel_3, null);

		JPanel panel_4 = new ClassMarkPanel("P4");
		tabbedPane.addTab("P4", null, panel_4, null);

		JPanel panel_5 = new ClassMarkPanel("P5");
		tabbedPane.addTab("P5", null, panel_5, null);

		JPanel panel_6 = new ClassMarkPanel("P6");
		tabbedPane.addTab("P6", null, panel_6, null);

		JPanel panel_7 = new ClassMarkPanel("P7");
		tabbedPane.addTab("P7", null, panel_7, null);

		JLabel lblNewLabel = new JLabel("Subject:");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 45, 44, 16);
		add(lblNewLabel);

		JLabel txtSubject = new JLabel(""+subject);
		txtSubject.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		txtSubject.setBounds(54, 45, 85, 16);
		add(txtSubject);

	}
}

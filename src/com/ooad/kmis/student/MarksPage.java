package com.ooad.kmis.student;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MarksPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String name = "marks";
	private static Student student;
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
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
	public MarksPage(Student st) {
		student = st;
		Connect();
        this.setPreferredSize(new Dimension(800, 450));
        setLayout(null);
        
        try {
			pst = con.prepareStatement("SELECT * FROM english WHERE reg_no = ? and year = ? and term = ?");
	        pst.setString(1, student.registrationNo);
	        pst.setString(1, "2021");
	        pst.setString(1, "1");

			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(296, 78, 481, 294);
        add(panel_1);
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(113, 48, 19, 183);
        panel_1.add(separator);
        
        JLabel lblEnglish = new JLabel("English");
        lblEnglish.setBounds(21, 55, 111, 16);
        panel_1.add(lblEnglish);
        
        JLabel lblLastName_1 = new JLabel("Social Studies");
        lblLastName_1.setBounds(21, 86, 111, 16);
        panel_1.add(lblLastName_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Mathematics");
        lblNewLabel_1_1.setBounds(21, 114, 111, 16);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Science");
        lblNewLabel_1_1_1.setBounds(21, 142, 111, 16);
        panel_1.add(lblNewLabel_1_1_1);
        
        JLabel txtEnglishBOT = new JLabel("<dynamic>");
        txtEnglishBOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtEnglishBOT.setBounds(144, 55, 67, 16);
        panel_1.add(txtEnglishBOT);
        
        JLabel txtSstBOT = new JLabel("<dynamic>");
        txtSstBOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtSstBOT.setBounds(144, 86, 67, 16);
        panel_1.add(txtSstBOT);
        
        JLabel txtMathBOT = new JLabel("<dynamic>");
        txtMathBOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtMathBOT.setBounds(144, 114, 67, 16);
        panel_1.add(txtMathBOT);
        
        JLabel txtScienceBOT = new JLabel("bot");
        txtScienceBOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtScienceBOT.setBounds(144, 142, 67, 16);
        panel_1.add(txtScienceBOT);
        
        JButton btnRefreshMarks = new JButton("Reload Marks");
        btnRefreshMarks.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
        btnRefreshMarks.setBounds(92, 259, 119, 29);
        panel_1.add(btnRefreshMarks);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBounds(223, 48, 19, 183);
        panel_1.add(separator_1);
        
        JLabel txtEnglishMOT = new JLabel("<dynamic>");
        txtEnglishMOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtEnglishMOT.setBounds(254, 55, 67, 16);
        panel_1.add(txtEnglishMOT);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setOrientation(SwingConstants.VERTICAL);
        separator_1_1.setBounds(333, 48, 19, 183);
        panel_1.add(separator_1_1);
        
        JLabel txtEnglishEOT = new JLabel("<dynamic>");
        txtEnglishEOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtEnglishEOT.setBounds(364, 55, 67, 16);
        panel_1.add(txtEnglishEOT);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(21, 37, 433, 16);
        panel_1.add(separator_2);
        
        JLabel lblBot = new JLabel("BOT");
        lblBot.setBounds(131, 20, 86, 16);
        panel_1.add(lblBot);
        
        JLabel lblMidTerm = new JLabel("Mid Term");
        lblMidTerm.setBounds(235, 20, 86, 16);
        panel_1.add(lblMidTerm);
        
        JLabel lblEndOfTerm = new JLabel("End of Term");
        lblEndOfTerm.setBounds(345, 20, 86, 16);
        panel_1.add(lblEndOfTerm);
        
        JLabel txtSstMOT = new JLabel("<dynamic>");
        txtSstMOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtSstMOT.setBounds(254, 86, 67, 16);
        panel_1.add(txtSstMOT);
        
        JLabel txtSstEOT = new JLabel("<dynamic>");
        txtSstEOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtSstEOT.setBounds(364, 86, 67, 16);
        panel_1.add(txtSstEOT);
        
        JLabel txtMathMOT = new JLabel("<dynamic>");
        txtMathMOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtMathMOT.setBounds(254, 114, 67, 16);
        panel_1.add(txtMathMOT);
        
        JLabel txtMathEOT = new JLabel("<dynamic>");
        txtMathEOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtMathEOT.setBounds(364, 114, 67, 16);
        panel_1.add(txtMathEOT);
        
        JLabel txtScienceMOT = new JLabel("bot");
        txtScienceMOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtScienceMOT.setBounds(254, 142, 67, 16);
        panel_1.add(txtScienceMOT);
        
        JLabel txtScienceEOT = new JLabel("bot");
        txtScienceEOT.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
        txtScienceEOT.setBounds(364, 142, 67, 16);
        panel_1.add(txtScienceEOT);
        
        JLabel lblMarks = new JLabel("Marks");
        lblMarks.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
        lblMarks.setBounds(296, 28, 97, 38);
        add(lblMarks);
	}

}

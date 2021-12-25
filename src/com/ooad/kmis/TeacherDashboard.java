package com.ooad.kmis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherDashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDashboard frame = new TeacherDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TeacherDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 204, 102));
		panel_2.setBounds(0, 0, 508, 30);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Katikamu P S");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel.setBounds(6, 6, 115, 18);
		panel_2.add(lblNewLabel);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		btnLogOut.setBackground(Color.LIGHT_GRAY);
		btnLogOut.setBounds(393, 2, 109, 29);
		panel_2.add(btnLogOut);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setBounds(0, 31, 117, 266);
		contentPane.add(leftPanel);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentRegister stReg = new StudentRegister();
				stReg.setVisible(true);
			}
		});
		btnStudents.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		leftPanel.add(btnStudents);
		
		JButton btnMarks = new JButton("Marks");
		btnMarks.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		leftPanel.add(btnMarks);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		leftPanel.add(btnSubjects);
		
//		JPanel rightPanel = new JPanel();
//		rightPanel.setLayout(null);
//		rightPanel.setBackground(Color.WHITE);
//		rightPanel.setBounds(118, 31, 500, 300);
		JPanel rightPanel = new CardPanel();
		rightPanel.setBounds(118, 31, 500, 300);
		contentPane.add(rightPanel);
	}

}

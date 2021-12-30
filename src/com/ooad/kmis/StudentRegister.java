//package com.ooad.kmis;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import java.awt.Color;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//
//import java.awt.Font;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JComboBox;
//import com.toedter.calendar.JDateChooser;
//import javax.swing.DefaultComboBoxModel;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.text.SimpleDateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.awt.event.ActionEvent;
//
//public class StudentRegister extends JFrame {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
//	private JTextField txtFirstName;
//	private JTextField txtLastName;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StudentRegister frame = new StudentRegister();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	Connection con;
//	PreparedStatement pst;
//	public void Connect() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");
//		} catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(StudentRegister.this, "Failed to located Class");
//		} catch (SQLException e) {
//            JOptionPane.showMessageDialog(StudentRegister.this, "Failed to connect to database");
//		}
//	}
//
//
//	/**
//	 * Create the frame.
//	 */
//	public StudentRegister() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 631, 382);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		Connect();
//		
//		JPanel panel_2 = new JPanel();
//		panel_2.setLayout(null);
//		panel_2.setBackground(new Color(0, 204, 102));
//		panel_2.setBounds(0, 0, 630, 30);
//		contentPane.add(panel_2);
//		
//		JLabel lblNewLabel = new JLabel("Katikamu P S");
//		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
//		lblNewLabel.setBounds(6, 6, 115, 18);
//		panel_2.add(lblNewLabel);
//		
//		JButton btnLogOut = new JButton("Log Out");
//		btnLogOut.setForeground(Color.BLACK);
//		btnLogOut.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
//		btnLogOut.setBackground(Color.LIGHT_GRAY);
//		btnLogOut.setBounds(515, 3, 109, 29);
//		panel_2.add(btnLogOut);
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.LIGHT_GRAY);
//		panel.setBounds(0, 31, 129, 320);
//		contentPane.add(panel);
//		
//		JButton btnStudents = new JButton("Students");
//		btnStudents.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
//		panel.add(btnStudents);
//		
//		JButton btnMarks = new JButton("Marks");
//		btnMarks.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
//		panel.add(btnMarks);
//		
//		JButton btnSubjects = new JButton("Subjects");
//		btnSubjects.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
//		panel.add(btnSubjects);
//		
//		JPanel panel_1 = new JPanel();
//		panel_1.setLayout(null);
//		panel_1.setBackground(new Color(204, 204, 204));
//		panel_1.setBounds(132, 31, 493, 321);
//		contentPane.add(panel_1);
//		
//		JLabel lblFirstName = new JLabel("First Name");
//		lblFirstName.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		lblFirstName.setBounds(30, 70, 64, 16);
//		panel_1.add(lblFirstName);
//		
//		JLabel lblNewLabel_1 = new JLabel("Student Registration");
//		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
//		lblNewLabel_1.setBounds(96, 3, 155, 24);
//		panel_1.add(lblNewLabel_1);
//		
//		JLabel lblLastName = new JLabel("Last Name");
//		lblLastName.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		lblLastName.setBounds(30, 98, 71, 16);
//		panel_1.add(lblLastName);
//		
//		txtFirstName = new JTextField();
//		txtFirstName.setColumns(10);
//		txtFirstName.setBounds(121, 65, 313, 26);
//		panel_1.add(txtFirstName);
//		
//		txtLastName = new JTextField();
//		txtLastName.setColumns(10);
//		txtLastName.setBounds(121, 93, 313, 26);
//		panel_1.add(txtLastName);
//		
//		JLabel lblGender = new JLabel("Gender");
//		lblGender.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		lblGender.setBounds(30, 128, 64, 16);
//		panel_1.add(lblGender);
//		
//		JComboBox<String> txtGender = new JComboBox<String>();
//		txtGender.setModel(new DefaultComboBoxModel<String>(new String[] {"Male", "Female"}));
//		txtGender.setBounds(121, 124, 130, 27);
//		panel_1.add(txtGender);
//		
//		JLabel lbDob = new JLabel("Date of birth");
//		lbDob.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		lbDob.setBounds(30, 163, 64, 16);
//		panel_1.add(lbDob);
//		
//		JDateChooser dateChooser = new JDateChooser();
//		dateChooser.setBounds(121, 153, 319, 26);
//		panel_1.add(dateChooser);
//		
//		JLabel lblClass = new JLabel("Class");
//		lblClass.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		lblClass.setBounds(30, 196, 64, 16);
//		panel_1.add(lblClass);
//		
//		JComboBox<String> txtClass = new JComboBox<String>();
//		txtClass.setModel(new DefaultComboBoxModel(new String[] {"P1", "P2", "P3", "P4", "P5", "P6", "P7"}));
//		txtClass.setBounds(121, 192, 130, 27);
//		panel_1.add(txtClass);
//		
//		JButton btnNewButton = new JButton("Register");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String firstName = txtFirstName.getText();
//                String lastName = txtLastName.getText();
//                String gender = txtGender.getSelectedItem().toString();
//                String genderAbr;
//                if(gender == "Male") genderAbr = "M";
//                else genderAbr = "F";
//                String pupilClass = txtClass.getSelectedItem().toString();
//                java.util.Date dob = dateChooser.getDate();
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                String date = sdf.format(dob);
//                Date theDate = Date.valueOf(date);
//                
//                
//                String userName = String.valueOf(lastName.toLowerCase().charAt(0)).concat(firstName.toLowerCase());
//                
//            	try {
//                    pst = con.prepareStatement("INSERT INTO students (first_name, last_name, gender, date_of_birth, class, user_name) VALUES (?,?,?,?,?,?)");
//                    pst.setString(1, firstName);
//                    pst.setString(2, lastName);
//                    pst.setString(3, genderAbr);
//                    pst.setDate(4, theDate);
//                    pst.setString(5, pupilClass);
//                    pst.setString(6, userName);
//                    pst.executeUpdate();
//                    JOptionPane.showMessageDialog(StudentRegister.this, "Student registered sucefully");
//                    txtFirstName.setText("");
//                    txtLastName.setText("");
//                    txtGender.setSelectedIndex(-1);
//                    txtClass.setSelectedIndex(-1);
//                    txtFirstName.requestFocus();                    
//                } catch (SQLException sexp) {
//                	Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, sexp);
//                }
//			}
//		});
//		btnNewButton.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		btnNewButton.setBounds(96, 246, 117, 29);
//		panel_1.add(btnNewButton);
//		
//		JButton btnCancel = new JButton("Cancel");
//		btnCancel.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				StudentRegister.this.setVisible(false);
//			}
//		});
//		btnCancel.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
//		btnCancel.setBounds(334, 274, 117, 29);
//		panel_1.add(btnCancel);
//	}
//}

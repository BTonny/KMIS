package com.ooad.kmis;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TeacherRegistration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField subjectCodes;
    private JTextField username;
    private JPasswordField passwordField;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TeacherRegistration frame = new TeacherRegistration();
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

    public TeacherRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewSchoolName = new JLabel("Katikamu Primary School");
        lblNewSchoolName.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblNewSchoolName.setBounds(20, 10, 400, 50);
        contentPane.add(lblNewSchoolName);
        
        JLabel lblNewUserRegister = new JLabel("Teacher Registration");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblNewUserRegister.setBounds(362, 60, 400, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Subjects\r\n taught");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 12));
        firstname.setBounds(214, 151, 228, 30);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lastname.setBounds(214, 235, 228, 30);
        contentPane.add(lastname);
        lastname.setColumns(10);

        subjectCodes = new JTextField();

        subjectCodes.setFont(new Font("Tahoma", Font.PLAIN, 12));
        subjectCodes.setBounds(214, 320, 228, 30);
        contentPane.add(subjectCodes);
        subjectCodes.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 12));
        username.setBounds(707, 151, 228, 30);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        passwordField.setBounds(707, 235, 228, 30);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String subjectsTaught = subjectCodes.getText();
                String userName = username.getText();
                String password = String.valueOf(passwordField.getPassword());

                String msg = "" + firstName;
                msg += " \n";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");

                    String query = "INSERT INTO teachers (first_name, last_name, subject_codes, user_name, password) VALUES ('" + firstName + "','" + lastName + "', '" + subjectsTaught + "', '" + userName + "', '" + password + "')";
//                    String query1 = "INSERT INTO teachers values('" + firstName + "','" + lastName + "','" + userName + "','" +
//                        password + "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "User already exists!");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome to Katikamu PS, " + msg + "Your account has been created sucessfully");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                    JOptionPane.showMessageDialog(btnNewButton,
                            "Error:"+ exception.getMessage()+"");
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}

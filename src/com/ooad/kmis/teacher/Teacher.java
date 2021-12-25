package com.ooad.kmis.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ooad.kmis.User;

public class Teacher implements User{
	public String userId;
	public String userName;
	public String firstName;
	public String lastName;
	public String[] subjectCodes;
	
	public Teacher() {
		this.userId = "";
		this.userName = "";
	}
	
	public Teacher(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public Teacher(ResultSet resultSet) throws SQLException {
		this.userId = resultSet.getString("id");
		this.userName = resultSet.getString("user_name");
		this.firstName = resultSet.getString("first_name");
		this.lastName = resultSet.getString("last_name");
		String subjectsString = resultSet.getString("subject_codes");
		this.subjectCodes = subjectsString.split(",");
	}
	
	public ResultSet getProfile(Connection connection, PreparedStatement preparedStatement) throws SQLException {
		preparedStatement = connection.prepareStatement("SELECT * FROM teachers WHERE id = ? and user_name = ?");
		
		preparedStatement.setString(1, userId);
		preparedStatement.setString(2, userName);
		ResultSet rs = preparedStatement.executeQuery();
    	return rs;
	}
	
	public ResultSet getProfile() throws SQLException, ClassNotFoundException {
		Connection con;
		PreparedStatement preparedStatement;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:8889/kps", "root", "root");
		
		preparedStatement = con.prepareStatement("SELECT * FROM teachers WHERE id = ? and user_name = ?");
		
		preparedStatement.setString(1, userId);
		preparedStatement.setString(2, userName);
		ResultSet rs = preparedStatement.executeQuery();
    	
    	return rs;
	}
	
	public ResultSet editProfile(Connection connection, PreparedStatement preparedStatement)  throws SQLException {
		preparedStatement = connection.prepareStatement("UPDATE teachers SET first_name = ?, last_name = ?, subject_codes = ?, user_name =? WHERE id = ?");
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		String subjectsString = String.join(",", subjectCodes);
		preparedStatement.setString(3, subjectsString);
		preparedStatement.setString(4, userName);
		preparedStatement.setString(5, userId);
		ResultSet rs = preparedStatement.executeQuery();
    	return rs;
	}
	
	public boolean changePassword(Connection connection, PreparedStatement preparedStatement, String newPassword)  throws SQLException {
		preparedStatement = connection.prepareStatement("UPDATE teachers SET password = ? WHERE id = ?");
		preparedStatement.setString(1, newPassword);
		preparedStatement.setString(2, userId);
		
		ResultSet rs = preparedStatement.executeQuery();
		boolean result = false;
		if(rs.next()) {
    		result = true;
    	}
		return result;
	}
	
	public Teacher fromResultSet (ResultSet rs) throws SQLException {
		Teacher teacher = new Teacher();
		String subjectsString;
    	if(rs.next()) {
    		teacher.userId = rs.getString("id");
    		teacher.userName = rs.getString("user_name");
    		teacher.firstName = rs.getString("first_name");
    		teacher.lastName = rs.getString("last_name");
    		subjectsString = rs.getString("subject_codes");
    		subjectCodes = subjectsString.split(",");
    		
    	}
    	
    	return teacher;
	}

}

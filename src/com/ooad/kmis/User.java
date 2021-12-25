package com.ooad.kmis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface User {
	public ResultSet getProfile() throws SQLException, ClassNotFoundException  ;
	public ResultSet getProfile(Connection connection, PreparedStatement preparedStatement) throws SQLException ;
	public ResultSet editProfile(Connection conconnection, PreparedStatement preparedStatement) throws SQLException ;
	public boolean changePassword(Connection conconnection, PreparedStatement preparedStatement, String newPassword) throws SQLException ;
}

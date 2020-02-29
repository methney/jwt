package com.grokonez.jwtauthentication.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet row, int rowNum) throws SQLException {
		User user = new User();
		user.setId(row.getLong("id"));
		user.setUsername(row.getString("username"));
		user.setEmail(row.getString("email"));
		user.setName(row.getString("name"));
		user.setEtc(row.getString("etc"));
		user.setPassword(row.getString("password"));
		user.setPassword_php(row.getString("password_php"));
		return user;
	}

}

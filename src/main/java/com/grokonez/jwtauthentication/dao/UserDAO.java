package com.grokonez.jwtauthentication.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grokonez.jwtauthentication.model.UserRowMapper;
import com.grokonez.jwtauthentication.model.User;
@Transactional
@Repository
public class UserDAO implements IUserDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public User getUserByUsername(String username) {
		String sql = "SELECT * FROM order_maker_users WHERE username = ?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		User user = jdbcTemplate.queryForObject(sql, rowMapper, username);
		return user;
	}
	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM order_maker_users";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}	
	
	
	@Override
	public void addUser(User user) {
	
	}
	
	@Override
	public void updateUser(User user) {
	
	}
	
	@Override
	public void deleteUser(int id) {
	
	}
	
	
	
}

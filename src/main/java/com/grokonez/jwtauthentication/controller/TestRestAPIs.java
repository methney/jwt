package com.grokonez.jwtauthentication.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.service.IUserService;

@RestController
public class TestRestAPIs {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<JSONObject> userAccess() {
		JSONObject result = new JSONObject();
		
		List<User> list = userService.getAllUsers();
		result.put("user", list);
		
		return new ResponseEntity<JSONObject>(result, HttpStatus.OK);
		
	}

	@GetMapping("/api/test/pm")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Board Management Project";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}
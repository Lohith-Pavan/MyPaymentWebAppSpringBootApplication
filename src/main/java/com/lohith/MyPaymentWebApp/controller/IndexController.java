package com.lohith.MyPaymentWebApp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lohith.MyPaymentWebApp.entity.UserEntity;
import com.lohith.MyPaymentWebApp.service.UserService;

@Controller
@RequestMapping
public class IndexController {
	@Autowired
	public UserService userService;
	@GetMapping("/hello")
	public String login() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmd_payment_app","root","LohithPavan@123");
		String query = "select * from user_details";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4)+"::"+rs.getString(5)+"::"+rs.getString(6)+"::"+rs.getString(7)+"::"+rs.getString(8));
		}
		return "login";
	}
	@GetMapping("/")
	public List<UserEntity> getAllUserDetails(){
		System.out.println(userService.getAllUserDetails().size());
		return userService.getAllUserDetails();
	}
	@GetMapping("/nice")
	public String html(){
		String str = "<html><body><font color=\"green\">"
	              + "<h1>WELCOME To GeeksForGeeks</h1>"
	              + "</font></body></html>";
		return str;
	}
}
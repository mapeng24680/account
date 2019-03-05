package com.example.api;

import com.example.domain.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insert(@RequestBody User user) {
		userService.insert(user);
	}
	
	@RequestMapping(value = "/rrr",method = RequestMethod.GET)
	public void test(@RequestParam String signature,@RequestParam String timestamp,@RequestParam String nonce) {
		
	}
	@RequestMapping(value = "/aaa", method = RequestMethod.POST)
	public List<User> userList() {
		LOGGER.info("---------------------");
		return null;
	}

}

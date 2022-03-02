package com.ashspell.ex.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashspell.ex.lesson04.bo.UserBO;

@Controller
public class Lesson06Controller {
	
	@Autowired
	private UserBO userBO;
	
	@GetMapping("/lesson06/user_input")
	public String userInput() {
		
		return "/lesson06/userInput";
	}
	
	
	// WEB API
	@PostMapping("/lesson06/add_user")
	@ResponseBody
	public String AddUser(
			@RequestParam("name") String name,
			@RequestParam("birth") String birth,
			@RequestParam("introduce") String introduce,
			@RequestParam("email") String email) {
		
		int count = userBO.addUser(name, birth, introduce, email);
		
		if(count == 1) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	
	
}

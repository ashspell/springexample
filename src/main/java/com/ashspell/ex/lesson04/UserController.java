package com.ashspell.ex.lesson04;



import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashspell.ex.lesson04.bo.UserBO;
import com.ashspell.ex.lesson04.model.Usermodel;

@RequestMapping("/lesson04")
@Controller
public class UserController {
	
	@Autowired
	private UserBO userBO;
	
	@RequestMapping("/ex01")
	public String getUserView(Model model) {
		// 가장 최근 추가된 사용자 정보 
		Usermodel user = userBO.getLastUser();
		
		model.addAttribute("result", user);
		
		return "lesson04/ex01";
	}
	
	@RequestMapping("/ex01_input")
	public String addview() {
		return "lesson04/ex01_insert";
	}
	
	@RequestMapping("/ex01/add_user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("birth") String birth,
			@RequestParam("introduce") String introduce,
			@RequestParam("email") String email) {
		// 이름, 생년월일, 자기소개, 이메일주소
		int count =  userBO.addUser(name, birth, introduce, email);
		
		return "입력성공" + count;
	}
}

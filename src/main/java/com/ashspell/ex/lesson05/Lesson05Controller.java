package com.ashspell.ex.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02 (Model model) {
		
		// 과일이름 리스트
		List<String>fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banaba");
		fruits.add("strawberry");
		
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김인규");
		map.put("age" , 25);
		map.put("hobby" , "댄스");
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "신바다");
		map.put("age", 4);
		map.put("hobby", "사냥하기");
		users.add(map);
		
		model.addAttribute("listmap", users);
		
		
		return "lesson05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
	
		Date today = new Date();
		
		model.addAttribute("date", today);
		
		return "lesson05/ex03";
	}
	
	
}

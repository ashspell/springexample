package com.ashspell.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01") // 공통적으로 들어가는 매핑 처리
public class Ex01Controller {

	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "예제 1번 문자열을 response 에 출력한다";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap<>();
	// 과일 이름과 가격
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		
		return map;
	}
}

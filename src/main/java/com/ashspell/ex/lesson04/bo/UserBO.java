package com.ashspell.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashspell.ex.lesson04.dao.UserDAO;
import com.ashspell.ex.lesson04.model.Usermodel;


@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public Usermodel getLastUser() {
		return userDAO.selectLastUser();
	
	public int addUser(String name, String birth, String introduce, String email) {
		userDAO.insertUser(name, birth, introduce, email);
	}
}

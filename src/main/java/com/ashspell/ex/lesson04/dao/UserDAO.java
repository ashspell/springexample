package com.ashspell.ex.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ashspell.ex.lesson04.model.Usermodel;

@Repository
public interface UserDAO {
	public Usermodel selectLastUser();
}

	public int insertUser(
			@Param("name") String name,
			@Param("birth") String birth,
			@Param("introduce") String introduce,
			@Param("email") String email)
	
	


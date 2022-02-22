package com.ashspell.ex.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.ashspell.ex.lesson04.model.Student;

@Repository
public interface StudentDAO {
	
	public int insertStudent(Student student);
}

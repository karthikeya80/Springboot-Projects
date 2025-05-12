package com.bank.service;

import java.util.List;
import java.util.Map;

import com.bank.entity.Student;

public interface IStudent {

	public void getStudentdata();

	public List<Student> listOfStudentsData();
	
	public Map<Integer,Student> mapOfStudentData();
		
	}



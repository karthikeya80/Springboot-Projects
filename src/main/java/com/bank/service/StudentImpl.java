package com.bank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bank.entity.Student;
import com.bank.springbootbasicproject.MyFirstSpringBootProject;

public class StudentImpl implements IStudent {

	private static final Logger logger = LoggerFactory.getLogger(MyFirstSpringBootProject.class);

	public void getStudentdata() {
		logger.info("getStudentdata() started successfully...");

	}

	public List<Student> listOfStudentsData() {
		logger.info("listOfStudentsData() started successfully...");
		return null;
	}

}

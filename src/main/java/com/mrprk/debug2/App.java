package com.mrprk.debug2;

import java.util.List;

public class App {
	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDao();
		List<Student> allStudent = studentDao.getAllStudent();
		studentDao.printStudent(allStudent);
	}

}

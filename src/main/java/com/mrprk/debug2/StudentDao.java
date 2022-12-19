package com.mrprk.debug2;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public List<Student> getAllStudent() {
		Student atim = new Student();
		atim.setId(1);
		atim.setName("Atim Pramanik");
		atim.setMobile("900876563");
		Student leo = new Student();
		leo.setId(2);
		leo.setName("Leo John");
		leo.setMobile("87865234525");

		ArrayList<Student> student = new ArrayList<Student>();
		student.add(atim);
		student.add(leo);
		return student;
	}

	public void printStudent(List<Student> student) {
		System.out.println("********** Printing all students ***********");
		for (Student s : student) {
			System.out.println("Id : " + s.getId() + " Name : " + s.getName() + " Mobile : " + s.getMobile());
		}
		System.out.println("***************** end ******************");
	}

}

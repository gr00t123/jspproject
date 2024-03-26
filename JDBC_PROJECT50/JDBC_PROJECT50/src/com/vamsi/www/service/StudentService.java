package com.vamsi.www.service;

import com.vamsi.www.dao.Studentdao;
import com.vamsi.www.dto.Student;

public class StudentService {
	
	Studentdao sd=new Studentdao();
	
	public void insert(Student stu) {
		
		sd.insertStudent(stu);
	}
	public void delete(Student stu) {
		sd.deleteStudent(stu);
	}
	public void update(Student stu) {
		sd.updateStudent(stu);
	}
	
}

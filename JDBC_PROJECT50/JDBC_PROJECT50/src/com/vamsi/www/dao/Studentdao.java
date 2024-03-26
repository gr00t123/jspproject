package com.vamsi.www.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vamsi.www.dto.Student;

public class Studentdao {

	public void insertStudent(Student stu)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","vamsivarma@299950");
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?,?,?)");
		ps.setInt(1,stu.getId());
		ps.setString(2,stu.getName());
		ps.setString(3,stu.getEmail());
		ps.setInt(4,stu.getPhone());
		ps.setString(5,stu.getPwd());
		ps.setInt(6,stu.getMarks());
		ps.execute();
		ps.close();
		c.close();
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStudent(Student stu)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","vamsivarma@299950");
			PreparedStatement ps=c.prepareStatement("delete from student where id=?");
			ps.setInt(1,stu.getId());
			ps.execute();
			ps.close();
			c.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateStudent(Student stu) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","vamsivarma@299950");
			PreparedStatement ps=c.prepareStatement("update student set name=? where id=?");
			ps.setString(1,stu.getName());
			ps.setInt(2,stu.getId());
			ps.execute();
			ps.close();
			c.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}

package com.vamsi.www.controller;

import java.util.Scanner;

import com.vamsi.www.dto.Student;
import com.vamsi.www.service.StudentService;

public class Controller {

	public static void main(String[] args) {
		
		boolean result=true;
		Scanner sc=new Scanner(System.in);
		while(result)
		{
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Exit");
			System.out.println("Please select the above operation");
			int choise=sc.nextInt();
			switch(choise) {
			
			case 1:{
				System.out.println("Enter your Id");
				int id=sc.nextInt();
				System.out.println("Enter your Name");
				String name=sc.next();
				System.out.println("Enter your Email");
				String email=sc.next();
				System.out.println("Enter your PhoneNumber");
				int phone=sc.nextInt();
				System.out.println("Enter your Password");
				String pwd=sc.next();
				System.out.println("Enter your Marks");
				int marks=sc.nextInt();
				
				Student s=new Student(id,name,email,phone,pwd,marks);
				StudentService ss=new StudentService();
				ss.insert(s);
				System.out.println("*******Insertion Sucessful*******");
			}break;
			
			case 2:{
					System.out.println("Please enter the name ");
					String name=sc.next();
					System.out.println("please enter the id");
					int id=sc.nextInt();
					Student s=new Student();
					s.setId(id);
					s.setName(name);
					StudentService ss=new StudentService();
					ss.update(s);
					System.out.println("*******Updation Sucessful*******");
					
			}break;
			
			case 3:{
				System.out.println("Please enter the id which record you want to delete");
				int id=sc.nextInt();
				Student s=new Student();
				s.setId(id);
				StudentService ss=new StudentService();
				ss.delete(s);
				System.out.println("*******Deletion Sucessful*******");
			}break;
			
			case 4:{
				result=false;
				System.out.println("Thank You See You Again");
			}
			break;
			
			}
			
		}

	}

}

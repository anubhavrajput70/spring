package com.spring.orm;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//       Student student=new Student(2334,"Anubhav Rajput","Delhi");
//       int r=studentDao.insert(student);
//       System.out.println("done...."+r); 
		Scanner br=new Scanner(System.in);
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 display all students");
			System.out.println("PRESS 3 for get details of single student");
			System.out.println("PRESS 4 delete student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");
			try {
				int input =br.nextInt();
				switch (input) {
				case 1:
					// add a new student
				{
					System.out.println("enter student id");
					int id=br.nextInt();
					System.out.println("enter student name");
					String name=br.next();
					System.out.println("enter student city");
					String city=br.next();
					Student student=new Student(id,name,city);
					int r=studentDao.insert(student);
					System.out.println(r+" student added");
					System.out.println("***********************************");
				}
					break;
				case 2:
					// display all student
					System.out.println("***********************************");
					List<Student> allStudents=studentDao.getAllStudent();
					for(Student st:allStudents)
					{
						
						System.out.println("Id: "+st.getStudentId());
						System.out.println("Name: "+st.getStudentName());
						System.out.println("City: "+st.getStudentCity());
						System.out.println("_____________________________________");
					}
					System.out.println("*************************************");
					break;
				case 3:
					// add single student data
				{
					System.out.println("enter id of student ");
					int id=br.nextInt();
					try {
						Student student=studentDao.getStudent(id);
						System.out.println("name: "+student.getStudentName());
						System.out.println("city: "+student.getStudentCity());
						System.out.println("_______________________________________");
						
					} catch (Exception e) {
						System.out.println("not found");
						System.out.println("_______________________________________");
						
					}
				}
					break;
				case 4:
					// for delete student
				{
					System.out.println("enter id of student ");
					int id=br.nextInt();
					try {
						studentDao.deleteStudent(id);
						System.out.println("deleted successfully");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("student not found");
					}
				}
					break;
				case 5:
					// update the student
				{
					System.out.println("enter student id");
					int id=br.nextInt();
					System.out.println("enter new student name");
					String name=br.next();
					System.out.println("enter new student city");
					String city=br.next();
					Student student=new Student(id,name,city);
					studentDao.updateStudent(student);
				}
					break;
				case 6:
					// exit
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("invalid input try with another one");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("thank you for using my app will meet you soon");
	}
}

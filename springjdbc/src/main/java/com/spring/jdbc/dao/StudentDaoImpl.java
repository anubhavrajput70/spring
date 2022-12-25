package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student)
	{
		String query="insert into student(id,name,city) values(?,?,?)";
        int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) 
	{
		//update data
		String query="update student set name=?, city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentId)
	{
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}
	//selecting single student data
	public Student getStudent(int studentId) {
		//perimeterized query
		String query="select * from student where id=?";
		//important
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId );
		return student;
	}
	
	//selectiong multiple students
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query="select * from student";
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());

		
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
}

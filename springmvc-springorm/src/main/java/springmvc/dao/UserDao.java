package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

//we use this annotation to tell the spring container that this is the object of
//data access layer and saving this in data base , this is injected when autowiring is used, even we don't need to declare it in xml explicitly
@Repository
public class UserDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	//this annotation enables the writing mode
	@Transactional
	public int saveUser(User user)
	{
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
		
	}
}

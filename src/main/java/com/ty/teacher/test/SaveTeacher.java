package com.ty.teacher.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Subject;
import com.ty.teacher.dto.Teacher;

public class SaveTeacher {
	
	public static void main(String[] args) {
		
		List<Subject> list=new ArrayList<Subject>();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Teacher teacher1=new Teacher();
		teacher1.setName("NAGENDHRA");
		teacher1.setAge(21);
		
		Teacher teacher2=new Teacher();
		teacher2.setName("KALPANA");
		teacher2.setAge(32);
		
		Subject subject1=new Subject();
		subject1.setName("BIOLOGY");
		subject1.setDays(45);
		
		list.add(subject1);
		
		Subject subject2=new Subject();
		subject2.setName("CHEMISTRY");
		subject2.setDays(45);
		
		list.add(subject2);
		
		Subject subject3=new Subject();
		subject3.setName("PHYSICS");
		subject3.setDays(45);
		
		list.add(subject3);
		
		teacher1.setSubject(list);
		teacher2.setSubject(list);
		
		transaction.begin();
		manager.persist(teacher1);
		manager.persist(teacher2);
		manager.persist(subject1);
		manager.persist(subject2);
		manager.persist(subject3);
		
		transaction.commit();
		
		
		
		
	}

}






































































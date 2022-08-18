package com.ty.teacher.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Course;
import com.ty.teacher.dto.Student;

public class TsetCourse {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Course course = new Course();
		course.setName("FULL STACK");
		course.setCost(39990.00);
		course.setList(list);

//		Course course1=new Course();
//		course1.setName("advance STACK");
//		course1.setCost(3990.00);
//		

		Student student = new Student();
		student.setName("MALLIKARJUN");
		student.setAge(20);

		list.add(student);

		Student student1 = new Student();
		student1.setName("mahesh");
		student1.setAge(20);

		list.add(student1);

		Student student2 = new Student();
		student2.setName("HARINI");
		student2.setAge(20);

		list.add(student2);

		Student student3 = new Student();
		student3.setName("SAI PRASANNA");
		student3.setAge(19);

		list.add(student3);

		Student student4 = new Student();
		student4.setName("SAI PRASANNA");
		student4.setAge(26);

		list.add(student4);

		Student student5 = new Student();
		student5.setName("SAI");
		student5.setAge(25);

		list.add(student5);

		

		transaction.begin();
		
		manager.persist(student);
		manager.persist(student2);
		manager.persist(student3);
		manager.persist(student4);
		manager.persist(student5);
		manager.persist(course);
		

		transaction.commit();

	}

}

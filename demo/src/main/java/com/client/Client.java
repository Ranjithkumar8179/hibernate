package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import com.model.Student;

public class Client {
	
	public static void main(String[] args) {
		
//		Student s=new Student(20, "ranjith");
//		Student s3=new Student(3, "vamshi");
		Student s4=new Student(30, "Swamy");
		Configuration confi=new Configuration();
		confi.configure("cong.cfg.xml");
		SessionFactory sf=confi.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction bt = ses.beginTransaction();
		
		ses.save(s4);
		
		Query query = ses.createQuery("from anil");
	       List<Student> stu = query.list();
	        for (Student srikanth : stu) {
	            System.out.println(srikanth);
	       }
		
		bt.commit();
		ses.close();
		
		
		
		
	}

}

package com.vince.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.vince.dao.TeacherDao;
import com.vince.model.person;

import junit.framework.TestCase;

public class test extends TestCase {
	
	TeacherDao dao = new TeacherDaoImpl();
	
	public void testMethod1(){
		try {
			List<person> p =dao.findAll();
			for(int i =0;i<p.size();i++){
				System.out.print(p.get(i).getName().toString());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

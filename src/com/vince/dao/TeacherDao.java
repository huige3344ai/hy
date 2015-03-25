package com.vince.dao;

import java.sql.SQLException;
import java.util.List;
import com.vince.model.person;
/**
 * DAO ½Ó¿Ú
 * @author lamp
 *
 */
public interface TeacherDao {

	public void add(person t)throws SQLException;
	
	public void delete(int tid)throws SQLException;
	
	public void update(person t)throws SQLException;
	
	public person findById(int tid)throws SQLException;
	
	public List<person> findAll()throws SQLException;
}

















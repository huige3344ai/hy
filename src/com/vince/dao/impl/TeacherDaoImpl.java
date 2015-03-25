package com.vince.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.dbo.JdbcTemplete;
import com.vince.base.ResultSetHandler;
import com.vince.dao.TeacherDao;
import com.vince.model.person;

/**
 * DAO实现类
 * @author lamp
 *
 */
public class TeacherDaoImpl implements TeacherDao {

	private JdbcTemplete jdbcTemplete;
	public TeacherDaoImpl(){
		jdbcTemplete = new JdbcTemplete();
	}
	
	/**
	 * 添加操作9
	 */
	@Override
	public void add(person t) throws SQLException {
		String sql = "insert into person(name,sex) values(?,?)";
		jdbcTemplete.update(sql, t.getName(),t.getDescription());
	}

	@Override
	public void delete(int tid) throws SQLException {
		String sql = "delete from person where id=?";
		jdbcTemplete.update(sql, tid);
	}

	@Override
	public void update(person t) throws SQLException {
		String sql = "update teacher set name=?,sex=?, where id=?";
		jdbcTemplete.update(sql, t.getName(),t.getDescription(),t.getTid());
	}

	@Override
	public person findById(final int tid) throws SQLException {
		String sql = "select name,sex from person where id=?";
		return (person)jdbcTemplete.query(sql, new ResultSetHandler() {
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				person t = null;
				if(rs.next()){
					t = new person();
					t.setTid(tid);
					t.setName(rs.getString(1));
					t.setDescription(rs.getString(2));
				
				}
				return t;
			}
		},tid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<person> findAll() throws SQLException {
		String sql = "select id,name,sex from person";
		
		return (List<person>)jdbcTemplete.query(sql, new ResultSetHandler() {
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				List<person> teachers = new ArrayList<person>();
				person t = null;
				while(rs.next()){
					t = new person();
					t.setTid(rs.getInt(1));
					t.setName(rs.getString(2));
					t.setDescription(rs.getString(3));
					teachers.add(t);
				}
				return teachers;
			}
		});
	}

}














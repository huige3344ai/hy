package com.util.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


public class DBUtils {
	//���ݿ����ӵ�ַ
	public static String URL;
	//login user
	public static String USER;
	//login password
	public static String PASSWORD;
	//mysql driver
	public static String DRIVER ;
	
	private static ResourceBundle rb = ResourceBundle.getBundle("com.util.dbo.db-config");

	private DBUtils(){}
	
	//ʹ��static������������
	static{
		URL=rb.getString("jdbc.url");
		USER=rb.getString("jdbc.username");
		PASSWORD=rb.getString("jdbc.password");
		DRIVER=rb.getString("jdbc.driver");
		
		try{
			Class.forName(DRIVER);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//����һ����ȡ���ݿ����ӵķ�ʽ
	public static Connection getConnection(){
		java.sql.Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection error");
		}
		return conn;	
	}
	
	public static void close (ResultSet rs,Statement stat,Connection conn){
		
			try {
				if(rs!=null)rs.close();
				if(stat!=null) stat.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
}

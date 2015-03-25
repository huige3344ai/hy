package com.util.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


public class DBUtils {
	//数据库连接地址
	public static String URL;
	//login user
	public static String USER;
	//login password
	public static String PASSWORD;
	//mysql driver
	public static String DRIVER ;
	
	private static ResourceBundle rb = ResourceBundle.getBundle("com.util.dbo.db-config");

	private DBUtils(){}
	
	//使用static加载驱动程序
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
	
	//定义一个获取数据库连接的方式
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

package com.igeekhome.exhibition.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class BaseDAO {

	public Connection getCon() {
		Connection con = null;

		try {
			// 读取配置文件中的相关信息（驱动类，连接字符串，用户名和密码）
			Properties p = new Properties();
			p.load(this.getClass().getClassLoader().getResourceAsStream("/db.properties"));

			/*
			 * 如果driver,url,uname,upass在声明时设置为static
			 * final，则必须在static代码块中为它们进行初始化
			 * 由于它们被放在try语句块中，因此编译器会认为，try语句块中的代码有可能会执行不到，因此初始化并没有完成，所以会报错。
			 * 因此需要在catch中使用throw抛出异常.
			 */
			String driver = p.getProperty("driverClass");
			String url = p.getProperty("url");
			String uname = p.getProperty("name");
			String upass = p.getProperty("pass");
			Class.forName(driver);
			con = DriverManager.getConnection(url, uname, upass);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("初始化操作失败");
		}

		return con;
	}

	public void closeAll(Connection con, Statement st, ResultSet rs) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

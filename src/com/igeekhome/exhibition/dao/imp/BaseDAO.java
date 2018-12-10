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
			// ��ȡ�����ļ��е������Ϣ�������࣬�����ַ������û��������룩
			Properties p = new Properties();
			p.load(this.getClass().getClassLoader().getResourceAsStream("/db.properties"));

			/*
			 * ���driver,url,uname,upass������ʱ����Ϊstatic
			 * final���������static�������Ϊ���ǽ��г�ʼ��
			 * �������Ǳ�����try�����У���˱���������Ϊ��try�����еĴ����п��ܻ�ִ�в�������˳�ʼ����û����ɣ����Իᱨ��
			 * �����Ҫ��catch��ʹ��throw�׳��쳣.
			 */
			String driver = p.getProperty("driverClass");
			String url = p.getProperty("url");
			String uname = p.getProperty("name");
			String upass = p.getProperty("pass");
			Class.forName(driver);
			con = DriverManager.getConnection(url, uname, upass);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("��ʼ������ʧ��");
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

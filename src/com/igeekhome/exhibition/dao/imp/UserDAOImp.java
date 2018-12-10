package com.igeekhome.exhibition.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.dao.IUserDao;
import com.igeekhome.exhibition.pojo.User;

public class UserDAOImp extends BaseDAO implements IUserDao {

	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * 保存添加用户
	 */
	@Override
	public int saveUser(User u) {

		int result = -1;
		String sql = "insert into e_user (loginName,loginPass,createTime)values(?,?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, u.getLoginName());
			pst.setString(2, u.getLoginPass());
			pst.setString(3, u.getCreateTime());
			result = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return result;
	}

	@Override
	public List<User> queryAll() {

		return null;
	}

	/**
	 * 通过用户名查询用户是否存在
	 * 
	 * @param loginName
	 * @return
	 */
	@Override
	public User queryByLoginName(String loginName) {

		User u = null;
		String sql = "select userId,loginName,loginPass from e_user where loginName = ?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setString(1, loginName);
			rs = pst.executeQuery();
			if (rs.next()) {
				int userId = rs.getInt("userId");

				String loginPass = rs.getString("loginPass");

				u = new User(userId, loginName, loginPass);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return u;

	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User queryById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> query(User usearch, Map<String, String> timeMap, int row, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(User usearch, Map<String, String> timeMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object queryByUName(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub

	}

}

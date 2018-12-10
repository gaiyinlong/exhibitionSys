package com.igeekhome.exhibition.service.imp;

import java.util.List;

import com.igeekhome.exhibition.dao.IUserDao;
import com.igeekhome.exhibition.dao.imp.UserDAOImp;
import com.igeekhome.exhibition.pojo.User;
import com.igeekhome.exhibition.service.IUserService;
import com.igeekhome.exhibition.util.MD5Util;

public class UserServiceImp implements IUserService {

	IUserDao DAO = new UserDAOImp();

	@Override
	public int saveUser(User u) {

		return DAO.saveUser(u);
	}

	@Override
	public List<User> queryAll() {

		return null;
	}

	/**
	 * 通过用户名查找用户是否存在
	 */

	@Override
	public User login(String loginName, String loginPass) {

		User u = DAO.queryByLoginName(loginName);

		if (u == null) {

			return null;
		}

		if (u.getLoginPass().equals(MD5Util.getMD5(loginPass))) {

			return u;
		}
		return null;
	}

	@Override
	public int deleteUser(int userId) {

		return 0;
	}

	@Override
	public User queryById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}

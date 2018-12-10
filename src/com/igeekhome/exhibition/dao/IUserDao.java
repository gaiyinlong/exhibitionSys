package com.igeekhome.exhibition.dao;

import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.User;

public interface IUserDao {

	public int saveUser(User u);

	/**
	 * 查询所有的用户
	 * 
	 * @return
	 */
	public List<User> queryAll();

	/**
	 * 通过登录名查询用户信息
	 * 
	 * @param loginName
	 * @return
	 */
	public User queryByLoginName(String loginName);
	
	

	/**
	 * 根据ID删除用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public int deleteUser(int userId);

	/**
	 * 通过ID查询用户
	 * 
	 * @param userId
	 * @return
	 */
	public User queryById(int userId);

	/**
	 * 编辑用户信息
	 * 
	 * @param u
	 * @return
	 */
	public int updateUser(User u);

	/**
	 * @param usearch
	 * @param timeMap
	 *            时间条件
	 * @param row
	 *            每页行数
	 * @param page
	 *            要查询的页码
	 * @return
	 */
	public List<User> query(User usearch, Map<String, String> timeMap, int row, int page);

	/**
	 * 查询总条数
	 * 
	 * @return
	 */
	public int getCount(User usearch, Map<String, String> timeMap);

	/**
	 * @param uname
	 * @return
	 */
	public Object queryByUName(String uname);

	/**
	 * @param ids
	 */
	public void delete(String[] ids);
}

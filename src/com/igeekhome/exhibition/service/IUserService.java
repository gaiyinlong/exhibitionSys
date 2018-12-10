package com.igeekhome.exhibition.service;

import java.util.List;

import com.igeekhome.exhibition.pojo.User;



/**
 * @company 无锡极客营	
 * @author 极客营
 * @description 
 * 2016年12月28日
 */
public interface IUserService {
	public int saveUser(User u);
	/**
	 * 查询所有的用户
	 * @return
	 */
	public List<User> queryAll();
	
	/**
	 * 登录的业务
	 * @param loginName
	 * @param loginPass
	 * @return 登录成功就返回登录成功的用户信息对象。 登录失败则返回null
	 */
	public User login(String loginName,String loginPass);
	
	/**
	 * 根据ID删除用户信息
	 * @param userId
	 * @return
	 */
	public int deleteUser(int userId);
	/**
	 * 通过ID查询用户
	 * @param userId
	 * @return
	 */
	public User queryById(int userId);
	
	/**
	 * 编辑用户信息
	 * @param user
	 * @return
	 */
	public int editUser(User user);
}

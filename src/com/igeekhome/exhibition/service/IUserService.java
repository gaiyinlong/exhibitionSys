package com.igeekhome.exhibition.service;

import java.util.List;

import com.igeekhome.exhibition.pojo.User;



/**
 * @company ��������Ӫ	
 * @author ����Ӫ
 * @description 
 * 2016��12��28��
 */
public interface IUserService {
	public int saveUser(User u);
	/**
	 * ��ѯ���е��û�
	 * @return
	 */
	public List<User> queryAll();
	
	/**
	 * ��¼��ҵ��
	 * @param loginName
	 * @param loginPass
	 * @return ��¼�ɹ��ͷ��ص�¼�ɹ����û���Ϣ���� ��¼ʧ���򷵻�null
	 */
	public User login(String loginName,String loginPass);
	
	/**
	 * ����IDɾ���û���Ϣ
	 * @param userId
	 * @return
	 */
	public int deleteUser(int userId);
	/**
	 * ͨ��ID��ѯ�û�
	 * @param userId
	 * @return
	 */
	public User queryById(int userId);
	
	/**
	 * �༭�û���Ϣ
	 * @param user
	 * @return
	 */
	public int editUser(User user);
}

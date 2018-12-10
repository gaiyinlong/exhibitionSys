package com.igeekhome.exhibition.dao;

import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.User;

public interface IUserDao {

	public int saveUser(User u);

	/**
	 * ��ѯ���е��û�
	 * 
	 * @return
	 */
	public List<User> queryAll();

	/**
	 * ͨ����¼����ѯ�û���Ϣ
	 * 
	 * @param loginName
	 * @return
	 */
	public User queryByLoginName(String loginName);
	
	

	/**
	 * ����IDɾ���û���Ϣ
	 * 
	 * @param userId
	 * @return
	 */
	public int deleteUser(int userId);

	/**
	 * ͨ��ID��ѯ�û�
	 * 
	 * @param userId
	 * @return
	 */
	public User queryById(int userId);

	/**
	 * �༭�û���Ϣ
	 * 
	 * @param u
	 * @return
	 */
	public int updateUser(User u);

	/**
	 * @param usearch
	 * @param timeMap
	 *            ʱ������
	 * @param row
	 *            ÿҳ����
	 * @param page
	 *            Ҫ��ѯ��ҳ��
	 * @return
	 */
	public List<User> query(User usearch, Map<String, String> timeMap, int row, int page);

	/**
	 * ��ѯ������
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

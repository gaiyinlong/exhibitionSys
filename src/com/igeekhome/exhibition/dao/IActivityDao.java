package com.igeekhome.exhibition.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.Activity;

/**
 * 
 * @author Gyl 2017��6��8�� exhibitionSys
 * 
 */
public interface IActivityDao {

	// ����һ���»
	public int saveActivity(Activity a);

	// ��ѯ���л
	public List<Activity> queryAll();

	// ͨ��idɾ���
	public int deleteActivity(int actId);

	// ͨ��Id��ѯ�
	public Activity queryById(int actId);

	// �޸Ļ��Ϣ
	public int updateActivity(Activity a);

	/**
	 * @param act
	 * 
	 * @param timeMap
	 *            ʱ������
	 * @param row
	 *            ÿҳ����
	 * @param page
	 *            Ҫ��ѯ��ҳ��
	 * @return
	 */
	public List<Activity> query(Activity act, Map<String, String> timeMap);

	/**
	 * ��ѯ������
	 * 
	 * @return
	 */
	public int getCount(Activity act, Map<String, String> timeMap);

	public Object queryByActivity_Name(String name);

	/**
	 * ����ɾ��
	 */
	public void delete(String[] ids);
}

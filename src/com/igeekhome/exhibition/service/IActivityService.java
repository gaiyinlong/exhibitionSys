package com.igeekhome.exhibition.service;

import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.util.Pager;

public interface IActivityService {

	// ����һ���»
	public int saveActivity(Activity a);

	// ��ѯ���л
	public List<Activity> queryAll();

	// ͨ��idɾ���
	public int deleteActivity(int actId);

	// ͨ��Id��ѯ�
	public Activity queryById(int id);

	// �޸Ļ��Ϣ
	public int updateActivity(Activity a);



	/** ��������ϲ�ѯ
	 * @param usearch
	 * @return
	 */
	public List<Activity> query(Activity actSearch,Map<String,String> timeMap);
	/**
	 * ��ѯ������
	 * 
	 * @return
	 */
	public int getCount(Activity act, Map<String, String> timeMap);

	public Object queryByActivity_Name(String name);

	public void delete(String[] ids);
}

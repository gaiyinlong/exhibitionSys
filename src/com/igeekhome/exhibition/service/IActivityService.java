package com.igeekhome.exhibition.service;

import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.util.Pager;

public interface IActivityService {

	// 增加一个新活动
	public int saveActivity(Activity a);

	// 查询所有活动
	public List<Activity> queryAll();

	// 通过id删除活动
	public int deleteActivity(int actId);

	// 通过Id查询活动
	public Activity queryById(int id);

	// 修改活动信息
	public int updateActivity(Activity a);



	/** 多条件组合查询
	 * @param usearch
	 * @return
	 */
	public List<Activity> query(Activity actSearch,Map<String,String> timeMap);
	/**
	 * 查询总条数
	 * 
	 * @return
	 */
	public int getCount(Activity act, Map<String, String> timeMap);

	public Object queryByActivity_Name(String name);

	public void delete(String[] ids);
}

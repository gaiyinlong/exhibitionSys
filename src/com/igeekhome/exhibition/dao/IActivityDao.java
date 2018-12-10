package com.igeekhome.exhibition.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.pojo.Activity;

/**
 * 
 * @author Gyl 2017年6月8日 exhibitionSys
 * 
 */
public interface IActivityDao {

	// 增加一个新活动
	public int saveActivity(Activity a);

	// 查询所有活动
	public List<Activity> queryAll();

	// 通过id删除活动
	public int deleteActivity(int actId);

	// 通过Id查询活动
	public Activity queryById(int actId);

	// 修改活动信息
	public int updateActivity(Activity a);

	/**
	 * @param act
	 * 
	 * @param timeMap
	 *            时间条件
	 * @param row
	 *            每页行数
	 * @param page
	 *            要查询的页码
	 * @return
	 */
	public List<Activity> query(Activity act, Map<String, String> timeMap);

	/**
	 * 查询总条数
	 * 
	 * @return
	 */
	public int getCount(Activity act, Map<String, String> timeMap);

	public Object queryByActivity_Name(String name);

	/**
	 * 批量删除
	 */
	public void delete(String[] ids);
}

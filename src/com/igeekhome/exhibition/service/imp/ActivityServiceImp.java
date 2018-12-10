package com.igeekhome.exhibition.service.imp;

import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.dao.IActivityDao;
import com.igeekhome.exhibition.dao.imp.ActivityDAOImp;
import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.pojo.User;
import com.igeekhome.exhibition.service.IActivityService;
import com.igeekhome.exhibition.util.MD5Util;
import com.igeekhome.exhibition.util.Pager;

public class ActivityServiceImp implements IActivityService {

	private IActivityDao DAO = new ActivityDAOImp();

	@Override
	public int saveActivity(Activity a) {

		return DAO.saveActivity(a);
	}

	@Override
	public List<Activity> queryAll() {

		return DAO.queryAll();
	}

	@Override
	public int deleteActivity(int actId) {

		return DAO.deleteActivity(actId);
	}

	@Override
	public Activity queryById(int actId) {

		return DAO.queryById(actId);
	}

	@Override
	public int updateActivity(Activity a) {

		return DAO.updateActivity(a);
	}

	@Override
	public List<Activity> query(Activity act, Map<String, String> timeMap) {

		return DAO.query(act, timeMap);

	}

	@Override
	public int getCount(Activity act, Map<String, String> timeMap) {

		return DAO.getCount(act, timeMap);
	}

	@Override
	public Object queryByActivity_Name(String name) {

		Activity a = (Activity) DAO.queryByActivity_Name(name);

		if (a == null) {
			return null;
		}
		if (name.equals(a.getActivity_name())) {
			return a;
		}
		return null;
	}

	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub

	}

}

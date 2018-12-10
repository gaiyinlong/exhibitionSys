package com.igeekhome.exhibition.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.igeekhome.exhibition.dao.IActivityDao;
import com.igeekhome.exhibition.pojo.Activity;

/**
 * 
 * @author Gyl 2017年6月8日 exhibitionSys
 */
public class ActivityDAOImp extends BaseDAO implements IActivityDao {

	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	@Override
	public int saveActivity(Activity a) {

		int result = -1;
		String sql = "insert into e_activity (province,city,activity_name,start_time,end_time,activity_address,leader_name,leader_tel)values(?,?,?,?,?,?,?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, a.getProvince());
			pst.setString(2, a.getCity());
			pst.setString(3, a.getActivity_name());

			pst.setString(4, a.getStart_time());

			pst.setString(5, a.getEnd_time());
			pst.setString(6, a.getActivity_address());
			pst.setString(7, a.getLeader_name());
			pst.setString(8, a.getLeader_tel());

			result = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return result;

	}

	@Override
	public List<Activity> queryAll() {
		List<Activity> act = new ArrayList<Activity>();

		String sql = "select id,province,city,activity_name,start_time,end_time,activity_address,leader_name,leader_tel from e_activity ";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String province = rs.getString("province");
				String city = rs.getString("city");
				String aname = rs.getString("activity_name");
				String startTime = rs.getString("start_time");
				String endTime = rs.getString("end_time");
				String address = rs.getString("activity_address");
				String lname = rs.getString("leader_name");
				String ltel = rs.getString("leader_tel");
				Activity a = new Activity(id, province, city, aname, startTime, endTime, address, lname, ltel);

				act.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return act;
	}

	/**
	 * 通过ID删除活动
	 */
	@Override
	public int deleteActivity(int actId) {
		int result = -1;
		String sql = "delete from e_activity where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, actId);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;

	}

	/**
	 * 通过ID查询对应的活动
	 */
	@Override
	public Activity queryById(int actId) {
		Activity a = null;
		String sql = "select id, province,city,activity_name,start_time,end_time,activity_address,leader_name,leader_tel from e_activity where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, actId);
			rs = pst.executeQuery();
			if (rs.next()) {

				String pro = rs.getString("province");
				String city = rs.getString("city");
				String aname = rs.getString("activity_name");
				String startTime = rs.getString("start_time");
				String endTime = rs.getString("end_time");
				String address = rs.getString("activity_address");
				String leadName = rs.getString("leader_name");
				String tel = rs.getString("leader_tel");
				a = new Activity(actId, pro, city, aname, startTime, endTime, address, leadName, tel);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return a;
	}

	/**
	 * 修改活动基本信息
	 */
	@Override
	public int updateActivity(Activity a) {
		int result = -1;
		// if (a == null || a.getId() == 0) {
		// return result;

		// }

		String sql = "update e_activity set province=?,city=?, activity_name=?,start_time=?,end_time=?,activity_address=?,leader_name=?,leader_tel=? where id="
				+ a.getId();

		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			// 设置参数
			pst.setString(1, a.getProvince());
			pst.setString(2, a.getCity());
			pst.setString(3, a.getActivity_name());
			pst.setString(4, a.getStart_time());
			pst.setString(5, a.getEnd_time());
			pst.setString(6, a.getActivity_address());
			pst.setString(7, a.getLeader_name());
			pst.setString(8, a.getLeader_tel());
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	/**
	 * 条件查询（活動日期，活動負責人，活動名稱，省市）
	 */
	@Override
	public List<Activity> query(Activity actSearch, Map<String, String> timeMap) {
		List<Activity> activity = new ArrayList<Activity>();
		String sql = "select id,province,city,activity_name,start_time,end_time,activity_address,leader_name,leader_tel from e_activity where status=1";
		// 查询条件
		if (actSearch.getProvince() != null && !"".equals(actSearch.getProvince().trim())) {
			sql += " and province= " + actSearch.getProvince();
		}
		if (actSearch.getCity() != null && !"".equals(actSearch.getCity().trim())) {
			sql += " and city= " + actSearch.getCity();
		}
		if (actSearch.getActivity_name() != null && !"".equals(actSearch.getActivity_name().trim())) {
			sql += " and activity_name like '%" + actSearch.getActivity_name() + "%' ";
		}
		if (actSearch.getLeader_name() != null && !"".equals(actSearch.getLeader_name().trim())) {
			sql += " and leader_name like '%" + actSearch.getLeader_name() + "%' ";
		}
		// 时间查询
		if (timeMap.get("startTime") != null && !"".equals(timeMap.get("startTime"))) {
			sql += " and start_time >'" + actSearch.getStart_time() + "'";
		}
		if (timeMap.get("endTime") != null && !"".equals(timeMap.get("endTime"))) {
			sql += " and end_time <'" + actSearch.getEnd_time() + "'";
		}

		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String province = rs.getString("province");
				String city = rs.getString("city");
				String aname = rs.getString("activity_name");
				String stime = rs.getString("start_time");
				String etime = rs.getString("end_time");
				String lead = rs.getString("leader_name");

				String address = rs.getString("activity_address");
				String lname = rs.getNString("leader_name");
				String tel = rs.getString("leader_tel");

				Activity a = new Activity(id, province, city, aname, stime, etime, address, lname, tel);
				activity.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return activity;
	}

	@Override
	public int getCount(Activity actSearch, Map<String, String> timeMap) {
		int count = 0;
		String sql = "select count(id) from e_activity where status=1 ";
		// 查询条件 -----
		if (actSearch.getProvince() != null && !"".equals(actSearch.getProvince().trim())) {
			sql += " and province= " + actSearch.getProvince();
		}
		if (actSearch.getCity() != null && !"".equals(actSearch.getCity().trim())) {
			sql += " and city= " + actSearch.getCity();
		}
		if (actSearch.getActivity_name() != null && !"".equals(actSearch.getActivity_name().trim())) {
			sql += " and activity_name like '%" + actSearch.getActivity_name() + "%' ";
		}
		if (actSearch.getLeader_name() != null && !"".equals(actSearch.getLeader_name().trim())) {
			sql += " and leader_name like '%" + actSearch.getLeader_name() + "%' ";
		}

		// 时间
		if (timeMap.get("startTime") != null && !"".equals(timeMap.get("startTime"))) {
			sql += " and start_time >'" + actSearch.getStart_time() + "'";
		}
		if (timeMap.get("endTime") != null && !"".equals(timeMap.get("endTime"))) {
			sql += " and end_time >'" + actSearch.getEnd_time() + "'";
		}

		// 查询条件 -----
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return count;

	}

	@Override
	public Object queryByActivity_Name(String name) {

		Activity a = null;
		String sql = "select id,activity_name,leader_name from e_activity where activity_name = ?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setString(1, name);
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");

				String leaderName = rs.getString("leader_name");

				a = new Activity(id, name, leaderName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return a;

	}

	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub

	}

}

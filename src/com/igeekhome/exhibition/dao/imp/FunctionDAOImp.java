package com.igeekhome.exhibition.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.igeekhome.exhibition.dao.IFunctions;
import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.pojo.GoldenEge;
import com.igeekhome.exhibition.pojo.Prize;
import com.igeekhome.exhibition.pojo.RedPackage;

public class FunctionDAOImp extends BaseDAO implements IFunctions {

	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * 
	 * @param g
	 * @return
	 */
	@Override
	public int saveGoldenEge(GoldenEge g) {

		int result = -1;
		String sql = "insert into e_ege (egeName,activityId) values (?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getEgeName());
			pst.setInt(2, g.getActivityid());
			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	@Override
	public int savaPrize(Prize p) {

		int result = -1;
		String sql = "insert into e_prize (prize_name,activityId) values (?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, p.getPrize_name());
			pst.setInt(2, p.getActivityid());
			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	/**
	 * 
	 * @param r
	 * @return
	 */
	@Override
	public int saveRedPackege(RedPackage r) {

		int result = -1;
		String sql = "insert into e_red_package (money,activityId) values (?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setInt(1, r.getMoney());
			pst.setInt(2, r.getActivityid());

			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	/**
	 * 删除
	 * 
	 * @param eid
	 * @return
	 */
	@Override
	public int deleteGoldenEge(int eid) {

		int result = -1;
		String sql = "delete from e_ege where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, eid);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;

	}

	@Override
	public int deletePrize(int pid) {
		int result = -1;
		String sql = "delete from e_prize where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, pid);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;

	}

	@Override
	public int deleteRedPackege(int rid) {

		int result = -1;
		String sql = "delete from e_red_package where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, rid);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;

	}

	/**
	 * 修改
	 * 
	 * @param g
	 * @return
	 */
	@Override
	public int updateGoldenEge(GoldenEge g) {

		int result = -1;

		String sql = "update e_ege set egeName=? where id=" + g.getId();
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setString(1, g.getEgeName());
			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	@Override
	public int updatePrize(Prize p) {

		int result = -1;

		String sql = "update e_prize set prize_name=? where id=" + p.getId();
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setString(1, p.getPrize_name());
			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	@Override
	public int updateRedPackege(RedPackage r) {

		int result = -1;

		String sql = "update e_red_package set money=? where id=" + r.getId();
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setInt(1, r.getMoney());
			result = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;
	}

	@Override
	public List<GoldenEge> queryAllEgeByActivityId(int aid) {
		// System.out.println("进入数据层"+aid);
		List<GoldenEge> egg = new ArrayList<GoldenEge>();

		String sql = "select id,egeName from e_ege where activityId=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, aid);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String egeName = rs.getString("egeName");

				GoldenEge e = new GoldenEge(aid, id, egeName);

				egg.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return egg;
	}

	@Override
	public List<Prize> queryAllPrize(int pid) {

		List<Prize> prize = new ArrayList<Prize>();

		String sql = "select id,prize_name from e_prize where activityId=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, pid);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String pName = rs.getString("prize_name");

				Prize p = new Prize(pid,id, pName);
				prize.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return prize;
	}

	@Override
	public List<RedPackage> queryAllRedPackage(int rid) {

		List<RedPackage> red = new ArrayList<RedPackage>();

		String sql = "select id,money from e_red_package where activityId=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, rid);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int money = rs.getInt("money");
				RedPackage r = new RedPackage(rid, id, money);
				red.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return red;
	}

	/**
	 * 查询金蛋通过名字
	 */
	@Override
	public List<GoldenEge> queryAllEgeByEgeName(String egeName) {
		// TODO Auto-generated method stub
		return null;
	}
}
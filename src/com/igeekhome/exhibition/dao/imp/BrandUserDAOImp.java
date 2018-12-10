package com.igeekhome.exhibition.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.igeekhome.exhibition.dao.IBrandUser;
import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.pojo.BrandUser;

public class BrandUserDAOImp extends BaseDAO implements IBrandUser {

	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * 查询品牌名称是否存在！
	 */
	@Override
	public BrandUser queryByBrandName(String name) {

		BrandUser bu = null;

		String sql = "select id, brand_name from e_brand_user where brand_name = ?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);

			pst.setString(1, name);
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");

				bu = new BrandUser(id, name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return bu;

	}

	/**
	 * 添加品牌用户
	 */
	@Override
	public int addBrandUser(BrandUser bu) {
		int result = -1;
		String sql = "insert into e_brand_user (loginName,loginPass,province,city,brand_code,brand_name,brand_leader,brande_leaderTel)values(?,?,?,?,?,?,?,?)";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, bu.getLoginName());
			pst.setString(2, bu.getLoginPass());
			pst.setString(3, bu.getProvince());
			pst.setString(4, bu.getCity());
			pst.setString(5, bu.getBrand_code());
			pst.setString(6, bu.getBrand_name());
			pst.setString(7, bu.getBrand_leader());
			pst.setString(8, bu.getBrand_leaderTel());

			result = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return result;

	}

	/**
	 * 查询品牌用户列表
	 */
	@Override
	public List<BrandUser> queryAll() {

		List<BrandUser> bran = new ArrayList<BrandUser>();

		String sql = "select id,loginName,province,city,brand_code,brand_name,brand_leader,brande_leaderTel from e_brand_user ";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String lname = rs.getString("loginName");
				String pro = rs.getString("province");
				String city = rs.getString("city");
				String bcode = rs.getString("brand_code");
				String bname = rs.getString("brand_name");
				String bleader = rs.getString("brand_leader");
				String blt = rs.getString("brande_leaderTel");

				BrandUser bu = new BrandUser(id, lname, pro, city, bcode, bname, bleader, blt);

				bran.add(bu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return bran;

	}

	/**
	 * 根据iD删除品牌用户
	 */
	@Override
	public int deleteBrandUserById(int id) {

		int result = -1;
		String sql = "delete from e_brand_user where id=?";
		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return result;

	}

	/**
	 * 通过id搜索品牌用户
	 */
	@Override
	public BrandUser queryByBrandId(int brandid) {

		BrandUser b = null;
		String sql = "select loginName,province,city,brand_code,brand_name,brand_leader,brande_leaderTel from e_brand_user where id=?";

		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setInt(1, brandid);
			rs = pst.executeQuery();
			if (rs.next()) {
				String loginName = rs.getString("loginName");
				String pro = rs.getString("province");
				String city = rs.getString("city");
				String bCode = rs.getString("brand_code");
				String bname = rs.getString("brand_name");
				String leader = rs.getString("brand_leader");
				String tel = rs.getString("brande_leaderTel");

				b = new BrandUser(brandid, loginName, pro, city, bCode, bname, leader, tel);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return b;
	}

	/**
	 * 修改品牌用户信息
	 */
	@Override
	public int updateBrandUser(BrandUser b) {

		int result = -1;

		String sql = "update e_brand_user set loginName=?, province=?,city=?,brand_code=?,brand_name=?,brand_leader=?,brande_leaderTel=? where id="
				+ b.getId();

		try {
			con = getCon();
			pst = con.prepareStatement(sql);
			pst.setString(1, b.getLoginName());
			pst.setString(2, b.getProvince());
			pst.setString(3, b.getCity());
			pst.setString(4, b.getBrand_code());
			pst.setString(5, b.getBrand_name());
			pst.setString(6, b.getBrand_leader());
			pst.setString(7, b.getBrand_leaderTel());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}

		return result;
	}
}

package com.igeekhome.exhibition.service.imp;

import java.util.List;

import com.igeekhome.exhibition.dao.IBrandUser;
import com.igeekhome.exhibition.dao.imp.BaseDAO;
import com.igeekhome.exhibition.dao.imp.BrandUserDAOImp;
import com.igeekhome.exhibition.pojo.BrandUser;
import com.igeekhome.exhibition.service.IBrandUserService;

public class BrandUserServiceImp extends BaseDAO implements IBrandUserService {

	private IBrandUser DAO = new BrandUserDAOImp();

	@Override
	public BrandUser queryByBrandName(String name) {

		BrandUser bu = DAO.queryByBrandName(name);
		if (bu == null) {
			return null;
		}
		if (name.equals(bu.getBrand_name())) {
			return bu;
		}

		return null;
	}

	@Override
	public int addBrandUser(BrandUser bu) {

		return DAO.addBrandUser(bu);
	}

	@Override
	public List<BrandUser> queryAll() {

		return DAO.queryAll();
	}

	@Override
	public int deleteBrandUserById(int id) {

		return DAO.deleteBrandUserById(id);
	}

	@Override
	public BrandUser queryById(int brandid) {

		return DAO.queryByBrandId(brandid);
	}

	@Override
	public int updateBrandUser(BrandUser b) {

		return DAO.updateBrandUser(b);
	}

}

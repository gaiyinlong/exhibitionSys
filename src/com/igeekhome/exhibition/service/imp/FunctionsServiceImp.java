package com.igeekhome.exhibition.service.imp;

import java.util.List;

import com.igeekhome.exhibition.dao.IFunctions;
import com.igeekhome.exhibition.dao.imp.FunctionDAOImp;
import com.igeekhome.exhibition.pojo.GoldenEge;
import com.igeekhome.exhibition.pojo.Prize;
import com.igeekhome.exhibition.pojo.RedPackage;
import com.igeekhome.exhibition.service.IFunctionsService;

/**
 * 
 * @author Gyl 2017Äê6ÔÂ17ÈÕ exhibitionSys
 */
public class FunctionsServiceImp implements IFunctionsService {
	private IFunctions DAO = new FunctionDAOImp();

	@Override
	public int saveGoldenEge(GoldenEge g) {

		return DAO.saveGoldenEge(g);
	}

	@Override
	public int savaPrize(Prize p) {

		return DAO.savaPrize(p);
	}

	@Override
	public int saveRedPackege(RedPackage r) {

		return DAO.saveRedPackege(r);
	}

	@Override
	public int deleteGoldenEge(int eid) {

		return DAO.deleteGoldenEge(eid);
	}

	@Override
	public int deletePrize(int pid) {

		return DAO.deletePrize(pid);
	}

	@Override
	public int deleteRedPackege(int rid) {

		return DAO.deleteRedPackege(rid);
	}

	@Override
	public int updateGoldenEge(GoldenEge g) {

		return DAO.updateGoldenEge(g);
	}

	@Override
	public int updatePrize(Prize p) {

		return DAO.updatePrize(p);
	}

	@Override
	public int updateRedPackege(RedPackage r) {

		return DAO.updateRedPackege(r);
	}

	@Override
	public List<GoldenEge> queryAllEgeByActivityId(int aid) {

		return DAO.queryAllEgeByActivityId(aid);
	}

	@Override
	public List<Prize> queryAllPrize(int pid) {

		return DAO.queryAllPrize(pid);
	}

	@Override
	public List<RedPackage> queryAllRedPackage(int rid) {

		return DAO.queryAllRedPackage(rid);
	}

}

package com.igeekhome.exhibition.service;

import java.util.List;

import com.igeekhome.exhibition.pojo.GoldenEge;
import com.igeekhome.exhibition.pojo.Prize;
import com.igeekhome.exhibition.pojo.RedPackage;

/**
 * 
 * @author Gyl 2017年6月17日 exhibitionSys
 */
public interface IFunctionsService {

	// 添加功能
	public int saveGoldenEge(GoldenEge g);

	public int savaPrize(Prize p);

	public int saveRedPackege(RedPackage r);

	// 删除功能
	public int deleteGoldenEge(int eid);

	public int deletePrize(int pid);

	public int deleteRedPackege(int rid);

	// 修改功能
	public int updateGoldenEge(GoldenEge g);

	public int updatePrize(Prize p);

	public int updateRedPackege(RedPackage r);
	//查询功能
	public List<GoldenEge> queryAllEgeByActivityId(int aid);

	public List<Prize> queryAllPrize(int pid);

	public List<RedPackage> queryAllRedPackage(int rid);
}

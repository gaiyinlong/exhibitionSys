package com.igeekhome.exhibition.dao;

import java.util.List;

import com.igeekhome.exhibition.pojo.GoldenEge;
import com.igeekhome.exhibition.pojo.Prize;
import com.igeekhome.exhibition.pojo.RedPackage;

/**
 * ������ҽ𵰣��齱���ܽӿ�
 * 
 * @author Gyl 2017��6��16�� exhibitionSys
 */
public interface IFunctions {

	// ��ӹ���
	public int saveGoldenEge(GoldenEge g);

	public int savaPrize(Prize p);

	public int saveRedPackege(RedPackage r);

	// ɾ������
	public int deleteGoldenEge(int eid);

	public int deletePrize(int pid);

	public int deleteRedPackege(int rid);

	// �޸Ĺ���
	public int updateGoldenEge(GoldenEge g);

	public int updatePrize(Prize p);

	public int updateRedPackege(RedPackage r);

	// ��ѯ����

	public List<GoldenEge> queryAllEgeByActivityId(int aid);
	public List<GoldenEge> queryAllEgeByEgeName(String egeName);
	
	

	public List<Prize> queryAllPrize(int pid);

	public List<RedPackage> queryAllRedPackage(int rid);
}

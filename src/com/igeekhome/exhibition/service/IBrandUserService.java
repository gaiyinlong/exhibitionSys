package com.igeekhome.exhibition.service;

import java.util.List;


import com.igeekhome.exhibition.pojo.BrandUser;

/**
 * 
 * @author Gyl 2017��6��12�� exhibitionSys
 */
public interface IBrandUserService {

	// ��ѯƷ��ͨ��Ʒ������
	public BrandUser queryByBrandName(String name);

	// ���Ʒ���û�
	public int addBrandUser(BrandUser bu);
	//Ʒ���û��б�
	public List<BrandUser> queryAll();
	
	
	//ͨ��IDɾ��
	public int deleteBrandUserById(int id );
	//ͨ��id����Ʒ���û�
	public BrandUser queryById(int brandid);

	public int updateBrandUser(BrandUser b);

}

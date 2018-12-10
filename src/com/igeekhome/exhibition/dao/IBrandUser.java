package com.igeekhome.exhibition.dao;

import java.util.List;

import com.igeekhome.exhibition.pojo.BrandUser;

/**
 * Ʒ���û�
 * @author Gyl
 * 2017��6��12��
 * exhibitionSys
 */
public interface IBrandUser {

	
	//��ѯƷ��ͨ��Ʒ������
	public BrandUser queryByBrandName(String name);
	//���Ʒ���û�
	public int addBrandUser(BrandUser bu);
	//��ѯ����
	public List<BrandUser> queryAll();
	//ͨ��IDɾ��Ʒ���û�
	public int deleteBrandUserById(int id);
	//ͨ��id����Ʒ���û�
	public BrandUser queryByBrandId(int brandid);
	//�޸�Ʒ���û���Ϣ
	public int updateBrandUser(BrandUser b);
	
	
	
}

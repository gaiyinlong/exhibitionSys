package com.igeekhome.exhibition.service;

import java.util.List;


import com.igeekhome.exhibition.pojo.BrandUser;

/**
 * 
 * @author Gyl 2017年6月12日 exhibitionSys
 */
public interface IBrandUserService {

	// 查询品牌通过品牌名称
	public BrandUser queryByBrandName(String name);

	// 添加品牌用户
	public int addBrandUser(BrandUser bu);
	//品牌用户列表
	public List<BrandUser> queryAll();
	
	
	//通过ID删除
	public int deleteBrandUserById(int id );
	//通过id搜索品牌用户
	public BrandUser queryById(int brandid);

	public int updateBrandUser(BrandUser b);

}

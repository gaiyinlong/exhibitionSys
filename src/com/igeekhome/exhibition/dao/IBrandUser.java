package com.igeekhome.exhibition.dao;

import java.util.List;

import com.igeekhome.exhibition.pojo.BrandUser;

/**
 * 品牌用户
 * @author Gyl
 * 2017年6月12日
 * exhibitionSys
 */
public interface IBrandUser {

	
	//查询品牌通过品牌名称
	public BrandUser queryByBrandName(String name);
	//添加品牌用户
	public int addBrandUser(BrandUser bu);
	//查询所有
	public List<BrandUser> queryAll();
	//通过ID删除品牌用户
	public int deleteBrandUserById(int id);
	//通过id搜索品牌用户
	public BrandUser queryByBrandId(int brandid);
	//修改品牌用户信息
	public int updateBrandUser(BrandUser b);
	
	
	
}

package com.igeekhome.exhibition.pojo;

/**
 * 
 * @author Gyl 2017年6月10日 exhibitionSys 品牌用户
 */
public class BrandUser {

	private int id;
	private String loginName;
	private String loginPass;
	private String province;
	private String city;
	private int activity_id;

	private String brand_code;
	private String brand_name;

	private String brand_leader;
	private String brand_leaderTel;

	public BrandUser(int id, String brand_name) {
		super();
		this.setId(id);
		this.brand_name = brand_name;
	}

	public BrandUser() {
	}

	public BrandUser(String loginName, String brand_code, String brand_name, String brand_leader,
			String brand_leaderTel) {
		super();
		this.loginName = loginName;
		this.brand_code = brand_code;
		this.brand_name = brand_name;
		this.brand_leader = brand_leader;
		this.brand_leaderTel = brand_leaderTel;
	}

	public BrandUser(int id, String loginName, String province, String city, int activity_id, String brand_code,
			String brand_name, String brand_leader, String brand_leaderTel) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.province = province;
		this.city = city;
		this.activity_id = activity_id;
		this.brand_code = brand_code;
		this.brand_name = brand_name;
		this.brand_leader = brand_leader;
		this.brand_leaderTel = brand_leaderTel;
	}

	public BrandUser(int id, String loginName, String province, String city, String brand_code, String brand_name,
			String brand_leader, String brand_leaderTel) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.province = province;
		this.city = city;
		this.brand_code = brand_code;
		this.brand_name = brand_name;
		this.brand_leader = brand_leader;
		this.brand_leaderTel = brand_leaderTel;
	}

	public BrandUser(String loginName, String loginPass, String province, String city, String brand_code,
			String brand_name, String brand_leader, String brand_leaderTel) {
		super();
		this.loginName = loginName;
		this.loginPass = loginPass;
		this.province = province;
		this.city = city;
		this.brand_code = brand_code;
		this.brand_name = brand_name;
		this.brand_leader = brand_leader;
		this.brand_leaderTel = brand_leaderTel;
	}

	public BrandUser(int id, String loginName, String loginPass, int activity_id, String brand_name, String brand_code,
			String brand_leader, String brand_leaderTel) {
		super();
		this.setId(id);
		this.loginName = loginName;
		this.loginPass = loginPass;
		this.activity_id = activity_id;
		this.brand_name = brand_name;
		this.brand_code = brand_code;
		this.brand_leader = brand_leader;
		this.brand_leaderTel = brand_leaderTel;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getBrand_code() {
		return brand_code;
	}

	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}

	public String getBrand_leader() {
		return brand_leader;
	}

	public void setBrand_leader(String brand_leader) {
		this.brand_leader = brand_leader;
	}

	public String getBrand_leaderTel() {
		return brand_leaderTel;
	}

	public void setBrand_leaderTel(String brand_leaderTel) {
		this.brand_leaderTel = brand_leaderTel;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public int getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}

package com.igeekhome.exhibition.pojo;



public class User {
	private int userId;
	private String loginName;
	private String loginPass;
	private String createTime;
	private String modifyTime;
	private int roleId;
	


	public User(int userId, String loginName, String loginPass) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.loginPass = loginPass;



	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName
	 *            the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the loginPass
	 */
	public String getLoginPass() {
		return loginPass;
	}

	/**
	 * @param loginPass
	 *            the loginPass to set
	 */
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}






	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

}

package com.igeekhome.exhibition.pojo;

/**
 * 
 * @author Gyl 2017Äê6ÔÂ16ÈÕ exhibitionSys
 */
public class RedPackage {
	private int id;
	private int money;
	private int activityid;

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @param id
	 * @param money
	 */

	/**
	 * @param money
	 * @param activityid
	 */
	public RedPackage(int money, int activityid) {

		this.activityid = activityid;
		this.money = money;
	}

	/**
	 * @param id
	 * @param money
	 * @param activityid
	 */
	public RedPackage(int activityid, int id, int money) {

		this.activityid = activityid;
		this.id = id;
		this.money = money;
	}

}

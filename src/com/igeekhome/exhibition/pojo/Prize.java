package com.igeekhome.exhibition.pojo;

/**
 * 
 * @author Gyl 2017Äê6ÔÂ16ÈÕ exhibitionSys
 */

public class Prize {

	private int id;
	private String prize_name;
	private int activityid;

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	/**
	 * @param prize_name
	 * @param activityid
	 */
	public Prize(String prize_name, int activityid) {

		this.prize_name = prize_name;
		this.activityid = activityid;
	}

	/**
	 * @param id
	 * @param prize_name
	 */

	public Prize(int acticityid, int id, String prize_name) {

		this.activityid = acticityid;
		this.id = id;
		this.prize_name = prize_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrize_name() {
		return prize_name;
	}

	public void setPrize_name(String prize_name) {
		this.prize_name = prize_name;
	}

}

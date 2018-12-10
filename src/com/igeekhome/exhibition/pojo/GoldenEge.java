package com.igeekhome.exhibition.pojo;

/**
 * 
 * @author Gyl 2017Äê6ÔÂ16ÈÕ exhibitionSys
 */
public class GoldenEge {

	private int id;
	private String egeName;
	private int activityid;

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	/**
	 * @param egeName
	 * @param activityid
	 */
	public GoldenEge(String egeName, int activityid) {
		super();
		this.egeName = egeName;
		this.activityid = activityid;
	}

	/**
	 * @param id
	 * @param egeName
	 */
	public GoldenEge(int activityid,int id, String egeName ) {

		this.activityid = activityid;
		this.id = id;
		this.egeName = egeName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEgeName() {
		return egeName;
	}

	public void setEgeName(String egeName) {
		this.egeName = egeName;
	}

}

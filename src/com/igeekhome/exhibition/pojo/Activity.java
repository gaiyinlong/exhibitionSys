package com.igeekhome.exhibition.pojo;

/**
 * 
 * @author Gyl 2017年6月8日 exhibitionSys 活动实体类
 */
public class Activity {

	private int id;
	private String province;
	private String city;
	private String activity_name;
	private String start_time;
	private String end_time;
	private String activity_address;
	private String leader_name;
	private String leader_tel;
	private int status;

	public Activity() {
		super();
	}

	public Activity(int id, String activity_name, String leader_name) {
		super();
		this.id = id;
		this.activity_name = activity_name;
		this.leader_name = leader_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getActivity_address() {
		return activity_address;
	}

	public void setActivity_address(String activity_address) {
		this.activity_address = activity_address;
	}

	public String getLeader_name() {
		return leader_name;
	}

	public void setLeader_name(String leader_name) {
		this.leader_name = leader_name;
	}

	public String getLeader_tel() {
		return leader_tel;
	}

	public void setLeader_tel(String leader_tel) {
		this.leader_tel = leader_tel;
	}

	/**
	 * @param id
	 * @param province
	 * @param city
	 * @param activity_name
	 * @param start_time
	 * @param end_time
	 * @param leader_name
	 */
	public Activity(int id, String province, String city, String activity_name, String start_time, String end_time,
			String leader_name) {

		this.id = id;
		this.province = province;
		this.city = city;
		this.activity_name = activity_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.leader_name = leader_name;
	}

	/**
	 * @param province
	 * @param city
	 * @param activity_name
	 * @param start_time
	 * @param end_time
	 * @param leader_name
	 */

	public Activity(String province, String city, String activity_name, String start_time, String end_time,
			String activity_address, String leader_name, String leader_tel) {
		super();
		this.province = province;
		this.city = city;
		this.activity_name = activity_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.activity_address = activity_address;
		this.leader_name = leader_name;
		this.leader_tel = leader_tel;
	}

	public Activity(int id, String province, String city, String activity_name, String start_time, String end_time,
			String activity_address, String leader_name, String leader_tel) {
		super();
		this.id = id;
		this.province = province;
		this.city = city;
		this.activity_name = activity_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.activity_address = activity_address;
		this.leader_name = leader_name;
		this.leader_tel = leader_tel;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}

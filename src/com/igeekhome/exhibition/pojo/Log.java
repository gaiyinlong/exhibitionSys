package com.igeekhome.exhibition.pojo;



public class Log {
	private int logId;// ���
	private int userId;// �û�������
	private String loginName;// ��¼��
	private String ipAddress;// IP��ַ
	private String message;// ����
	private String logTime;// ��½��ʱ��
	private String exitTime;// �˳�ϵͳ��ʱ��
	private String statue;//״̬

	
	
	
	public Log() {
		super();
	}

	public Log(int logId, int userId, String loginName, String ipAddress, String message, String logTime,String exitTime) {

		this.logId = logId;
		this.userId = userId;
		this.loginName = loginName;
		this.ipAddress = ipAddress;
		this.message = message;
		this.logTime = logTime;
		this.exitTime=exitTime;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the logId
	 */
	public int getLogId() {
		return logId;
	}

	/**
	 * @param logId
	 *            the logId to set
	 */
	public void setLogId(int logId) {
		this.logId = logId;
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
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the logTime
	 */
	public String getLogTime() {
		return logTime;
	}

	/**
	 * @param logTime
	 *            the logTime to set
	 */
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getExitTime() {
		return exitTime;
	}

	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
	}

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

}

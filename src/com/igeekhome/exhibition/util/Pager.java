package com.igeekhome.exhibition.util;

import java.util.List;

/**
 * 分页
 * 
 * @author Gyl 2017年6月21日 exhibitionSys
 */
public class Pager<T> {

	private int page;//需要查询的页码
	private int row;//每页行数
	private int total;//总行数
	private int maxPageNum;//最大页码数
	private int pagerStart;//其实页
	private int pagerEnd;//尾页
	private List<T> rows;

	/**
	 * 
	 */
	public Pager() {
		super();
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMaxPageNum() {
		return maxPageNum;
	}

	public void setMaxPageNum(int maxPageNum) {
		this.maxPageNum = maxPageNum;
	}

	public int getPagerStart() {
		return pagerStart;
	}

	public void setPagerStart(int pagerStart) {
		this.pagerStart = pagerStart;
	}

	public int getPagerEnd() {
		return pagerEnd;
	}

	public void setPagerEnd(int pagerEnd) {
		this.pagerEnd = pagerEnd;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}

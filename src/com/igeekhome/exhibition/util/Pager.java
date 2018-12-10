package com.igeekhome.exhibition.util;

import java.util.List;

/**
 * ��ҳ
 * 
 * @author Gyl 2017��6��21�� exhibitionSys
 */
public class Pager<T> {

	private int page;//��Ҫ��ѯ��ҳ��
	private int row;//ÿҳ����
	private int total;//������
	private int maxPageNum;//���ҳ����
	private int pagerStart;//��ʵҳ
	private int pagerEnd;//βҳ
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

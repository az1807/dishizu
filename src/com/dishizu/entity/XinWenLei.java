package com.dishizu.entity;

public class XinWenLei {
	private int idxinwen;
	private String xinwenleibie;

	public int getidxinwen() {
		return idxinwen;
	}

	public void setidxinwen(int idxinwen) {
		this.idxinwen = idxinwen;
	}

	public String getxinwenleibie() {
		return xinwenleibie;
	}

	public void setxinwenleibie(String xinwenleibie) {
		this.xinwenleibie = xinwenleibie;
	}

	public XinWenLei(int idxinwen, String xinwenleibie) {
		super();
		this.idxinwen = idxinwen;
		this.xinwenleibie = xinwenleibie;
	}

	public XinWenLei() {

	}

	@Override
	public String toString() {
		return "XinWenLei [idxinwen=" + idxinwen + ", xinwenleibie=" + xinwenleibie + "]";
	}
	
}

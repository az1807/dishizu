package com.dishizu.entity;

public class XinWenXQ {
	private int idxinwen;
	private String xinwenxq;
	public int getIdxinwen() {
		return idxinwen;
	}
	public void setIdxinwen(int idxinwen) {
		this.idxinwen = idxinwen;
	}
	public String getXinWenxq() {
		return xinwenxq;
	}
	public void setXinWenxq(String xinWenxq) {
		xinwenxq = xinWenxq;
	}
	
	
	public XinWenXQ(int idxinwen, String xinWenxq) {
		
		this.idxinwen = idxinwen;
		xinwenxq = xinWenxq;
	}
	
	public XinWenXQ() {
		
	}
	@Override
	public String toString() {
		return "XinWenXQ [idxinwen=" + idxinwen + ", xinwenxq=" + xinwenxq
				+ "]";
	}
	
	
	
	

}

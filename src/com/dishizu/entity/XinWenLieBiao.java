package com.dishizu.entity;

public class XinWenLieBiao {
	private int idxinwen;
	private String xinwenliebiao;
	public int getXinwenid() {
		return idxinwen;
	}
	public void setXinwenid(int idxinwen) {
		this.idxinwen = idxinwen;
	}
	public String getXinwenliebiao() {
		return xinwenliebiao;
	}
	public void setXinwenliebiao(String xinwenliebiao) {
		this.xinwenliebiao = xinwenliebiao;
	}
	
	public XinWenLieBiao(int idxinwen, String xinwenliebiao) {
	
		this.idxinwen = idxinwen;
		this.xinwenliebiao = xinwenliebiao;
	}

	public XinWenLieBiao() {

	}
	@Override
	public String toString() {
		return "XinWenLieBiao [idxinwen=" + idxinwen + ", xinwenliebiao="
				+ xinwenliebiao + "]";
	}
	
}

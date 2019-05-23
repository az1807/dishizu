package com.dishizu.entity;

public class XinWenLieBiao {
	private int xinwenid;
	private String xinwenliebiao;
	public int getXinwenid() {
		return xinwenid;
	}
	public void setXinwenid(int xinwenid) {
		this.xinwenid = xinwenid;
	}
	public String getXinwenliebiao() {
		return xinwenliebiao;
	}
	public void setXinwenliebiao(String xinwenliebiao) {
		this.xinwenliebiao = xinwenliebiao;
	}
	
	public XinWenLieBiao(int xinwenid, String xinwenliebiao) {
	
		this.xinwenid = xinwenid;
		this.xinwenliebiao = xinwenliebiao;
	}

	public XinWenLieBiao() {

	}
	@Override
	public String toString() {
		return "XinWenLieBiao [xinwenid=" + xinwenid + ", xinwenliebiao="
				+ xinwenliebiao + "]";
	}
	
}

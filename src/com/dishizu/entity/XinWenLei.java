package com.dishizu.entity;

public class XinWenLei {
	private int id;
	private String leib;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeib() {
		return leib;
	}

	public void setLeib(String leib) {
		this.leib = leib;
	}

	public XinWenLei(int id, String leib) {
		super();
		this.id = id;
		this.leib = leib;
	}

	public XinWenLei() {

	}

	@Override
	public String toString() {
		return "XinWenLei [id=" + id + ", leib=" + leib + "]";
	}
	
}

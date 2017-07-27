package com.liu.ssm.pojo;

public class SysPermission {
	
	private int id;
	
	private String name;
	
	private String type;
	
	private String url;
	
	private String percode;
	
	private int parentid;
	
	private String parentids;
	
	private String sortstring;
	
	private char available;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPercode() {
		return percode;
	}

	public void setPercode(String percode) {
		this.percode = percode;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getParentids() {
		return parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getSortstring() {
		return sortstring;
	}

	public void setSortstring(String sortstring) {
		this.sortstring = sortstring;
	}

	public char getAvailable() {
		return available;
	}

	public void setAvailable(char available) {
		this.available = available;
	}
	
	
	
	
	
	
	
	
	
	
	
}

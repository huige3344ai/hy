package com.vince.model;

/**
 * 数据模型
 * @author lamp
 *
 */
public class person {

	private int tid;
	private String name;
	private String sex;

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return sex;
	}
	public void setDescription(String description) {
		this.sex = description;
	}

	public person(int tid, String name, String sex) {
		super();
		this.tid = tid;
		this.name = name;
		this.sex = sex;

	}
	public person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public person() {
		super();
	}
	
	
}

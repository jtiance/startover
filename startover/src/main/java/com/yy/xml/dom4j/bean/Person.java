package com.yy.xml.dom4j.bean;

public class Person {
	private String name;
	private String gender;
	private Integer task;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getTask() {
		return task;
	}

	public void setTask(Integer task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", task=" + task;
	}

}

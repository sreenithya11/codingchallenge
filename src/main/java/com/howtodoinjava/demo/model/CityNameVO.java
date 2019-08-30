package com.howtodoinjava.demo.model;

import java.io.Serializable;

public class CityNameVO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String city;
	private String action;
	

	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", city=" + city + "]";
	}
}
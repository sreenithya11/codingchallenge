package com.howtodoinjava.demo.dao;

import java.util.List;

import com.howtodoinjava.demo.model.CityNameVO;

public interface EmployeeDAO 
{
	public List<CityNameVO> getAllEmployees();
}
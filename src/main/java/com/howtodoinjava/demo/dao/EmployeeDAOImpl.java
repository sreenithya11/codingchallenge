package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.CityNameVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public List<CityNameVO> getAllEmployees() 
	{
		List<CityNameVO> employees = new ArrayList<CityNameVO>();
		
		CityNameVO vo1 = new CityNameVO();
		vo1.setId(1);
		vo1.setCity("London");
		employees.add(vo1);
		
		CityNameVO vo2 = new CityNameVO();
		vo2.setId(2);
		vo2.setCity("Bombay");
		employees.add(vo2);
		
		return employees;
	}
}
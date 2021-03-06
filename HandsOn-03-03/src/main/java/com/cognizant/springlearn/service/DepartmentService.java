package com.cognizant.springlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.springlearn.dao.DepartmentDao;
import com.cognizant.springlearn.model.Department;

@Service
public class DepartmentService {
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	@Autowired
	DepartmentDao dao;
	
	@Transactional
	public List<Department> getAllDepartments() {
		LOGGER.debug("Start");
		LOGGER.debug("End");
		return dao.getAllDepartments();
	}

}
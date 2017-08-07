package com.qfedu.mapper;

import java.util.List;

import com.qfedu.domain.Department;

public interface DepartmentMapper {

	List<Department> findAll();
	
	Department findById(int no);
}

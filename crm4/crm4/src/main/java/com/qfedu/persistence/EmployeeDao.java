package com.qfedu.persistence;

import com.qfedu.domain.Employee;

public interface EmployeeDao 
		extends BaseDao<Employee, Integer> {
	
//	int getCountByDepartment(Department department);
//	
//	List<Employee> findByDepartment(Department department);
//	
//	PageBean<Employee> findByPageWithDepartment(int page, int size, Department department);
}

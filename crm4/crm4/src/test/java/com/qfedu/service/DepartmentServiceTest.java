package com.qfedu.service;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.domain.Department;

import config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService deptService;
	
	@Test
	public void testFindAll() {
		List<Department> deptList = deptService.listAllDepartments();
		assertNotNull(deptList);
		assertThat(deptList.size(), greaterThanOrEqualTo(3));
	}
}

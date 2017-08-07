package com.qfedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.qfedu.domain.Department;
import com.qfedu.service.DepartmentService;

// 测试例(Test-Case)
// 测试集(Test-Suite) - 把多个相关的测试例组织到一起
public class DeptControllerTest {

	@Test
	public void testListAllDepts() throws Exception {
		DeptController controller = new DeptController();
		DepartmentService deptService = Mockito.mock(DepartmentService.class);
		List<Department> value = new ArrayList<>();
		Mockito.when(deptService.listAllDepartments()).thenReturn(value);
		controller.setDeptService(deptService);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/index"))
			.andExpect(MockMvcResultMatchers.view().name("dept"))
			.andExpect(MockMvcResultMatchers.model().attributeExists("deptList"))
			.andExpect(MockMvcResultMatchers.model().size(1));
	}
}

package com.qfedu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qfedu.domain.Department;
import com.qfedu.service.DepartmentService;

@Controller
class DeptController {

	@Autowired
	private DepartmentService deptService;
	
	public void setDeptService(DepartmentService deptService) {
		this.deptService = deptService;
	}
	
	@GetMapping(value = "/index")
	public ModelAndView listAllDepts() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("deptList", deptService.listAllDepartments());
		mav.setViewName("dept");
		return mav;
	}
	
	@GetMapping(value = "/del")
	public String deleteDept(Department department) {
		deptService.removeDepartment(department);
		return "redirect: index";
	}
	
	@GetMapping(value = "to_add")
	public String toAddDept() {
		return "add_dept";
	}
	
	@PostMapping(value = "/add")
	public String addDept(@Valid Department department, Errors errors, Model model) {
		if (errors.hasErrors()) {
			model.addAttribute("hint", "请输入有效的部门信息");
			return "add_dept";
		} else {
			if (deptService.addNewDepartment(department)) {
				return "redirect: index";
			} else {
				model.addAttribute("hint", "新增部门失败!");
				return "add_dept";
			}
		}
	}
}

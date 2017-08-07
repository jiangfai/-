package com.qfedu.controller;

import org.springframework.stereotype.Controller;

@Controller
public class EmpController {
//	@Autowired
//	private EmployeeService empService;
//	
//	@GetMapping(value = "/employee/{no}", produces = "application/json;charset=utf-8")
//	@ResponseBody
//	public Employee getEmployee(@PathVariable Integer no) {
//		return empService.getEmployeeByNo(no);
//	}
//	
//	// @ExceptionHandler(java.lang.Exception.class)
//	@PostMapping(value = "/employee", produces = "application/json;charset=utf-8")
//	@ResponseBody
//	public Employee addEmployee(Employee employee) {
//		return empService.addNewEmployee(employee)? employee : null;
//	}
//	
//	@DeleteMapping(value = "/employee/{no}")
//	@ResponseBody
//	public String delEmployee(@PathVariable Integer no) {
//		Employee employee = new Employee();
//		employee.setNo(no);
//		return empService.removeEmployee(employee) ?
//				"{'flag': true}" : "{'flag': false}";
//	}
}

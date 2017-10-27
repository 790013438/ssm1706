package com.qfedu.hrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.qfedu.hrs.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@GetMapping("/showDepts")
	public String showDepts(Model model) {
		model.addAttribute("deptList", deptService.listAllDepts());	
		return "dept";
	}
}

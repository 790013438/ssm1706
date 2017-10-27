package com.qfedu.hrs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.util.PageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app.xml")
public class EmpServiceTest {

	@Autowired
	private EmpService empService;
	@Autowired
	private DeptService deptService;
	
	@Test
	public void testListAllEmpsByDept() {
		Dept dept = deptService.getDeptByNo(20);
		PageBean<Emp> pageBean = empService.listAllEmpsByDept(dept, 2, 5);
		System.out.println(pageBean.getDataModel().size());
		System.out.println(pageBean.getTotalPage());
	}
	
	@Test
	public void testGetEmpByNo() {
		Emp emp = empService.getEmpByNo(2233);
		System.out.println(emp.getName());
		System.out.println(emp.getMgr().getName());
		System.out.println(emp.getDept().getName());
	}

}

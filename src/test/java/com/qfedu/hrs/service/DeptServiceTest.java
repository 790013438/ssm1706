package com.qfedu.hrs.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.hrs.domain.Dept;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app.xml")
public class DeptServiceTest {

	@Autowired
	private DeptService deptService;
	
	@Test
	public void testGetAverageSalaryByDept() {
		Dept dept = new Dept();
		dept.setName("搞事部");
		System.out.println(deptService.getAverageSalaryByDept(dept));
	}
	
	@Test
	public void testGetDeptByNo() {
		Dept dept = deptService.getDeptByNo(10);
		Assert.assertNotNull(dept);
		Assert.assertEquals("财务部", dept.getName());
	}
	
	@Test
	public void testListAllDepts() {
		List<Dept> deptList = deptService.listAllDepts();
		Assert.assertNotNull(deptList);
		Assert.assertEquals(4, deptList.size());
	}
}

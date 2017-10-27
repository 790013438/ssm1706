package com.qfedu.hrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.mapper.EmpMapper;
import com.qfedu.hrs.service.EmpService;
import com.qfedu.hrs.util.PageBean;

/**
 * 员工相关业务实现类
 * @author 骆昊
 *
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper ;
	
	@Override
	public boolean addNewEmp(Emp emp) {
		return empMapper.save(emp);
	}
	
	@Override
	public PageBean<Emp> listAllEmpsByDept(Dept dept, int page, int size) {
		List<Emp> dataModel = empMapper.findEmpsByDept(dept, (page - 1) * size, size);
		int total = empMapper.countEmpsByDept(dept);
		int totalPage = (total - 1) / size + 1;
		return new PageBean<>(dataModel, totalPage, page, size);
	}

	@Override
	public Emp getEmpByNo(int no) {
		return empMapper.findById(no);
	}

}

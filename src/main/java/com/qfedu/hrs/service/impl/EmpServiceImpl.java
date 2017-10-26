package com.qfedu.hrs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.dto.EmpDto;
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
	public PageBean<EmpDto> listAllEmpsByDept(Dept dept, int page, int size) {
		PageBean<Emp> pageBean = empMapper.findEmpsByDept(dept, page, size);
		List<Emp> empList = pageBean.getDataModel();
		List<EmpDto> empDtoList = new ArrayList<>();
		for (Emp emp : empList) {
			empDtoList.add(new EmpDto(emp));
		}
		return new PageBean<>(empDtoList, pageBean.getTotalPage(), pageBean.getCurrentPage(), pageBean.getPageSize());
	}

	@Override
	public Emp getEmpByNo(int no) {
		return empMapper.findById(no);
	}

}

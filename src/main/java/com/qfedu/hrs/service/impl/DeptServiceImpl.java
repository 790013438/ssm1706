package com.qfedu.hrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.dto.DeptParam;
import com.qfedu.hrs.mapper.DeptMapper;
import com.qfedu.hrs.service.DeptService;

/**
 * �������ҵ��ʵ����
 * @author ���
 *
 */
@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public double getAverageSalaryByDept(Dept dept) {
		DeptParam param = new DeptParam();
		param.setName(dept.getName());
		deptMapper.findAverageSalary(param);
		return param.getAvgSal() != null ? param.getAvgSal().doubleValue() : 0;
	}
	
	@Override
	public List<Dept> listAllDepts() {
		return deptMapper.findAll();
	}

	@Override
	public boolean removeDeptByNo(Integer no) {
		return deptMapper.deleteById(no);
	}

	@Override
	public boolean addNewDept(Dept dept) {
		return deptMapper.save(dept);
	}

	@Override
	public Dept getDeptByNo(Integer no) {
		return deptMapper.findById(no);
	}

}

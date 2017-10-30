package com.qfedu.hrs.mapper;

import java.util.List;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.dto.DeptParam;

/**
 * �������ݷ��ʶ���ӿ�
 * @author ���
 *
 */
public interface DeptMapper {
	
	void findAverageSalary(DeptParam param);

	List<Dept> findAll();

	boolean deleteById(Integer no);

	boolean save(Dept dept);

	Dept findById(Integer no);
	
}

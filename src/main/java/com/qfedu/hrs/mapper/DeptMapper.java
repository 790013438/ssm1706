package com.qfedu.hrs.mapper;

import java.util.List;

import com.qfedu.hrs.domain.Dept;

/**
 * �������ݷ��ʶ���ӿ�
 * @author ���
 *
 */
public interface DeptMapper {

	List<Dept> findAll();

	boolean deleteById(Integer no);

	boolean save(Dept dept);

	Dept findById(Integer no);
	
}

package com.qfedu.hrs.mapper;

import java.util.List;

import com.qfedu.hrs.domain.Dept;

/**
 * 部门数据访问对象接口
 * @author 骆昊
 *
 */
public interface DeptMapper {

	List<Dept> findAll();

	boolean deleteById(Integer no);

	boolean save(Dept dept);

	Dept findById(Integer no);
	
}

package com.qfedu.hrs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;

/**
 * 员工数据访问对象接口
 * @author 骆昊
 *
 */
public interface EmpMapper {

	boolean save(Emp emp);

	List<Emp> findEmpsByDept(@Param("dept") Dept dept, @Param("offset") int offset, @Param("size") int size);
	
	int countEmpsByDept(Dept dept);

	Emp findById(int no);
}

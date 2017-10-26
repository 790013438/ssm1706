package com.qfedu.hrs.mapper;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.util.PageBean;

/**
 * 员工数据访问对象接口
 * @author 骆昊
 *
 */
public interface EmpMapper {

	boolean save(Emp emp);

	PageBean<Emp> findEmpsByDept(Dept dept, int page, int size);

	Emp findById(int no);
}

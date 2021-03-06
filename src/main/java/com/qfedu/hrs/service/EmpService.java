package com.qfedu.hrs.service;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.util.PageBean;

/**
 * 员工相关业务接口
 * @author 骆昊
 *
 */
public interface EmpService {
	
	/**
	 * 添加新员工
	 * @param emp 员工对象
	 * @return 添加成功返回true否则返回false
	 */
	boolean addNewEmp(Emp emp);

	/**
	 * 根据部门编号列出部门所有员工
	 * @param no 部门编号
	 * @return 保存员工对象的列表容器
	 */
	PageBean<Emp> listAllEmpsByDept(Dept dept, int page, int size);

	/**
	 * 根据员工编号查询员工
	 * @param no 员工编号
	 * @return 员工对象或null
	 */
	Emp getEmpByNo(int no);
}

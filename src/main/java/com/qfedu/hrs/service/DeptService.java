package com.qfedu.hrs.service;

import java.util.List;

import com.qfedu.hrs.domain.Dept;

/**
 * 部门相关业务接口
 * @author 骆昊
 *
 */
public interface DeptService {
	
	double getAverageSalaryByDept(Dept dept);
	
	/**
	 * 添加新部门
	 * @param dept 部门对象
	 * @return 添加成功返回true否则返回false
	 */
	boolean addNewDept(Dept dept);
	
	/**
	 * 删除部门
	 * @param no 部门编号
	 * @return 删除成功返回true否则返回false
	 */
	boolean removeDeptByNo(Integer no);
	
	/**
	 * 根据部门获取部门信息
	 */
	Dept getDeptByNo(Integer no);

	/**
	 * 列出所有部门
	 * @return 保存部门对象的列表容器
	 */
	List<Dept> listAllDepts();
}

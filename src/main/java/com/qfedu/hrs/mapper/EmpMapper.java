package com.qfedu.hrs.mapper;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.util.PageBean;

/**
 * Ա�����ݷ��ʶ���ӿ�
 * @author ���
 *
 */
public interface EmpMapper {

	boolean save(Emp emp);

	PageBean<Emp> findEmpsByDept(Dept dept, int page, int size);

	Emp findById(int no);
}

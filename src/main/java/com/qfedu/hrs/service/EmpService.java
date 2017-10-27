package com.qfedu.hrs.service;

import com.qfedu.hrs.domain.Dept;
import com.qfedu.hrs.domain.Emp;
import com.qfedu.hrs.util.PageBean;

/**
 * Ա�����ҵ��ӿ�
 * @author ���
 *
 */
public interface EmpService {
	
	/**
	 * �����Ա��
	 * @param emp Ա������
	 * @return ��ӳɹ�����true���򷵻�false
	 */
	boolean addNewEmp(Emp emp);

	/**
	 * ���ݲ��ű���г���������Ա��
	 * @param no ���ű��
	 * @return ����Ա��������б�����
	 */
	PageBean<Emp> listAllEmpsByDept(Dept dept, int page, int size);

	/**
	 * ����Ա����Ų�ѯԱ��
	 * @param no Ա�����
	 * @return Ա�������null
	 */
	Emp getEmpByNo(int no);
}

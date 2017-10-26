package com.qfedu.hrs.service;

import java.util.List;

import com.qfedu.hrs.domain.Dept;

/**
 * �������ҵ��ӿ�
 * @author ���
 *
 */
public interface DeptService {
	
	/**
	 * ����²���
	 * @param dept ���Ŷ���
	 * @return ��ӳɹ�����true���򷵻�false
	 */
	boolean addNewDept(Dept dept);
	
	/**
	 * ɾ������
	 * @param no ���ű��
	 * @return ɾ���ɹ�����true���򷵻�false
	 */
	boolean removeDeptByNo(Integer no);
	
	/**
	 * ���ݲ��Ż�ȡ������Ϣ
	 */
	Dept getDeptByNo(Integer no);

	/**
	 * �г����в���
	 * @return ���沿�Ŷ�����б�����
	 */
	List<Dept> listAllDepts();
}

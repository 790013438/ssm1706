package com.qfedu.hrs.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工类
 * @author 骆昊
 *
 */
public class Emp implements Serializable {
	private Integer no;				// 编号
	private String name;		// 姓名
	private Boolean sex;			// 性别
	private String job;				// 职位
	private Emp mgr;				// 主管
	private Double salary;		// 月薪
	private Date hireDate;		// 入职日期
	private Boolean status;	// 是否在职
	private String photo;		// 照片(路径)
	private String tel;				// 电话号码
	private Dept dept;				// 所在部门

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Emp getMgr() {
		return mgr;
	}

	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}

package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action {

	private int deptno;
	private DeptVo bean;

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public DeptVo getBean() {
		return bean;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		bean = new DeptDao().selectOne(deptno);
		return Action.SUCCESS;
	}

}

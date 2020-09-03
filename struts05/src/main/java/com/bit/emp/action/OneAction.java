package com.bit.emp.action;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class OneAction implements Action,ModelDriven<EmpVo> {

	private EmpVo bean = new EmpVo();
	private int sabun;

	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		bean = new EmpDao().selectOne(bean.getSabun());
		return Action.SUCCESS;
	}

	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}

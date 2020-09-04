package com.bit.emp.action;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EditAction extends ActionSupport implements Action, Preparable, ModelDriven<EmpVo> {

	private EmpVo bean;

	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		bean = new EmpVo();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		new EmpDao().updateOne(bean);
		return Action.SUCCESS;
	}

	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (bean.getName().isEmpty()) {
			addFieldError("name", "이름 반드시 입력!");
		} else if (bean.getSub().isEmpty()) {
			addFieldError("sub", "부서 반드시 입력!");
		}
	}
}

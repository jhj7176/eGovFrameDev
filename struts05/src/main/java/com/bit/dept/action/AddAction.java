package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddAction implements Action, ModelDriven<DeptVo>, Preparable {

	DeptVo bean;
	
	
	public void setBean(DeptVo bean) {
		this.bean = bean;
	}

	public DeptVo getBean() {
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		bean = new DeptVo();
		System.out.println("prepare");

	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub\
		DeptDao dao = new DeptDao();
		dao.insertOne(bean);
		System.out.println("SUCCESS");
		return Action.SUCCESS;
	}

	@Override
	public DeptVo getModel() {
		// TODO Auto-generated method stub
		System.out.println("model");
		return bean;
	}
	
	

}

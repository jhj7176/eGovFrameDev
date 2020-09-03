package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.Validateable;

public class EditAction extends ActionSupport implements Action, Preparable, ModelDriven<DeptVo> {

	private DeptVo bean;


	public DeptVo getBean() {
		return bean;
	}

	public void setBean(DeptVo bean) {
		this.bean = bean;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		bean = new DeptVo();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		new DeptDao().updateOne(bean);
		return Action.SUCCESS;
	}

	@Override
	public DeptVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}


	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(bean.getDname().isEmpty()) {
			addFieldError("dname", "이름 반드시 입력!");
		}else if(bean.getLoc().isEmpty()) {
			addFieldError("dname", "지역명 반드시 입력!");
		}//else
	}//valid

}//classEnd

package com.bit.emp.action;

import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.Validateable;

public class ResultAction extends ActionSupport implements Action, ModelDriven<EmpVo>, Preparable, Validateable {
	EmpVo bean;

	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(bean);
//		if (bean.getSabun() == 0) {
//			return Action.INPUT;
//		}
//		if (bean.getName().isEmpty()) {
//			return Action.INPUT;
//		}
		return Action.SUCCESS;
	}

	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean = new EmpVo();
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("validate");
		
		if (bean.getSabun() == 0) {
			addFieldError("sabun", "번호를 입력하세요");
			System.out.println("ㄴ sabun");
		}
		if (bean.getName().isEmpty()) {
			addFieldError("name", "이름을 입력하세요");
			System.out.println("ㄴ name");
		}
		
	}//validate

}

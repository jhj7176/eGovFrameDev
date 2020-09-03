package com.bit.emp.action;

import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class ListAction implements Action {

	List<EmpVo> list;

	public List<EmpVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = new EmpDao().selectAll();
		return Action.SUCCESS;
	}

}

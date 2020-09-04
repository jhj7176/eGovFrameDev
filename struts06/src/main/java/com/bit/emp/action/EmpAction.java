package com.bit.emp.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo>{
	
	EmpVo bean = new EmpVo();
	static List<EmpVo> list;

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	public List<EmpVo> getList() {
		return list;
	}

	public String empList() throws SQLException {
			list = new EmpDao().selectAll();
		return "success";
	}// list

	public String addList() {
		return "success";
	}// add

	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}

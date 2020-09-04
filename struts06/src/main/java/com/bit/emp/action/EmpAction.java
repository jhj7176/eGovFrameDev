package com.bit.emp.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo> {

	EmpVo bean = new EmpVo();
	static List<EmpVo> list;

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}

	public EmpVo getBean() {
		return bean;
	}

	public List<EmpVo> getList() {
		return list;
	}

	public String empList() throws SQLException {
		list = new EmpDao().selectAll();
		return "success";
	}// list

	public String addList() throws SQLException {
		new EmpDao().insertOne(bean);
		return "success";
	}// add
	
	public String empOne() throws SQLException{
		bean = new EmpDao().selectOne(bean.getSabun());
		return "success";
	}
	public String editOne() throws SQLException {
		new EmpDao().updateOne(bean);
		return "success";
	}
	public String deleteOne() throws SQLException {
		new EmpDao().deleteOne(bean.getSabun());
		return "success";
	}
	
	
	
	

	@Override
	public EmpVo getModel() {
		// TODO Auto-generated method stub
		return bean;
	}

}

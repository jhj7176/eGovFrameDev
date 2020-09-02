package com.bit.dept.action;

import java.util.ArrayList;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {

	ArrayList<DeptVo> list;

	public ArrayList<DeptVo> getList() {
		return list;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("action");
		
		DeptDao dao = new DeptDao();
		list = (ArrayList<DeptVo>) dao.selectAll();
		
		return Action.SUCCESS;
	}

}

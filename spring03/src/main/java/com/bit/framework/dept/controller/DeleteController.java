package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.dept.model.DeptDao;

public class DeleteController implements Controller {

	DeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		int deptno = Integer.parseInt(request.getParameter("idx"));
		deptDao.deleteOne(deptno);
		return new ModelAndView("redirect:list.bit");
	}

}

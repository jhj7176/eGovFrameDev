package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.dept.model.DeptDao;

public class DetailController implements Controller {

	DeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int deptno = Integer.parseInt(request.getParameter("idx"));
//
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("bean", deptDao.selectOne(deptno));
//		mav.setViewName("/dept/detail");
		return new ModelAndView("/dept/detail","bean",deptDao.selectOne(deptno));
	}

}

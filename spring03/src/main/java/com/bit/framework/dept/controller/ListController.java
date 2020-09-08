package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.dept.model.DeptDao;

public class ListController implements Controller {

	DeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		ModelAndView mav = new ModelAndView();
		mav.setViewName("dept/list");//resolver에서 .jsp파일을 결정해뒀기때문에 이름까지만 명시함
		//spring-servlet.xml에서 property >> name="viewName" value="dept/list" 에 해당함
		mav.addObject("alist", deptDao.selectAll());
		return mav;
	}

}

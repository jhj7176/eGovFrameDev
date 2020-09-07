package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDao;

public class AddController implements Controller {
	EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		if ("GET".equals(request.getMethod())) {
			mav.setViewName("emp/add");
		} else {// POST인 경우
			String name = request.getParameter("name");
			String sub = request.getParameter("sub");
			int pay = Integer.parseInt(request.getParameter("pay"));
			dao.insertOne(name, sub, pay);// DB에 row 추가
			mav.setViewName("redirect:list.bit");
		}
		return mav;
	}

}

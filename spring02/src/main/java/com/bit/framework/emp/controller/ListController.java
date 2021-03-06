package com.bit.framework.emp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDao;
import com.bit.framework.emp.model.entity.EmpVo;

public class ListController implements Controller {
		
	private EmpDao dao;

	public void setDao(EmpDao dao) { //spring servlet xml 에서 생성한 empdao를 주입
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

//		EmpDao dao = new EmpDao();
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("emp/list");
		
		mav.addObject("alist", dao.selectAll());
		
		return mav;
	}

}

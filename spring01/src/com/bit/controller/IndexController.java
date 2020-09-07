package com.bit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.DeptDao;
import com.bit.model.entity.DeptVo;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		System.out.println("index controller");
		
		List<DeptVo> list = new DeptDao().selectAll();
	//	request.setAttribute("list", list);
		mav.addObject("list",list);
		return mav;
	}

}

package com.bit.emp.action;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;

public class EmpActionTest {

	@Test
	public void testAddList() throws SQLException {
		EmpVo bean = new EmpVo(200, "test", "test22", new Date(2020, 11, 11));
		new EmpDao().insertOne(bean);
	}

	@Test
	public void testselectAll() throws SQLException {
		ArrayList<EmpVo> list = (ArrayList<EmpVo>) new EmpDao().selectAll();
		for (EmpVo e : list) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testSelectOne() throws SQLException {
		EmpVo bean = new EmpDao().selectOne(1);
		System.out.println(bean.toString());

	}

	@Test
	public void testEditOne() throws SQLException {
		EmpVo bean = new EmpDao().selectOne(1);
		bean.setPay(7700);
		bean.setSub("update");
		new EmpDao().updateOne(bean);
	}

	@Test
	public void testDeleteOne() throws SQLException {
		new EmpDao().deleteOne(7);
	}

}

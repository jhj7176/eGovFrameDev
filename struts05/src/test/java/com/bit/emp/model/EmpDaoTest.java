package com.bit.emp.model;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bit.emp.model.entity.EmpVo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpDaoTest {

	@Test
	public void testEmpDao() {
	}

	@Test
	public void testGetConnection() throws ClassNotFoundException, SQLException {
		EmpDao dao = new EmpDao();
		Connection conn;
		conn = dao.getConnection();
		assertNotNull(conn);
		System.out.println(conn.toString());
	}

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		EmpDao dao = new EmpDao();
		Connection conn = dao.getConnection();
		dao = new EmpDao();
		List<EmpVo> list = dao.selectAll();
		assertNotNull(list);
		for (EmpVo vo : list) {
			System.out.println(vo.toString());
		}
	}

	@Test
	public void testSelectOne() throws SQLException {

		EmpDao dao = new EmpDao();

		EmpVo bean = dao.selectOne(1);
		assertNotNull(bean);
		assertSame(1, bean.getSabun());

		EmpVo target = new EmpVo(1, 1000, "test1", "test11", null);
		assertEquals(target, bean);
		System.out.println(bean.toString());
	}

}// testclass

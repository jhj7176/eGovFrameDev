package com.bit.framework.dept.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.nativejdbc.JBossNativeJdbcExtractor;

import com.bit.framework.dept.model.entity.DeptVo;

public class DeptDaoImplTest extends JdbcDaoSupport {

	@Test
	public void testInsertOne() {
		DeptVo bean = new DeptVo(888,"test","test");
		String sql = "insert into dept (dname,loc) values (?,?)";
		getJdbcTemplate().update(sql, new Object[] {bean.getDname(),bean.getLoc()});

	}

}

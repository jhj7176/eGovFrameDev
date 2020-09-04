package com.bit.emp.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.bit.emp.model.entity.EmpVo;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EmpDao {
	SqlMapClient smc = null;

	public EmpDao() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			smc = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			System.out.println("reader error");
		}
		// TODO Auto-generated constructor stub
	}//constructor

	public List<EmpVo> selectAll() throws SQLException {

		return smc.queryForList("selectAll");
		// TODO Auto-generated method stub
	}// selectAll

}// daoclass

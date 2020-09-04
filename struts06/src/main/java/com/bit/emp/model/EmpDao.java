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
	
	public void insertOne(EmpVo bean) throws SQLException {
		
		smc.insert("insertOne",bean);
	}//insertone

	public EmpVo selectOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub

		return (EmpVo) smc.queryForObject("selectOne",sabun);
	}

	public void updateOne(EmpVo bean) throws SQLException {
		// TODO Auto-generated method stub
		smc.update("updateOne", bean);
	}

	public void deleteOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		smc.delete("deleteOne", sabun);
		
	}


}// daoclass

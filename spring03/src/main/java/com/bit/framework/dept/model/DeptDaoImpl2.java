package com.bit.framework.dept.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.dept.model.entity.DeptVo;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DeptDaoImpl2 implements DeptDao {

	SqlMapClient sqlMapClient;

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public List<DeptVo> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return sqlMapClient.queryForList("selectAll");
	}

	@Override
	public void insertOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub
		sqlMapClient.insert("insertOne",bean);
	}

	@Override
	public DeptVo selectOne(int key) throws SQLException {
		// TODO Auto-generated method stub
		return (DeptVo) sqlMapClient.queryForObject("selectOne",key);
	}

	@Override
	public int updateOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub
	
		sqlMapClient.update("updateOne",bean);
		return 0;
	}

	@Override
	public int deleteOne(int key) throws SQLException {
		// TODO Auto-generated method stub
		sqlMapClient.delete("deleteOne",key);
		return 0;
	}

}

package com.bit.framework.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.dept.model.entity.DeptVo;

public class DeptDaoImpl extends JdbcDaoSupport implements DeptDao {

	RowMapper<DeptVo> rowMapper = new RowMapper<DeptVo>() {
		@Override
		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return new DeptVo(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
		}
	};

	@Override
	public List<DeptVo> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from dept";
		return getJdbcTemplate().query(sql, rowMapper);
	}// select All

	@Override
	public void insertOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into dept (dname,loc) values (?,?)";
		getJdbcTemplate().update(sql, new Object[] { bean.getDname(), bean.getLoc() });

	}// insertOne

	@Override
	public DeptVo selectOne(int key) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from dept where deptno=?";
		return getJdbcTemplate().queryForObject(sql, new Object[] { key }, rowMapper);
	}//selectOne

	@Override
	public int updateOne(DeptVo bean) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update dept set dname=?, loc=? where deptno=?";
		getJdbcTemplate().update(sql, new Object[] { bean.getDname(), bean.getLoc(), bean.getDeptno() });
		return 0;
	}//updateOne

	@Override
	public int deleteOne(int key) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from dept where deptno=?";
		getJdbcTemplate().update(sql, new Object[] { key });
		return 0;
	}//deleteOne

}//classEnd

package com.bit.framework.emp.model;

import java.sql.*;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao extends JdbcDaoSupport {

	// private javax.sql.DataSource dataSource;
	private PreparedStatement pstmt;
	private ResultSet rs;

	/*
	 * JdbcDaoSupport가 이미 가지고 있어서 필요없다. public void
	 * setDataSource(javax.sql.DataSource dataSource) { this.dataSource =
	 * dataSource; }
	 */
	public EmpDao() {

	}// constructor

	public List<EmpVo> selectAll() throws SQLException {
		final String SQL = "select * from emp";
		/*
		 * List<EmpVo> list = new ArrayList<EmpVo>(); Connection conn = getConnection();
		 * pstmt = conn.prepareStatement(SQL); rs = pstmt.executeQuery(); while
		 * (rs.next()) { list.add(new EmpVo(rs.getInt("sabun"), rs.getString("name"),
		 * rs.getString("sub"), rs.getDate("nalja"), rs.getInt("pay"))); } if (pstmt !=
		 * null) pstmt.close(); if (conn != null) conn.close();
		 * 
		 * return list;
		 */
		return getJdbcTemplate().query(SQL, new RowMapper<EmpVo>() {

			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpVo(rs.getInt("sabun"), rs.getString("name"), rs.getString("sub"), rs.getDate("nalja"),
						rs.getInt("pay"));
			}// mapRow()
		});// return
	}// selectAll

	public void insertOne(String name, String sub, int pay) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "insert into emp (name, sub, pay) values (?,?,?)";

		Object[] params = new Object[] { name, sub, pay };
		getJdbcTemplate().update(SQL, params);

		/*
		 * Connection conn = getConnection(); pstmt = conn.prepareStatement(SQL);
		 * pstmt.setString(1, name); pstmt.setString(2, sub); pstmt.setInt(3, pay);
		 * pstmt.executeUpdate(); if (pstmt != null) pstmt.close(); if (conn != null)
		 * conn.close();
		 */
	}// insertOne

	public EmpVo selectOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "select * from emp where sabun = ?";
		/*
		 * EmpVo bean = null; Connection conn = getConnection(); pstmt =
		 * conn.prepareStatement(SQL); pstmt.setInt(1, sabun); rs =
		 * pstmt.executeQuery(); if (rs.next()) {
		 * 
		 * bean = new EmpVo(rs.getInt("sabun"), rs.getString("name"),
		 * rs.getString("sub"), rs.getDate("nalja"), rs.getInt("pay")); } // if if
		 * (pstmt != null) pstmt.close(); if (conn != null) conn.close(); return bean;
		 */

		return getJdbcTemplate().queryForObject(SQL, new Object[] { sabun }, new RowMapper<EmpVo>() {
			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new EmpVo(rs.getInt("sabun"), rs.getString("name"), rs.getString("sub"), rs.getDate("nalja"),
						rs.getInt("pay"));
			}
		});
	}// selectOne

	public int updateOne(int sabun, String name, String sub, int pay) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "update emp set name=?,sub=?,pay=? where sabun=?";
		return getJdbcTemplate().update(SQL, new Object[] { name, sub, pay, sabun });

		/*
		 * Connection conn = getConnection(); pstmt = conn.prepareStatement(SQL);
		 * pstmt.setString(1, name); pstmt.setString(2, sub); pstmt.setInt(3, pay);
		 * pstmt.setInt(4, sabun); pstmt.executeUpdate(); if (pstmt != null)
		 * pstmt.close(); if (conn != null) conn.close();
		 */
	}// updateOne

	public int deleteOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "delete from emp where sabun=?";
		
		return getJdbcTemplate().update(SQL, new Object[] {sabun});
		
/*		Connection conn = getConnection();
		pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, sabun);
		pstmt.executeUpdate();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();*/
	}// deleteOne

}

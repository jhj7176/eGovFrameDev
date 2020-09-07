package com.bit.framework.emp.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao {

	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driver;
	private String url;
	private String user;
	private String password;

	public EmpDao(String driver, String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		System.out.println("create DAO " + this.toString());
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// constructor

	public List<EmpVo> selectAll() throws SQLException {
		List<EmpVo> list = new ArrayList<EmpVo>();
		final String SQL = "select * from emp";
		Connection conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SQL);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(new EmpVo(rs.getInt("sabun"), rs.getString("name"), rs.getString("sub"), rs.getDate("nalja"),
					rs.getInt("pay")));
		}
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();

		return list;
	}// selectAll

	public void insertOne(String name, String sub, int pay) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "insert into emp (name, sub, pay) values (?,?,?)";
		Connection conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, name);
		pstmt.setString(2, sub);
		pstmt.setInt(3, pay);
		pstmt.executeUpdate();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();

	}// insertOne

	public EmpVo selectOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		EmpVo bean = null;
		final String SQL = "select * from emp where sabun = ?";
		Connection conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, sabun);
		rs = pstmt.executeQuery();
		if (rs.next()) {

			bean = new EmpVo(rs.getInt("sabun"), rs.getString("name"), rs.getString("sub"), rs.getDate("nalja"),
					rs.getInt("pay"));
		} // if
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return bean;
	}//selectOne

	public void updateOne(int sabun, String name, String sub, int pay) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "update emp set name=?,sub=?,pay=? where sabun=?";
		Connection conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, name);
		pstmt.setString(2, sub);
		pstmt.setInt(3, pay);
		pstmt.setInt(4, sabun);
		pstmt.executeUpdate();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}//updateOne

	public void deleteOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		final String SQL = "delete from emp where sabun=?";
		Connection conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, sabun);
		pstmt.executeUpdate();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}


}

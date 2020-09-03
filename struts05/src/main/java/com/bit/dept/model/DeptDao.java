package com.bit.dept.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bit.dept.model.entity.DeptVo;

public class DeptDao {
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/xe";
	private String user = "scott";
	private String password = "tiger";
	Logger log = Logger.getGlobal();

	public DeptDao() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			log.info(conn.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// constructor

	public List<DeptVo> selectAll() {
		List<DeptVo> list = new ArrayList<>();
		String sql = "select * from dept";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new DeptVo(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc")));
			} // while
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally
		for (DeptVo vo : list) {
			log.info(vo.toString());
		}
		return list;
	}// selectAll

	public void insertOne(DeptVo bean) {
		// TODO Auto-generated method stub
		final String sql = "insert into dept (DNAME, LOC) values (?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.executeUpdate();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // finally
	}// insertone

	public DeptVo selectOne(int deptno) {
		// TODO Auto-generated method stub\\\
		final String sql = "select * from dept where deptno=?";
		DeptVo bean = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				bean = new DeptVo(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			} // if
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally
		return bean;
	}// selectOne

	public void updateOne(DeptVo bean) {
		// TODO Auto-generated method stub
		final String sql = "update dept set dname=?, loc=? where deptno=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.setInt(3, bean.getDeptno());
			pstmt.executeUpdate();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally

	}//update

}

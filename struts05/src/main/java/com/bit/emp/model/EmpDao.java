package com.bit.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bit.emp.model.entity.EmpVo;

public class EmpDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Logger log = Logger.getGlobal();

	public EmpDao() {
		// TODO Auto-generated constructor stub
	}// constructor

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		final String url = "jdbc:mysql://localhost:3306/xe";
		final String user = "scott";
		final String password = "tiger";

		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		log.info(conn.toString());

		return conn;
	}// getConnection

	public List<EmpVo> selectAll() throws ClassNotFoundException, SQLException {
		final String sql = "select * from emp order by sabun";
		List<EmpVo> list = new ArrayList<EmpVo>();
		try {
			conn = this.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new EmpVo(rs.getInt("sabun"), rs.getInt("pay"), rs.getString("name"), rs.getString("sub"),
						rs.getDate("nalja")));
			} // while
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} // finally
		return list;
	}// selectAll

	public EmpVo selectOne(int sabun) throws SQLException {
		EmpVo bean = null;
		final String sql = "select * from emp where sabun = ?";

		try {
			conn = this.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sabun);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			bean = new EmpVo(
					rs.getInt("sabun"),
					rs.getInt("pay"), 
					rs.getString("name"),
					rs.getString("sub"),
					rs.getDate("nalja"));
		}//if
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return bean;
	}

	public void insertOne() {
	}

	public void updateOne() {
	}

	public void deleteOne() {
	}

}// classEnd

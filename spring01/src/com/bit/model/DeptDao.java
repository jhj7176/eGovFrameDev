package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.DeptVo;

public class DeptDao {

	private final String DRIVER = "org.mariadb.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/xe";
	private final String USER = "scott";
	private final String PASSWORD = "tiger";

	public List<DeptVo> selectAll() throws ClassNotFoundException, SQLException {
		String sql = "select * from dept";
		List<DeptVo> list = new ArrayList<DeptVo>();
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(new DeptVo(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc")));
		} // while
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		
		return list;
	}// selectAll

}

package com.bit.framework.emp.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String DRIVER = "org.mariadb.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/xe";
	private final String USER = "scott";
	private final String PASSWORD = "tiger";

	public EmpDao() {

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// constructor

	public List<EmpVo> selectAll() throws SQLException {
		List<EmpVo> list = new ArrayList<EmpVo>();
		final String SQL = "select * from emp";
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

}

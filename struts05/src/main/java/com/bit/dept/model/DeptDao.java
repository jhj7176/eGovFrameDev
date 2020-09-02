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
		}//finally
		for (DeptVo vo : list) {
			log.info(vo.toString());
		}
		return list;
	}// selectAll

}

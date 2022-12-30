package dao.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.common.DataSource;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() throws Exception{
		dataSource = new DataSource();
	}
	
	public void findByPrimaryKeywithDept(int empno) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.SELECT_BY_EMPNO_EMP_DEPT);
		pstmt.setInt(1, empno);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			/***emp***/
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			
			/***dept***/
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.println(eno+"\t"+ename+"\t"+job+"\t"+dname+"\t"+loc);
		}
		
	}
	public void findAllwithDept() {
		
	}
	
}

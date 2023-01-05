package dao.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.address.fourth.Address;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	public MemberDao() {
	}

	public int insert(Member newMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper35";
		String password="jdeveloper35";
		
		String insertSQL=
				"insert into member values('"+newMember.getM_id()+"','"
							+newMember.getM_password()+"','"
							+newMember.getM_name()+"','"
							+newMember.getM_address()+"','"
							+newMember.getM_age()+"','"
							+newMember.getM_married()+"',"
							+"sysdate"+")";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(insertSQL);
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public int update(Member updateMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper35";
		String password="jdeveloper35";
		
		String updateSQL="update member set m_id='"
							+updateMember.getM_id()+"',M_password='"
							+updateMember.getM_password()+"',M_name='"
							+updateMember.getM_name()+"',M_address='"
							+updateMember.getM_address()+"',M_age='"
							+updateMember.getM_age()+"',M_married='"
							+updateMember.getM_married()+"'where M_id="
							+"'"+updateMember.getM_id()+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(updateSQL);
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public int delete(String m_id) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper35";
		String password="jdeveloper35";
		
		String deleteSQL="delete member where m_id='"+m_id+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(deleteSQL);
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public Member findByPrimaryKey(String m_id) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper35";
		String password="jdeveloper35";
		
		String selectSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id='"+m_id+"'";
		
		Member findMember=null;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs=stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			String id=rs.getString("m_id");
			String pw=rs.getString("m_password");
			String name=rs.getString("m_name");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			String married=rs.getString("m_married");
			Date regdate=rs.getDate("m_regdate");
			findMember=new Member(id, pw, name, address, age, married, regdate);
		}else {			
			findMember=null;
		}
		rs.close();
		stmt.close();
		con.close();
		return findMember;
	}

	public List<Member> findAll() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper35";
		String password="jdeveloper35";
		
		String selectSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
		
		List<Member> memberList=new ArrayList<Member>();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			
			do{
				String id=rs.getString("m_id");
				String pw=rs.getString("m_password");
				String name=rs.getString("m_name");
				String address=rs.getString("m_address");
				int age=rs.getInt("m_age");
				String married=rs.getString("m_married");
				Date regdate=rs.getDate("m_regdate");
				Member member=new Member(id, pw, name, address, age, married, regdate);
				memberList.add(member);
			}while(rs.next());
		}else {
			
		}
		
		rs.close();
		stmt.close();
		con.close();
		return memberList;
	
	}
}

package resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import dao.common.DataSource;

public class ResultSetMain {

	public static void main(String[] args) throws Exception{
		DataSource dataSource = new DataSource();
		
		String selectSql = "select no,name,short_desc,price,ipgo_date from product";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("----------ResultSet.get타입(\"컬럼이름\")-----------");
		while(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date");
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		
		
		System.out.println("----------ResultSet.get타입(컬럼 index)-----------");
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String short_desc = rs.getString(3);
			double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5);
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		
		
		System.out.println("----------ResultSet.getObject(\"컬럼이름\")-----------");
		rs=pstmt.executeQuery();
		while(rs.next()) {
			/*  
			 * -----------------------
			 *  DB     |     java
			 * -----------------------
			 * number  |   BigDecimal
			 * -----------------------
			 */
			Object no = rs.getObject("no");
			Object name = rs.getObject("name");
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date");
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
			/*
			System.out.println("no        [number]-->" + no.getClass().getSimpleName());
			System.out.println("price     [number]-->" + price.getClass().getSimpleName());
			System.out.println("ipgo_date [Date]-->" + ipgo_date.getClass().getSimpleName());
			*/
		}
		rs.close();
		
		System.out.println("----------ResultSet.getString(\"컬럼이름\")-----------");
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			String noStr = rs.getString("no");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			String priceStr = rs.getString("price");
			String ipgo_dateStr = rs.getString("ipgo_date");
			System.out.println(noStr+"\t"+name+"\t"+short_desc+"\t"+priceStr+"\t"+ipgo_dateStr);
		}
		rs.close();
		
		dataSource.close(con);
	}

}

package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class P_JDBC {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//접속할 계정 :pc24
		String user = "pc24";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//prod_table
			String sql = "select * from prod where prod_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,"P101000002");
			
			rs = ps.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount(); //컬럼 수 
			
			while(rs.next()){
				for(int i = 1; i <=columnCount; i++){
					System.out.print(md.getColumnName(i) + " : ");//컬럼명 출력
					Object value = rs.getObject(i);//i를 넘겨줌
					System.out.print(value + "\t"); //컬럼 출력 
				}//for문이 다 했을 때 한줄을 출력
				System.out.println(); //줄바꿈.
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally { //모두 반환 .. 열은 순서대로
			if(rs != null)try { rs.close(); } catch(Exception e) {}
			if(ps != null)try { ps.close(); } catch(Exception e) {}
			if(con != null)try { con.close(); } catch(Exception e) {}
		}
	}
}

package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
	/*
	 * JDBC (Java Database Connectivity)
	 * 자바와 데이터베이스를 연결해주는 라이브러리
	 * ojdbc : 오라클 JDBC
	 * 
	 * JDBC의 작성 단계
	 * 1. Connection 생성(DB연결)
	 * 2. Statement 생성(쿼리작성)
	 * 3. Query 실행
	 * 4. ResultSet에서 결과 추출(select인 경우)
	 * 5. ResultSet, Statement, Connection 닫기
	 * 
	 * 오라클 JDBC
	 * https://www.oracle.com/kr/database/technologies/appdev/jdbc-downloads.html
	 */
		
		//오라클에 연결하여 쿼리를 가져올것이다.
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//접속할 계정 :pc24
		String user = "pc24";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;   
		ResultSet rs = null;
		
		try {
			//con은 객체 생성을 스스로 하지 않고 DriverManager가 자동으로  Driver를 찾아준다.
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스 
			con = DriverManager.getConnection(url, user, password);
		
			//2. Statement
			String sql = "select * from member"; //member 테이블의 모든 데이터를 가져온다. 
			ps = con.prepareStatement(sql); //PrepredStatement객체에 넘겨줌. //쿼리 생성(작성) 완료
			
			//select와  select가 아닌것은 메서드를 호출하는것이 서로 다르다. 
			//select
			rs = ps.executeQuery(); //내가 작성한 쿼리가 현재 select이기 때문에 이렇게 실행
			
			//insert, update, delete		
			//int result = ps.executeUpdate(); int result에는 몇개의 row가 영향을 받았는지 반환해준다.
			
			//결과를 한줄씩 꺼낸다.(중요!)
			while(rs.next()){
				//System.out.println(rs.getString(1)); //varchar() 타입일 때 String (1)은 컬럼의 순서
				System.out.println(rs.getString("MEM_ID"));//4) 데이터 추출 완료 String ("컬럼명 (또는 AS)") 
				
				//다른 타입
				//rs.getInt(1);
				//rs.getDate(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//1. Connection 생성(DB연결 완료)
		//5) ResultSet, Statement, Connection 닫기
		finally { //모두 반환 .. 열은 순서대로
			if(rs != null)try { rs.close(); } catch(Exception e) {}
			if(ps != null)try { ps.close(); } catch(Exception e) {}
			if(con != null)try { con.close(); } catch(Exception e) {}
		}
	}

}

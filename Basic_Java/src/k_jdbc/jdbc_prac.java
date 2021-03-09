package  k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class jdbc_prac {

	public static void main(String[] args) {
		
		/*
		 * JDBC 작성단계 
		 * 1. Connection 생성 (DB연결)
		 * 2. Statement 생성 (쿼리작성)
		 * 3. Query 실행
		 * 4. 쿼리문이 select인 경우 ResultSet에서 결과 추출
		 * 5. ResultSet, Statement, Connection 닫기  
		 */
		
		//데이터베이스 접속 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc24";
		String password = "java";
		
		//Connection 쿼리 생성 용도
		Connection con = null;
		//PreparedStatement 쿼리 실행 용도 
		PreparedStatement ps = null;
		//ResultSet 컬럼(자료) 접근 용도
		ResultSet rs = null;
		
		//con 객체 생성
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성 및 실행
			String query = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(query);
			
			//PrepareStatement에 이미 쿼리가 등록된 경우 파라미터가 없는 excuteQuery() 함수 사용 가능
			//결과 조회 및 추출
			rs = ps.executeQuery(); 
			// select로 작성한 경우 행 단위로 관리하는 ResultSet 타입으로 반환
			
			//메타데이터
			ResultSetMetaData md = rs.getMetaData(); 
			
			//rs.next를 이용하여 다음 자료 접근
			while(rs.next()){
				for(int i= 1; i<=md.getColumnCount(); i++){
					System.out.print(md.getColumnName(i) + " : ");
					//컬럼값 반환
					String value = rs.getString(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {rs.close();} catch(Exception e) {}
			if(con != null) try {rs.close();} catch(Exception e) {}
		}
		
		
	}

}

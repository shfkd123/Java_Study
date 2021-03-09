package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import e_oop.ScanUtil;

public class JDBCBoard {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	//접속할 계정 :pc24
	private final String user = "pc24";
	private final String password = "java";
	
	static ArrayList<String> boardlist = new ArrayList<>(); //boardlist 생성
	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO(PK), TITLE, CONTENT, USER_ID, REG_DATE
		 * 
		 * 1.게시판 List 
		 * 2.게시판 등록 
		 * 3.게시판 상세보기
		 * 4.게시판 수정
		 * 5.게시판 삭제
		 * 
		 * JDBC순서
		 * 1. url, user, password - > DB에 접근할 모든 곳에 공통 => 어떻게 빼놓으면 좋을까? 상수/private/final
		 * 2. DB 접속 => Connection 객체
		 * 	 - URL => ip, port, sid
		 * 3. Query 생성
		 * 4. 질의 => PreparedStatement
		 * 5. 결과저장 => ResultSet
		 * 6. 자원 반납 close()
		 * 
		 */
		JDBCBoard j = new JDBCBoard();
		while (true){
			System.out.println("===========Board====================");
			System.out.println("번호\t제목\t내용\t회원ID\t작성일");
			System.out.println("===================================");
			
			j.noticeList();
			
			System.out.println("===========================");
			System.out.println("1.등록\t2.내용보기\t3.종료");
			System.out.println("입력>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				//
				j.input();
				break;
			case 2:
				//목록
				j.noticeList();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}

	}//MAIN	
	
	//목록 
	private void noticeList() {
		//db에 가서 게시판 List를 가지고 와야 한다.
		
		//1. DB접속
		Connection con = null;
		//2. Query
		String sql = " SELECT *"
					+ " FROM BOARD";
		//3.질의 
		PreparedStatement ps = null;
		
		//4.결과
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password); //DB
			ps = con.prepareStatement(sql); //Query
			rs = ps.executeQuery(); //결과 
			while(rs.next()){
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
					
	}
	//등록
	private void input(){
		System.out.print("제목 : ");
		String title = ScanUtil.nextLine();
		
		System.out.print("내용 : ");
		String content = ScanUtil.nextLine();
		
		System.out.print("아이디 : ");
		String user_id = ScanUtil.nextLine();
		
		
		// 1. DB접속
		Connection con = null;
		
		// 2. Query
		String sql = " INSERT INTO BOARD (BOARD_NO(PK), TITLE, CONTENT, USER_ID, REG_DATE)"
				+ "	   VALUSE(  title,content,user_id)";
		// 3.질의
		PreparedStatement ps = null;

		// 4.결과
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password); // DB
			ps = con.prepareStatement(sql); // Query
			rs = ps.executeQuery(); // 결과
			while (rs.next()) {

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

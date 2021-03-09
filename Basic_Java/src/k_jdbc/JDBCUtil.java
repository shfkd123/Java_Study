package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	//학습목표
	//DB게시판을 만들었을 때 계속 어떤 작업을 할 때 마다 DB에 접속하고 연결하고 ~ 패턴이 비슷하다 
	//이러한 단점을 보완한다.
	
	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	
	//생성자 생성
	private JDBCUtil(){
		
	}//private로 다른 클래스에서는 이 생성자를 호출하지 못함 생성자를 호출하지 못하면 객체 생성도 못한다. 

	//객체 생성은 현재 클래스 안에 생성한다.
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//다른 클래스에서 객체 생성을 하지 않고 다른 클래스도 사용할 수 있어야 하니 public
	//다른 클래스에서 객체 생성을 못하니 static 
	//클래스 이름 JDBCUtil
	//메소드 이름 getInstance()	
	//<다른 클래스에서 객체생성을 하지 않고 인스턴스 변수를 이용하여 인스턴스를 빌려줄것이다. => 싱글톤 패턴>
	//<인스턴스를 빌려주는 메서드(인스턴스를 내부적으로 생성해서 다른 클래스에게 빌려줌)>
	public static JDBCUtil getInstance(){
		if(instance == null){ //instance의 초기값은 null
			instance = new JDBCUtil();//처음에 들어오면 객체 생성 
		}
		return instance;//두번째 ~ instance 들어오면  객체 생성을 하지 않고 instance를 리턴.
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc24";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * 필요한 메소드들
	 * (1) Map<String, Object> selectOne(String sql) //예상되는 결과가 한줄이다 selectOne
	 * (2) Map<String, Object> selectOne(String sql, List<Object> param)
	 * (3) List<Map<String, Object>> selectList(String sql) //예상되는 결과가 여러줄이다 selectList
	 * (4) List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * (5) int update(String sql) //물음표가 없을 때  //insert, delete, update시 사용 -> int update
	 * (6) int update(String sql, List<Object> param) //물음표가 있을 때 (물음표에 들어갈 값들을 List에 넣어준다)
	 */
	
	
	//1번 메서드
	public Map<String, Object> selectOne(String sql){
		Map<String, Object> row = null; //null을 넣어야 ㅏ는 이융:쿼리를 조회 후 한줄 출력을 예상하고 실행을 했지만, 조회된 것이 없을 경우도 생각해서 null을 해준다. 
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				row = new HashMap<>(); //한줄이미 만들었으면, 새로운 해시맵을 만들어서 또 만들어준다. 
				for(int i =1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return row;
	}
	
	
	
	//2번 메서드
		public Map<String, Object> selectOne(String sql, List<Object> param){
			Map<String, Object> row = null; //null을 넣어야 ㅏ는 이융:쿼리를 조회 후 한줄 출력을 예상하고 실행을 했지만, 조회된 것이 없을 경우도 생각해서 null을 해준다. 
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				for(int i =0; i<param.size(); i++){
					ps.setObject(i+1, param.get(i));
				}
				rs = ps.executeQuery();
				
				ResultSetMetaData metaData = rs.getMetaData();
				int columnCount = metaData.getColumnCount();
				
				while(rs.next()){
					row = new HashMap<>(); //한줄이미 만들었으면, 새로운 해시맵을 만들어서 또 만들어준다. 
					for(int i =1; i <= columnCount; i++){
						row.put(metaData.getColumnName(i), rs.getObject(i));
					}
				}
			} catch (SQLException e) {
				
				
				e.printStackTrace();
			}
			finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			return row;
		}
	
	//3번메서드
		public List<Map<String, Object>> selectList(String sql){
			List<Map<String, Object>> list = new ArrayList<>();
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				ResultSetMetaData metaData = rs.getMetaData();
				int columnCount = metaData.getColumnCount();
				
				while(rs.next()){
					HashMap<String, Object> row = new HashMap<>();
					for(int i = 1; i <= columnCount; i++){
						row.put(metaData.getColumnName(i), rs.getObject(i));
					}
					list.add(row);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
			return list;
		}
		
		
	//4번 메서드, 데이터베이스에 연결 한 다음 넘어온 쿼리를 list에 넣고 물음표(param)의 값을 Map형태로 만들어준다(?)
	List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();
		
		//(1)데이터베이스 접속해서 조회한다.
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//(2)쿼리 넘겨준다
			ps = con.prepareStatement(sql);
			//list에는 값이 여러개 ->for문 사용
			for(int i =0; i<param.size(); i++){
				ps.setObject(i+1, param.get(i)); //물음표에 들어갈 값 다 세팅완료	
			}
			//(3)실행
			rs = ps.executeQuery();
			//우리는 rs에 들어있는 값을 모른다. => getMetaData
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				//HashMap생성
				HashMap<String,Object> row = new HashMap<>();
				for(int i =1; i <= columnCount; i++){
					//값 하나씩 추출하면서 list에 담아서 리턴을 해야한다.
					//list안에는 HashMap형태로 담겨져 있다.
					//우리도 그래서 값을 HashMap형태로 만들어야 한다. => HashMap생성
					
					//key 컬럼명, data 컬럼값
					//i번째에 있는 getColumnName을 가져오고, rs.getObject(i)를 통해 값을 가져온다.
					row.put(metaData.getColumnName(i), rs.getObject(i)); //한줄의 값을 가져왔다.	
				}
				list.add(row); //가져온 값을 list에 넣는다. 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
	}
	
	//5번 메서드
	public int update(String sql){
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		 finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
		return result;
	}
	
	//6번 메서드 
	public int update(String sql, List<Object> param) {
		int result = 0;

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // 물음표에 들어갈 값 다 세팅완료
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		 finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
		return result;
	}
}

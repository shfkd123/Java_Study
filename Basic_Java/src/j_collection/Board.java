package j_collection;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
	/*
	 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * 번호(PK), 제목, 내용, 작성자, 작성일
	 * 
	 * <목록>
	 * ----------------------------
	 * 번호	  제목 	작성자	작성일
	 * ----------------------------
	 * 1.  안녕하세요  	홍길동         2/9
	 * 1.  안녕하세요  	홍길동         2/9
	 * 1.  안녕하세요  	홍길동         2/9
	 * 1.  안녕하세요  	홍길동         2/9
	 * ----------------------------
	 * 1.조회		2.등록	  3.종료
	 * 
	 * 조회 후 수정, 삭제 가능
	 * 
	 * 1. 조회 -> 목록
	 * 2. 등록  -> 내용
	 */
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
		//MM 대문자 > 월 ,mm 소문자 > 분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		while (true) {
			System.out.println("===========================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("===========================");
			// 출력 (가장 먼저 입력한 게시글이 위에 있어야 하기 때문에 for문을 거꾸로 한다)
			for (int i = boardList.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no") + "\t"
						+ board.get("title") + "\t" + board.get("user") + "\t"
						+ sdf.format(board.get("reg_date")));
			}
			System.out.println("===========================");
			System.out.println("1.조회\t2.등록\t3.종료");
			System.out.println("입력>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read(boardList);
				break;
			case 2:
				insert(boardList);
				break;
			case 0:
				System.out.println("종료");
				System.exit(0);
				break;

			}
		}
	

	}
	
	//객체 생성을 하지 않고 사용하기 위해 static을 사용
	private static void insert(ArrayList<HashMap<String, Object>> boardList)
	{
		int max = 0;
		for(int i =0; i< boardList.size(); i++){
			if(max < (Integer)boardList.get(i).get("board_no")){
				max = (Integer)boardList.get(i).get("board_no");
			}
		}
		
		
		//System.out.println("번호>");
		//int boardNo = ScanUtil.nextInt();
		int boardNo = max + 1;    
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		System.out.println("이름>");
		String user = ScanUtil.nextLine();
		
		HashMap<String, Object> board = new HashMap<>();
		board.put("board_no", boardNo);
		board.put("title", title);
		board.put("content", content);
		board.put("user", user);
		board.put("reg_date", new Date());
		
		boardList.add(board);
		System.out.println("게시물 등록이 완료되었습니다.");
		
	}
	
	private static void read(ArrayList<HashMap<String, Object>> boardList)
	{
		System.out.println("게시글 번호 입력>");
		int boardNo = ScanUtil.nextInt();
		
		HashMap<String, Object> board = new HashMap<>();
		
		for(int i =0; i<boardList.size(); i++){
			if((Integer)boardList.get(i).get("board_no") == boardNo){
				board = boardList.get(i);
			}
		}
		System.out.println("==================================");
		System.out.println("번호\t: " + board.get("board_no"));
		System.out.println("작성자\t: " + board.get("user"));
		System.out.println("작성일\t: " + board.get("reg_date"));
		System.out.println("제목\t: " + board.get("title"));
		System.out.println("내용\t: " + board.get("content"));
		System.out.println("==================================");
		System.out.println("1.수정\t2.삭제\t3.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:
			//파라미터로 조회한 게시물을 넘겨줌.
			update(board);
			break;
		case 2:
			//삭제를 할 때에는 테이블이 필요, 테이블 중에서 어떤 게시물을 삭제할지 게시물을 넘겨줘야함 .
			delete(boardList,board);
			break;
		}
		
	}

	private static void delete(ArrayList<HashMap<String, Object>> boardList,
			HashMap<String, Object> board) {
		for(int i =0; i<boardList.size(); i++){
			if(boardList.get(i).get("board_no") == board.get("board_no")){
				boardList.remove(i);
				System.out.println("삭제 완료!");
				break;
			}
		}
	}

	private static void update(HashMap<String, Object> board) {
		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("title", title);
		board.put("content", content);
		
		System.out.println("수정 완료!");
		
		
	}
	
}

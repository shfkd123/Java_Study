package h.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally
		 * -필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * -finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동자원반환
		 * -try(변수 선언; 변수 선언) {} catch(Exception e){}
		 * -사용 후 반환이 필요한 객체를 try의()안에서 선언하면 try 블럭 종료시 자동으로 반환된다. 
		 */
		
		FileInputStream fis = null; //파일 읽기
		
		//예외처리를 아직 안해줘서 오류
		try {
			fis = new FileInputStream("d:/file.txt");
			//FileInputStram 파일을 읽어들이기 위한 클래스
			//파일은 자바에서 관리하는 것이 아니라 운영체제에서 관리
			//파일을 읽기위해서는 운영체제의 도움을 받아야 한다. 
			// 리소스를 읽어오고 다 사용했으면 반환해야 한다. 
			// 리소스를 반환하지 않으면 메모리에 남아있기 되고, 메모리 낭비가 발생한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//반드시 실행할 부분이 있을 때 finally를 사용한다. 
			//예외가 발생하든 발생하지 않든 finally안에 있으므로 close는 무조건 실행된다. 
			try {
				fis.close();
			} catch (Exception e) {
				//IOException -> Exception 
				e.printStackTrace();
			}//사용한 자원을 다시 운영체제에 반환했다는 표시 (반드시 호출필요)
		}
		//fis.close()하나 때문에 try-catch를 쓰면 코드도 길어지고, 귀찮다 => 자동자원반환 사용!!
		
		//자동자원반환(JDK1.7버전부터 사용가능)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "아무내용이나 글을 적어봅니다...";
			
			byte[] bytes = str.getBytes();
			for(int i =0; i<bytes.length; i++){
				fos.write(bytes[i]);
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//FileOutputStream파일은 만들고 쓰기 위한 클래스 
		//FileInputStream 클래스
	}
}

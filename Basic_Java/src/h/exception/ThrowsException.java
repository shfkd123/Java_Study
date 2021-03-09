package h.exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * 메서드에 예외 선언하기
		 * - 메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다.
		 * - void method() throws(예약어) IOException(예외 클래스) {}
		 * - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언 할 수 있다. 
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		//메서드를 만들고 실행하면 예외가 발생할 가능성이 있다고 말해주는 것.
		//메소드를 사용하는 사람이 예외를 처리할 수 있도록해줌.
		
		
		//IOException을 호출한 method에서 예외처리를 해준다. 
		try {
			method();
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

	private static void method() throws IOException {
		throw new IOException();
		
	}

}

package h.exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * -throw new Exception();(throw 뒤에 발생시키고 싶은 객체) 
		 * -throw 예약어와 예약 클래스의 객체로 예외를 고의로 발생시킬 수 있다. 
		 */
		
		IOException ioe = new IOException();
		
		try {
			throw ioe; //예외 발생시킴.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

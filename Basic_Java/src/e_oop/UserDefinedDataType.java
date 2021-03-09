package e_oop;

import java.util.Scanner; //다른 패키지에 있는 클래스를 사용하기 위해 그 위치를 알려주는 것

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 * 
		 * 배열은 같은 타입만 묶을 수 있었음.
		 * 클래스는 서로 다른 타입의 데이터를 묶어서 사용가능
		 * 
		 */
		
		//기본형 
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		//클래스
		Student student; 
		//student 변수 생성
		student = new Student(); 
		//객체 생성(인스턴스화) 
		
		//클래스 '설계도', 클래스의 내용이 메모리에 올라간 것 '객체'.
		
		student.kor = 80;
		student.eng = 70;
		student.math = 100;
		student.sum = student.kor + student.eng + student.math;
		student.avg= student.sum / 3.0;
		student.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student.avg);
		System.out.println(student.sum);
		
		Student student2 = new Student();
	}

}// UserDefinedDataType 클래스 범위

//클래스
class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}

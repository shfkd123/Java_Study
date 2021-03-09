package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * if﻿문 - if(조건식){} : 조건식의 결과가 true이면 블럭안에 문장을 수행한다. -else if문(조건식){}
		 * :다수의 조건이 필요할 때 if 뒤에 추가한다. - else{} : 결과가 true면 조건식이 하나도 없는 (위에 있는 모든
		 * if문이 하나도 만족을 안 할 경우) 경우를 위해 추가한다.
		 */

		int a = 1;

		// 참인 경우
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		// 거짓인 경우
		if (a == 0) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");

		}
  
		// 한번 if문을 실행하면 (true) else if문은 실행하지 않음. (빠져나옴.)
		if (a == 1) {
			System.out.println("a가 1인 경우에 하고 싶은 것");
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고 싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고 싶은 것");
		}

		// else를 추가시 위에 조건들이 모두 만족하지 않을때 실행됨.
		// else문은 항상 마지막에 와야한다.
		if (a == 1) {
			System.out.println("a가 1인 경우에 하고 싶은 것");
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고 싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고 싶은 것");
		} else {
			System.out.println("이외의 경우에 하고싶은 것");
		}

		// 이렇게 사용하면 if문이 한묶음으로 보이지만 서로 각자 실행하기 된다.
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		}
		if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 조건을 한묶음으로 사용하기 위해서는 반드시 else if문을 사용해야 한다.
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 성적에 등급을 부여하는 프로그램을 만들어봅시다.
		score = 80;
		String grade = null;

		if (90 <= score && score <= 100) {
			grade = "A";

		} else if (70 <= score) {
			grade = "B";

		} else if (50 <= score) {
			grade = "C";

		} else {
			System.out.println("D");
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		//
		score = 79;
		grade = null;

		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		/*
		 * switch문 switch(int/String){case 1: break;} 조건식의 결과는 정수와 문자열만(JDK1.7부터
		 * 문자열 허용) 허용한다. 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */

		// switch문의 조건이 int인 경우
		a = 1;
		switch (a) {
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		// else문과 같은 역할 default
		default:
			System.out.println("이외의 경우에 하고 싶은 것 ");
		}

		String b = "a";
		switch (b) {
		case "a":
			System.out.println("b가\"a\"인 경우에 하고 싶은 것");
			// \"a\" ("")<- \를 통해 끝나는 역할을 하지 못하게 해줌.
			break;
		case "b":
			System.out.println("b가\"b\"인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}

		// 주어진 월에 해당하는 계절을 출력해봅니다.
		int month = 1;
		String season = null;

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은" + season + "입니다.");

		// 질문
		// 1~100점까지 모두 case를 사용하면 코드가 너무 길어짐.
		// Switch(score/10)을 사용한다.
		score = 100;
		grade = null;

		switch (score / 10) {
		case 10:
		case 9:
		case 8:
			grade = "A";
			break;
		case 5:
		case 6:
		case 7:
			grade = "B";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "의 점수는 " + grade + "이다.");

		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		int num;
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println(">숫자 입력: "); num =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * //switch문 사용 switch (num) { case 0: System.out.println("입력숫자:" + num
		 * + "," + "숫자 0이 맞습니다."); break; default: System.out.println("입력숫자:" +
		 * num + "," + "숫자 0이 아닙니다.");
		 * 
		 * }
		 * 
		 * //if문 사용 System.out.println(">숫자 입력: "); num =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * if(num==0){ System.out.println("입력숫자:" + num + "," + "숫자 0이 맞습니다.");
		 * } else{ System.out.println("입력숫자:" + num + "," + "숫자 0이 아닙니다."); }
		 */

		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		// switch문 사용
		/*System.out.println(">숫자 입력: ");
		num = Integer.parseInt(sc.nextLine());

		switch (num % 2) {
		case 0:
			System.out.println("입력숫자:" + num + "," + "짝수");
			break;
		case 1:
			System.out.println("입력숫자:" + num + "," + "홀수");

		}

		// if문 사용
		System.out.println(">숫자 입력: ");
		num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 0) {
			System.out.println("입력숫자:" + num + "," + "짝수");
		} else {
			System.out.println("입력숫자:" + num + "," + "홀수");
		}*/

		// 정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		// 평균은 소수점 1자리까지

		/*double num1;
		double num2;
		double num3;
		System.out.println(">점수1을 입력: ");
		num1 = Double.parseDouble(sc.nextLine());

		System.out.println(">점수2을 입력: ");
		num2 = Double.parseDouble(sc.nextLine());

		System.out.println(">점수3을 입력: ");
		num3 = Double.parseDouble(sc.nextLine());

		double sum;
		double avg;
		String grade1 = null;

		sum = num1 + num2 + num3;
		avg = Math.round(sum / 3.0* 10) / 10.0;
		
		//선생님 평균 풀이
		//avg = Math.round(sum /3.0 * 10) / 10.0;

		if (80 < avg) {
			grade1 = "A";
		} else if (60 < avg) {
			grade1 = "B";
		} else {
			grade1 = "C"; 
		}
		System.out.println(" 총점은 : " + sum + ", 평균은 " + avg + ", 등급은 "
				+ grade1 + " 입니다.");*/

		//랜덤 메소드
		//Math.random() : 0.0 ~ 1.0미만의 랜덤수 발생 (0부터 0.999999까지)
		int random = (int)(Math.random()*100)+1; 
		//(0부터 99.9999까지인데 +1을하면 1부터 100까지 표현 소수점을 없애기 위해 int형 사용 )
		System.out.println(random);

		//1~100사이의 랜덤한 수를 발생시키고 오름차순으로 출력해주세요. 
		int rn1 = (int)(Math.random()*100) +1;
		int rn2 = (int)(Math.random()*100) +1;
		int rn3 = (int)(Math.random()*100) +1;
		
		if (rn1 > rn2 && rn1 > rn3 && rn2 > rn3){
			System.out.println("1 " + rn3 + "<" + rn2 + "<" + rn1 );
		}
		else if (rn1 > rn2 && rn1 > rn3 && rn3 > rn2){
			System.out.println("2 " + rn2 + "<" + rn3 + "<" + rn1 );
		}		
		
		else if(rn2 > rn1 && rn2 > rn3 && rn1 > rn3){
			System.out.println("3 " + rn3 + "<" + rn1 + "<" + rn2 );
		}
		else if(rn2 > rn1 && rn2 > rn3 && rn3 > rn1){
			System.out.println("4 " + rn1 + "<" + rn3 + "<" + rn2 );
		}
		
		else if(rn3 > rn1 && rn3 > rn2 && rn1 > rn2){
			System.out.println("5 " + rn2 + "<" + rn1 + "<" + rn3 );
		}
		else if(rn3 > rn1 && rn3 > rn2 && rn2 > rn1){
			System.out.println("6 " + rn1 + "<" + rn2 + "<" + rn3 );
		}
		
		//if문 3개를 사용하여 풀이 - 선생님 풀이
		int num1 = (int)(Math.random()*100) +1;
		int num2 = (int)(Math.random()*100) +1;
		int num3 = (int)(Math.random()*100) +1;
		
		if(num1 > num2){ //작은수 큰수를 저장하고 싶음
			//근데 num1이 더 큰 랜덤 숫자일경우  temp라는 변수를 이용해서 자리를 바꿈.
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3){
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3){
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		
		
		
	}
}
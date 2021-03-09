package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트연산자
		 * |, &, ^, ~, <<, >>
		 * 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * (type) : 형변환
		 * ?:(삼항 연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * */

		// 1byte : 01010101 
		System.out.println(10 | 15); // |: 둘다 0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//10과 15 비트 연산자 수행값 :  00001111 => 15
		// 비트연산자는 특수한 경우에만 사용하고 잘 사용하지 않음 (연산의 과정이 직관적으로 보이지 않아서)
		
		// 삼항 연산자 중요! 
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		//           (true)이기 때문에 2번째 문장인 x가 실행 됨. 
		System.out.println(result);
		// int result = x;가 됨.
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자2이면 여자
		int regNo = 1; 
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은" + gender + " 입니다.");
		// 현재 이 표현에는 문제가 있음 1이나 2가 아닌 다른 숫자를 넣을경우 모두 여자가 나옴.
		
		gender = regNo == 3 ? "남자" : (regNo == 2 ? "여자": "확인불가");
		System.out.println("당신의 성별은 " +gender + " 입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		/*int num; ? 
		System.out.println("숫자1 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		int num2;
		System.out.println("숫자2 입력 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(num < num2 ? num2 : num);*/
		
		//숫자를 입력받고, 그 숫자가 이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요. 
		
		System.out.println(">숫자 입력: ");
		int g_n;
		g_n = Integer.parseInt(sc.nextLine());
		
		String g = g_n == 3 ? "남자" : (g_n == 2 || g_n ==4 ? "여자" : "확인불가");
		System.out.println("성별 " + g + " 입니다.");
		
	}
	

}

package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		/*int cal = n_1 + n_2;
		System.out.println("숫자 1 입력: ");
		n_1 = Integer.parseInt(sc.nextLine());
 
		System.out.println("연산자 입력: ");
		String Ope = sc.nextLine();

		System.out.println("숫자 2 입력: ");
		n_2 = Integer.parseInt(sc.nextLine());

		String result = (Ope.equals('+')) ?: ((Ope.equals(str2)) ? cal2*/

		//String result = Ope.equals('+')  
				
		//선생님 풀이
		System.out.println("숫자 1 입력: ");
		x = Integer.parseInt(sc.nextLine());
 
		System.out.println("연산자 입력: ");
		String op = sc.nextLine();

		System.out.println("숫자 2 입력: ");
		y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+") ? x +y
				: op.equals("-") ? x - y		
				: op.equals("*") ? x * y
				: op.equals("/") ? x / y
				: x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);
												
	}
}

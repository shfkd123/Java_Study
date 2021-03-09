package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		// 숫자 농구 게임

		Scanner s = new Scanner(System.in);

		int rn = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생
		int rn2 = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생
		int rn3 = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생

		int n;int n2;int n3;

		if (rn != rn2 && rn2 != rn3 && rn != rn3) {

			while (true) {

				System.out.print(">> 첫번째 숫자 입력: ");
				n = Integer.parseInt(s.nextLine());
				System.out.print(">> 두번째 숫자 입력: ");
				n2 = Integer.parseInt(s.nextLine());
				System.out.print(">> 세번째 숫자 입력: ");
				n3 = Integer.parseInt(s.nextLine());
				if (n == n2 || n == n3 || n2 == n3) {
					System.out.println("같은 숫자를 입력하셨습니다.");
					continue;

				}

				int S = 0;int B = 0;int O = 0;
				if (rn == n) {
					S = S + 1;

				} else if (rn2 == n || rn3 == n) {
					B = B + 1;
				}

				if (rn2 == n2) {

					S = S + 1;

				} else if (rn == n2 || rn3 == n2) {

					B = B + 1;
				}

				if (rn3 == n3) {

					S = S + 1;

				} else if (rn == n3 || rn2 == n3) {

					B = B + 1;

				}

				O = 3 - S - B;

				System.out.println(S + "S " + B + "B " + O + "O ");

				if (rn == n && rn2 == n2 && rn3 == n3) {

					System.out.println("정답!");

					break;

				}

			}

		}
		//선생님 풀이
		
/*		int a1 = 0;
		int a2 = 0;
		int a3;
		do {
			a1 = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생
			a2 = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생
			a3 = (int) (Math.random() * 9) + 1; // 1~9까지 랜덤숫자 발생
		} while (a1 == a2 || a1 == a3 || a2 == a3);

		int coun = 0; int input;
		while (true) {
			System.out.println("3자리 숫자>");
			input = Integer.parseInt(s.nextInt());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			input /= 10;

			int strike = 0;
			int ball = 0;
			int out = 0;

			if (a1 == i1)
				strike++;
			if (a2 == i2)
				strike++;
			if (a3 == i3)
				strike++;

			if (a1 == i2 || a1 == i3)
				ball++;
			if (a2 == i1 || a2 == i3)
				ball++;
			if (a3 == i1 || a3 == i2)
				ball++;

			out = 3 - strike - ball;

			System.out.println(++coun + "차 시도 (" + i1 + i2 + i3 + ") : "
					+ strike + "S" + ball + "B" + out + "O");
			System.out.println("=========================");

			if (strike == 3) {
				System.out.println("정답!");
				break;
			}
		}*/

	}

}
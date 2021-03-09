package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/* 산술연산자 
		- 사칙연산: +, -, *, /(몫), %(나머지)
		- 복합연산자: +=, -=, *=, /=, %=
		- 증감연산자: ++, --*/
		
		/*int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		//나머지 연산 
		result = 10 / 3;
		System.out.println(result);
		//결과 3 
		// int 끼리 계산을 하면 결과값이 int로 나옴
		result = 10 % 3;
		System.out.println(result);*/
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		int num = 2 + 1;
		int num2 = 67 - 23;
		float num3 = 23 * 35;
		double num4 = 45.2 / 43.5;
		double num5 = 21 % 6.03;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//복합연산자
		/*변수에 저장되어 있는 값에 연산을 수행할 때
		 *수행할 연산자와 대이연산자를 결합해 사용할 수 있다. */
		int result = 0;
		result += 3; 
		result = result + 3; 
		System.out.println(result);
		
		result -= 5;
		result = result - 5;
		System.out.println(result);
		
		result *= 2;
		result = result * 2;
		System.out.println(result);
		
		//아래의문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		System.out.println(result);
		
		//result = result - 2 * 3;
		result -= 2 * 3;
		
		//result = result %5;
		result %= 5;
		System.out.println(result);
		
		//증감연산자 
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다. 
		
		int i = 0;
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다. 
		--i; 
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		//출력값 1
		i = 0;
		System.out.println("i++ = " + i++);
		//출력값 0
		System.out.println(i);
		//출력값 1
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다. 
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다. 
		//현재 이 코드는 형변환이 생략 됨. 
		//double result2 = (double)_int + _double; //위에 코드와 같은 코드 		
		System.out.println(result2);
		
		long _long = 100L;
		_long =_int + _long;
		_int = _int + (int)_long;
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;
		System.out.println(result3);
		//최소 4바이트 이상이어야 연산이 가능 무조건 int로 맞춰서 연산 따라서 결과도 int 
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		//결과값 195
		
		// 피연산자: 숫자
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		//출력값 128
		b--;
		System.out.println(b);
		//출력값 127
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 65432
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long number1 = 123456;
		long number2 = 654321;
		
		long sumNumber = number1 + number2;
		System.out.println("1번의 결과값" + sumNumber);
		
		long sumNumber2 = sumNumber * 123456;
		System.out.println("2번의 결과값" + sumNumber2);
		
		long sumNumber3 = sumNumber2 / 123456;
		System.out.println("3번의 결과값" + sumNumber3);
		
		long sumNumber4 = sumNumber3 - 654321;
		System.out.println("4번의 결과값" + sumNumber4);
		
		long sumNumber5 = sumNumber4 % 123456;
		System.out.println("5번의 결과값" + sumNumber5);
		
		System.out.println();
		
		//선생님 풀이
		long res = 12345 + 654321;
		res *= 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println(res);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int int_num = 10;
		int int_num2 = 65;
		int int_num3 = 32;
		
		int sum = int_num + int_num2 + int_num3;
		System.out.println("합계 : "+ sum);
		sum /= 3.0; // sum과 3 모두 int형으로 소수점이 제대로 표현되지 않음
		System.out.println("평균 : "+ (double)sum);
		
		
		//선생님 풀이
		int num1 = 15;
		int num9 = 34;
		int num10 = 49;
		int sum2 = num1 + num9 + num10;
		double avg = sum2 / 3.0;
		System.out.println(avg);
		
		
		//반올림
		/*avg = Math.round(avg);// 소수점 첫째자리에서 반올림
		//Math.round는 무조건 첫째자리에서 반올림함
		System.out.println(avg);
		*/
		
		//소수점 두번째나 세번째를 보고싶을 때 소수점을 돌리고 다시 실행
		avg = Math.round(avg * 10) / 10.0;
		System.out.println(avg);
		
		
		
		
	}

}

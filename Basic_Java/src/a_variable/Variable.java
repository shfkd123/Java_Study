package a_variable; // 클래스의 위치 

import java.util.Scanner;

public class Variable { // Variable 클래스

	public static void main(String[] args) { // 메인 메서드()

		int x; // 정수형 변수 x 생성

		// double x; 메소드 내에 같은 변수 사용 못함.

		double y = 3.14; // 실수형 변수 y 생성

		// y에 3.14값으로 초기화

		// 변수의 타입에 맞는 값을 저장 (실수)

		x = 10; // 초기화 (변수에 처음으로 값을 저장하는 것)

		int abc = 30; // 일반적으로 선언과 초기화를 한번에 한다.

		long l = 40L; // 접미사 L을 붙어야 long 타입이 된다.

		float f = 5.5f; // 접미사 f를 붙어야 float 타입이 된다.

		char c = '한'; // 따옴표안에 반드시 한글자를 넣어야 한다.

		// 공백이나 두글자 이상을 사용하면 컴파일 오류

		boolean b = true; // true, false

		// 기본형 타입을 사용하여 8개의 변수를 선언 및 초기화를 해주세요.

		int a = 0;
		float q = 3.14f;
		double w = 0.0003;
		char r = '김';
		boolean

		t = false;
		short u = 2;
		long i = 23452;
		byte k = 1;

		x = 20;

		// 기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.

		y = 5.5;

		// 값 변경

		a = 1;

		q = 4.5f;

		w = 0.3;

		r = '두';

		t = true;

		u = 1;

		i = 234;

		k = 0;

		System.out.println(x); // 출력문, 콘솔창에 출력

		System.out.println(100);

		System.out.println(a);

		System.out.println(q);

		System.out.println(w);

		System.out.println(r);

		System.out.println(t);

		System.out.println(u);

		System.out.println(i);

		System.out.println(k);

		String str = "문자를 여러개 ";

		System.out.println(str);

		// 문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.

		System.out.println(str + 50 + 30);

		System.out.println(50 + 30 + str);

		// 형변환

		int small = 10;

		long big = 10L;

		// small = big; 타입형이 맞지 않기 때문에 오류

		small = (int) big; // (형변환)

		big = small;

		// 명명규칙

		
		 /** 영문자, 대소문자, 한글, 숫자, 특수문자('-', '$')을 사용할 수 있다.
		 * 
		 * 숫자로 시작할 수 없다.
		 * 
		 * 예약어는 사용할 수 없다.
		 * 
		 * [낙타식 표기법을 사용한다.(mysampleVariable)]
		 * 
		 * [클래스명의 첫글자를 대문자로 한다.(MySampleClass)]]*/
		 

		// 상수

		
		 /** 값을 변경할 수 없는 그릇
		 * 
		 * 리터럴에 의미를 부여하기 위해 사용한다.*/
		 

		final int MAX_NUMBER = 10;

		// 출력

		System.out.print("줄바꿈 안함");

		System.out.println("줄바꿈");

		System.out.print("줄바꿈!\n");

		System.out.println("줄바꿈을\t한다.");

		System.out.printf("문자열: %s, 숫자: %d", "안녕", 10);

		// 출력 포맷을 지정한다.

		System.out.println();

		// 입력

		Scanner sc = new Scanner(System.in);

		// 입력을 위한 클래스

		// 변수 초기화 = 클래스

		
		 /** System.out.println("아무거나 입력을 해주세요");
		 * 
		 * String str2 = sc.nextLine();
		 * 
		 * System.out.println("입력받은 내용: " + str2);*/
		 

		// 입력을 받게되면 사용자가 입력 할 때까지 프로그램이 멈추게 된다.

		// 내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.

		
		/* * System.out.println("int 이력>");
		 * 
		 * int nextInt = sc.nextInt();
		 * 
		 * System.out.println(nextInt);
		 * 
		 * System.out.println("문자열 입력>");
		 * 
		 * String nextLine = sc.nextLine();
		 * 
		 * System.out.println(nextLine);
		 * 
		 * System.out.println("입력 끝");
		 */

		// 숫자 입력

		
		/* * System.out.println("int 입력>");
		 * 
		 * int number = Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.println(number);*/
		 

		// 문제

		// 자신의 이름을 저장할 변수를 선언해주세요.

		
		 /* System.out.println("이름 입력: ");
		 * 
		 * String name;
		 * 
		 * //위에서 선언한 변수를 초기화 하기 입력받아주세요.
		 * 
		 * name = sc.nextLine();
		 * 
		 * System.out.println("name: " + name);
		 * 
		 * 
		 * 
		 * //자신의 나이를 지정할 변수를 선언해주세요
		 * 
		 * System.out.println("나이 입력: ");
		 * 
		 * int age;
		 * 
		 * //위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아 주세요.
		 * 
		 * age = Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.println("age: " + age);
		 * 
		 * 
		 * 
		 * System.out.println("이름은" + name + "이고, "+ "나이는" + age + "입니다.");*/
		 

		// 다음과 같은 프로그램을 작성해주세요.

		
		/* * =======회원가입=======
		 * 
		 * 아이디>admin
		 * 
		 * 비밀번호(4자리 숫자)> 1234
		 * 
		 * 이름> 홍길동
		 * 
		 * 나이> 99
		 * 
		 * 키> 85.5
		 * 
		 * ===================
		 * 
		 * 아이디 : admin
		 * 
		 * 비밀번호 : 1234
		 * 
		 * 이름: 홍길동
		 * 
		 * 나이: 99세
		 * 
		 * 키: 185.5cm
		 * 
		 * ===================*/
		 

		System.out.println("========회원가입========");

		System.out.println("아이디>");

		String id = sc.nextLine();

		System.out.println("비밀번호");

		int pw = Integer.parseInt(sc.nextLine());

		System.out.println("이름>");

		String Input_name = sc.nextLine();

		System.out.println("나이>");

		int Input_age = Integer.parseInt(sc.nextLine());

		System.out.println("키>");

		// String height = String.format(sc.nextLine());

		double height = sc.nextDouble();

		System.out.println("=====================");

		System.out.println("아이디 : " + id);

		System.out.println("비밀번호 : " + pw);

		System.out.println("이름 : " + Input_name);

		System.out.println("나이 : " + Input_age + "세");

		System.out.println("키 : " + height +"cm");

		System.out.println("=====================");

	}

	// 실수형 입력 받을 때

	// Double.parseDouble(sc.nextLine());

}
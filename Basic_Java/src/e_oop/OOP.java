package e_oop;

public class OOP {

	public static void main(String[] args) {

		// 학습목표 - 메서드

		/*
		 * 객체지향 프로그래밍 (Object Oriented Programming) - 프로그래밍을 단순히 코드와 연속으로 보는것이
		 * 아니라 객체간의 상호작용으로 보는 것 - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */

		// 자바는 객체지향 프로그래밍이다.
		// 자바는 객체를 통해 나눈다. 객체라는 것은 사물이 될 수도 있고, 개념, 사람 등 어떤 대상을 객체라고 부를 수 있다.

		// SampleClass의 method2를 호출할 것임.
		SampleClass sc = new SampleClass(); // SampleClass 객체 생성
		System.out.println(sc.field);
		sc.method1(); // method1()을 호출
		// 메서드가 호출되면 메서드가 있는 곳으로 가서 실행되고 다시 돌아옴.
		String returnValue = sc.method2(10);
		System.out.println(returnValue);

		sc.flowTest1();

		// 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		// 객체가 저장된 변수를 통해 메서드를 호출해주세요.
		// 파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		// 리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요.

		ClassMaker cm = new ClassMaker(); // ClassMaker 객체 생성
		cm.method();

		System.out.println(cm.method2());

		cm.method3(4);

		int mul = cm.method4(2, 6);
		System.out.println(mul);
		// Ctrl + SpaceBar : 자동완성

		/*
		 * Calculator c = new Calculator(); double sum = c.sum(123456, 654321);
		 * 
		 * double mul1 = c.mul(sum, 123456);
		 * 
		 * double div = c.div(mul1, 123456);
		 * 
		 * double minus = c.minus(div, 654321);
		 * 
		 * double div_c = c.div_c(minus, 123456); System.out.println(div_c);
		 */

		Calculator c = new Calculator();
		double result = c.sum(123456, 654321);
		result = c.mul(result, 123456);
		result = c.div(result, 123456);
		result = c.minus(result, 654321);
		result = c.div_c(result, 123456);
		System.out.println(result);

		/*
		 * 성적처리 프로그램을 메서드로 나누기 Student 클래스에 메서드를 만들고 Score에서 메서드를 호출하는 구조를
		 * 만들어주세요.
		 */
	}
}

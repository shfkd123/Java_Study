package e_oop;

public class ClassMaker2 {

	// 인스턴스 변수를 하나 선언하고 명시적으로 초기화 해주세요.
	int ins = 0;
	// String name = "홍길동";

	// 위에서 선언한 인스턴스 변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		ins = 30;
		// name = "홍길동";
	}

	// 위에서 선언한인스턴스변수를 생성자의 파라미터를사용해 초기화 해주세요.

	ClassMaker2(int ins) {
		this.ins = ins;
	}

	// 위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2() {
		this.ins = 50;

	}

	// 초기화 순서
	// 명시적 초기화 -> 블럭 초기화 -> 생성자 초기화
	// 결국엔 값은 생성자에서 초기화한 값.

	public static void main(String[] args) {
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.ins);

		ClassMaker2 cm2 = new ClassMaker2(24);
		System.out.println(cm2.ins);
	}
}

package e_oop;

public class VariableInit {

	//초기화 방법
	//명시적 초기화
	int var = 10;
	static int staticVar = 20;
	
	//초기화 블럭
	{
		var  = 30;
	}
	
	static{
		staticVar  = 40;
	}
	
	/*
	 * 생성자
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다.
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야 한다. 
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다. 
	 * - 생성자는 리턴타입이 없다. 
	 */
	
	//생성자 - 객체 생성 시에만 존재 파라미터는 있을 수 있고, 리턴타입은 없음. 
	VariableInit(){
		var = 50; //왜 생성자를 사용해서 초기화를 하는걸까? 
		// <생성자 사용 이유>
		//초기화에 여러줄의 코드가 필요할 때
		//초기화에 파라미터가 필요할 때 
	}
	
	public static void main(String[] args) {
		Init i = new Init(); //객체 생성
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		//생성자를 생성했으니 사용!
		Init i3 = new Init(70,80,90);
		
		
	}

}

class Init{
	int a;
	int b;
	int c;
	
	//메서드의 이름은 같을 수 있음 => 오버로딩 (같은 이름의 메서드를 여러개 정의- 파라미터로 구분) 
	
	//파라미터가 없는 기본적인 생성자
	Init(){
		/*a=10;
		b=20;
		c=30;*/
		this(10,20,30);
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다. 
	}
	//생성자 생성
	Init(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		//this : 인스턴스 변수와 (파라미터안의)지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다. 
	}
	
	
}
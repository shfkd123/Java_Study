package g_oop2;

//SampleParent에게서 상속받음
public class SampleChild extends SampleParent{ 

	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드 
	}
	
	//*중요!
	//오버라이딩
	//super(부모클래스의 멤버와 자식클래스의 멤버를 구분할 때 사용)
	//, super() (부모클래스의 생성자를 호출할 때 사용)
	//다형성  
	
	//오버로딩과 오버라이딩 ) 오버로딩은 이름이 같은 메서드, 파라미터로 구분
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것. 
	
	//메서드
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것.
	//이 메소드는 오버라이딩이 된 메소드라고 어노테이션으로 알려준다! 
	int method(int a, int b){ //오버라이딩시 선언부분의 리턴타입 메서드명
		return a * b;					//파라미터 모두 같아야 한다.	
	}
	
	//super, super()
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수 
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수 
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용
		//super는 변수만 구분하는 것이 아니라 메소드도 구분함. 
		System.out.println(this.method(10, 20)); //SampleChild의 메소드
		System.out.println(super.method(10, 20)); //SampleParent의 메소드 
		
	}
	
	//생성자
	SampleChild(){
		super(); //부모 클래스의 생성자 호출
		//super()를 통해 클래스의 생성자를 호출하고 부모 클래스의 인스턴스 변수도 초기화 한다. 
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다. (파라미터가 없는 생성자)
		//파라미터가 있는 생성자는 직접 super()를 호출해줘야 함.
		
		//<자식클래스의 super()를 호출하는 이유>
		//생성자는 변수를 초기화 하기위해 사용 => 부모 클래스에 있는 변수도 초기화 해줘야 함.
		//SampleChild를 사용하고 싶으면 객체를 생성하고 생성자를 사용함. 
		//이때 SampleChild는 SampleParent의 변수를 상속받으므로
		//super()를 통해 생성자를 호출해준다.
		
	}
	
	//다형성
	public static void main(String[] args){
		SampleChild sc = new SampleChild(); //SampleChild 객체 생성
		SampleParent sp = new SampleChild(); //다형성, 부모 클래스의 변수를 사용하는데 자식 클래스를 담아서 사용
		//SampleParent sp = new SampleChild2();
		//SampleParent sp = new SampleChild3();
		//부모 타입의 변수를 자식타입의 객체를 사용하는 것이 다형성이다.
		
		//부모와 지식간에는 서로 형변환이 가능하다. 
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		
		//자식타입 ->부모타입 형변화는 생략 할 수 있다.
		sp = sc;
		
		
		//만약 객체를 생성했는데 자식타입에 생성했다고 하자.
		SampleChild sc2 = (SampleChild)new SampleParent(); //형변환을 넣어야 한다. 
		//SampleParent는 2개의 멤버를 가지고 있다.
		//SampleChild는 5개의 멤버를 가지고 있다. (상속받은 멤버 + )
		//형변환을 넣는이유 
		//현재 SampleParent와 SampleChild 멤버의 개수가 맞지 않기때문에 문제가 발생할 수 있다. 5개를 사용할 수 있어야하는데 2개밖에 사용못함. 
		//그러므로 부모타입의 객체를 자식타입으로 형변환 하는 것은 에러를 발생시킨다. 
		
		//sp.childMethod(); //사용불가
		//sp.test(); 사용불가
		
		//그 반대의 경우는 가능하다! (부모타입 <- 자식타입)
		//SampleParent 타입의 변수로는 SampleChild 객체를 가지고도 2개의 멤버만 사용할 수 있다.
		SampleParent sp2 = new SampleChild();
		System.out.println(sp2.var);
		System.out.println(sp2.method(10,20));
		
		
		
	}
	
	
	
}

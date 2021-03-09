package g_oop2;

public interface SampleInterface {

	//클래스가 아닌!!! 인터페이스
	//인터페이스가 무엇인가?
	//추상메서드만 가질 수 있는게 인터페이스!!!!! 일반적인 메소드는 가질 수 없음! 
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
}

//implements를 사용하여 인터페이스 2개를 상속받음. 
class SampleImplement implements SampleInterface, SampleInterface2{
	
	//클래스는 하나의 클래스에게만 상속받을 수 있었음.
	//인터페이스는 여러개의 인터페이스에게서 상속받을 수 있음.
	@Override
	public void method1() {
	
		
	}

	@Override
	public void method2() {
		
		
	}

	@Override
	public void method3() {

		
	}

}

interface SampleInterface2{
	void method1();
	void method3();
}
package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM (Java Virtual Machine)
		 * 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * 운영체제 -> JVM -> 자바 프로그램
		 * 장점 : 운영체제에 상관없이 실행할 수 있다. 
		 * 단점 : 속도가느리다. 
		 * 
		 * JVM 메모리 구조
		 * Method Area(메서드 영역) : 클래스 멤버가 저장되나. 
		 * Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다. 
		 * Heap : 객체가 저장된다. 
		 */
		
		/*
		 * Method Area : main()메서드 , classVar변수, classMethod()메서드
		 * 프로그램이 종료되면 Method Area에도 아무것도 남지않고 다 삭제가 된다.   
		 *, System.out (out도 System이라는 클래스에서 static이 붙은 메소드)
		 * Heap : //JVM//
		 * Call Stack : //main(){jvm = null}//, //instanceMethod()// //println()//, //classMethod()//, //println()//
		 */
		
		
		System.out.println(classVar); //println()이라는 메서드가 스택영역에 올라가고 실행됨. 
		//스택영역에 올라가고 종룔되면서 스택영역에서 사라짐.
		
		classMethod(); //classMethod 메서드 호출
		
		JVM jvm = new JVM(); //객체 생성
		
		System.out.println(jvm.instanceVar);
		
		jvm.instanceMethod();
		
		jvm = null; //null값을 넣음으로써 아무도 사용 못함(아무도 참조 안함)
		//-> GarbageCollector에 의해 제거됨. 
			
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
		//System.out.println(instanceVar);
		System.out.println(classVar);
	}

}

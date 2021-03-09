package e_oop;

public class StaticTest {

	//클래스 멤버- static이 붙는애들 클래스 변수, 클래스 메서드
	//인스턴스 멤버는 인스턴스화(객체생성)후 사용 인스턴스 변수, 인스턴스 메서드
	
	static int classVar; //클래스 변수
	int instanceVar; //인스턴스 변수
	
	//메인 메소드
	public static void main(String[] args) {
		System.out.println(classVar);
		
		//사용 못함 (오류) 
		//System.out.println(instanceVar);
		
		//StaticTest의 객체 생성 후 사용하면 됨.
		
		/*System.out.println(new StaticTest().instanceVar);
	
		StaticTest st = new StaticTest();
		System.out.println(st.instanceVar);*/
		
		StaticTest s = new StaticTest(); 
		
		
	}
	void instanceMethod(){ //인스턴스 메서드
		System.out.println(classVar);
		System.out.println(instanceVar); //위에 객체 생성을 이미 해서 오류가 나지 않음.
	}

}

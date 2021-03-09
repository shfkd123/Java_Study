package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요. 
	int m_num = 0;
	//String str = "ABC";
	
	//리턴타입과 파라미터가 없는 메서드를 만들어주세요. 
	//메서드 안에서 전역변수를 출력해주세요. 
	void method(){
		System.out.println(m_num);
	}
	//void a(){
	//	System.out.println(str);
	//}
	
	//전역변수와 동일한 타입의 리턴타입이있고 파라미터는 없는 메서드를 하나 만들어주세요. 만들었던 전역변수 리턴
	int method2(){
		return m_num;
	}
	
	/*String b(){
		return str;
	}*/
	
	//리턴타입은 없고 파라미터가 있는 메서드를 하나 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요. 
	void method3(int prm){
		System.out.println(prm);
	}
	
	/*void c(int a){
		System.out.println(a);
	}*/
	
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 잇는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱합 결과를 리턴해주세요. 
	
	int method4(int prm2, int prm3){
		return prm2 * prm3;
	}
	
	/*int d(int a, int b){
		return a * b;
	}*/
	
	//return의 역할
	//1. 메소드를 종료시키는 역할
	//2. 값을 넘겨는 역할
}

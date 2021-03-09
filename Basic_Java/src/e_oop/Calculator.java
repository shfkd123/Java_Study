package e_oop;

public class Calculator {
	
	//계산기의 메서드를 만들어라
	//5개의 산술연산을 해주는 5개의 메서드를 생성
	//각각의 메서드는 두 개의 파라미터(값)을 받아서 연산을 한 다음에 
	//연산한 결과를 리턴해준다. 

	double sum(double a, double b){		
		return a+b;
	}
	
	double minus(double a, double b){
		return a - b;
	}
	
	double mul(double a, double b){
		return a * b;
	}
	
	double div(double a, double b){
		return a / b;
	}
	
	double div_c(double a, double b){
		return a % b;
	}
}

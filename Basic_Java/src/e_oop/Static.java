package e_oop;

public class Static {

	/*
	 * static을 붙이면 프로그램 실행시 메모리에 올라간다.
	 * 객체생성을 하지 않아도 사용할 수 있다.
	 * static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */
	
	//변수의 값을 공유하기 위해 static을 붙인다.
	static int var; //static은 전역변수에만 붙일 수 있다.
	
	
	public static void main(String[] args) {
		//static int a 지역변수에는 static을 붙일 수 없음. 오류
		
		//Human이라는 클래스를 이용하여 객체 2개 생성
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDataMoney(200000);
		영희.saveDataMoney(200000);
		
		/*//출력결과
		철수가 넣은 금액 - 데이트 통장 잔고: 200000
		영희가  넣은 금액 - 데이트 통장 잔고: 400000
		=> 누적이 됨. (공유하고 있어서 그럼)*/
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		System.out.println("입력받은 문자열: " + str);
		
		System.out.println("숫자 입력>");
		int i = ScanUtil.nextInt();
		System.out.println("입력받은 숫자: " + i);
	}

}

class Human{
	
	//static을 사용하지 않은 인스턴스 변수를 사용. 
	int account; //계좌, 통장
	
	void saveMoney(int money){
		account += money;
		System.out.println("통장잔고: " + account);
	}
	
	static int dateAccount;
	void saveDataMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고: " + dateAccount);		
	}
	
}

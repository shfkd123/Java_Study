package e_oop;

import java.util.Scanner;

public class Car {

	static int action = 0;
	

	String car_kind; // 차 종류
	int car_money; // 차 금액
	int car_time; // 차 빌릴 시간
	String s = "소형"; 
	String j = "중형"; 
	String b = "대형"; 

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Car car = new Car(); // 객체 생성

		while (true) {
			System.out.println("======================M렌트카=================================================");
			System.out.println("1.차 종류" + "\t" + "2.차 금액 확인" + "\t"+ "3.차 렌트 시간선택"+ "\t"+ "4.차 선택 조희"+"\t"+ "5.선택안함(종료)");
			System.out.println("============================================================================");
			System.out.print(">>원하는 기능을 입력하세요.");
			action = in.nextInt();
			switch (action) {
			case 1:
				car.car_kind();
				break;
			case 2:
				car.car_money();
				break;
			case 3:
				car.car_time();
				break;
			case 4:
				car.printInfo();
				break;
			case 5:
				System.out.println("시스템이 종료 되었습니다.");
			    System.exit(0);
			default:
				System.out.println("## 입력 오류입니다. ##");
			}// swtich문

		}// while문

	}// main 메소드

	void car_kind() {

		System.out.println("===========M렌카 차량===========");
		System.out.println("1.소형\t2.중형\t3.대형\t4.선택안함(종료)");
		System.out.println("=============================");
		System.out.print(">>원하는 기능을 입력하세요.");
		action = in.nextInt();
		switch (action) {
		case 1:		
			System.out.println(">>소형차를 선택하셨습니다.");
			car_kind  = "소형";
			car_money();			
			break;
		case 2:			
			System.out.println(">>중형차를 선택하셨습니다.");
			car_kind = "중형";
			car_money();
			break;
		case 3:			
			System.out.println(">>대형차를 선택하셨습니다.");
			car_kind = "대형";
			car_money();
			break;
		case 4:
			System.out.println("시스템이 종료 되었습니다.");
		    System.exit(0);
		default:
			System.out.println("## 입력 오류입니다. ##");
		}

	}// car_kind() 메소드 종료

	void car_money() {

		System.out.println("======================M렌카 금액===========================");
		System.out.println("1.소형차 금액\t2.중형차 금액\t3.대형차 금액\t4.선택안함(종료)");
		System.out.println("=========================================================");
		System.out.print(">>금액을 확인합니다.");
		action = in.nextInt();
		switch (action) {
		case 1:		
			System.out.println(">>소형차 금액");
			System.out.println(">>소형차 금액을 확인하려면 렌트 기간을 선택해주세요.");
			car_time();
			car_kind  = "소형";

			break;
		case 2:		
			System.out.println(">>중형차 금액");
			System.out.println(">>중형차 금액을 확인하려면 렌트 기간을 선택해주세요.");
			car_time();
			car_kind  = "중형";
			break;
		case 3:			
			System.out.println(">>대형차 금액");
			System.out.println(">>대형차 금액을 확인하려면 렌트 기간을 선택해주세요.");
			car_time();
			car_kind  = "대형";
			break;
		case 4:
			System.out.println("시스템이 종료 되었습니다.");
		    System.exit(0);
		default:
			System.out.println("## 입력 오류입니다. ##");
		}
	}// car_money() 메소드 종료

	void car_time() {

		System.out.println("======================M렌카 차량=====================");
		System.out.println("1.6시간\t2.12시간\t3.1일\t4.2일\t5.3일이상\t6.선택안함(종료)");
		System.out.println("==================================================");

		System.out.print(">>렌트 시간을 선택해주세요.");
		action = in.nextInt();

		switch (action) {
		case 1:
			System.out.println(">>6시간 ");
			System.out.println("==========");
			System.out.println("소형: 20,000");
			System.out.println("중형: 30,000");
			System.out.println("대형: 40,000");
			System.out.println("===========");
			
			if(car_kind.equals("소형")){
				car_kind = "소형";
				car_money = 20000;
				car_time = 6;
			}
			else if(car_kind.equals("중형")){
				car_kind = "중형";
				car_money = 30000;
				car_time = 6;
			}
			else
			car_kind = "대형";
			car_money = 40000;
			car_time = 6;
			
			break;
		case 2:
			System.out.println(">>12시간 ");
			System.out.println("==========");
			System.out.println("소형: 30,000");
			System.out.println("중형: 40,000");
			System.out.println("대형: 50,000");
			System.out.println("===========");
			
			if(car_kind.equals("소형")){
				car_kind = "소형";
				car_money = 30000;
				car_time = 12;
			}
			else if(car_kind.equals("중형")){
				car_kind = "중형";
				car_money = 40000;
				car_time = 12;
			}
			else
			car_kind = "대형";
			car_money = 50000;
			car_time = 12;
			break;
		case 3:
			System.out.println(">>1일 ");
			System.out.println("==========");
			System.out.println("소형: 40,000");
			System.out.println("중형: 50,000");
			System.out.println("대형: 60,000");
			System.out.println("===========");
			if(car_kind.equals("소형")){
				car_kind = "소형";
				car_money = 40000;
				car_time = 1;
			}
			else if(car_kind.equals("중형")){
				car_kind = "중형";
				car_money = 50000;
				car_time = 1;
			}
			else
			car_kind = "대형";
			car_money = 60000;
			car_time = 1;
			break;
		case 4:
			System.out.println(">>2일 ");
			System.out.println("==========");
			System.out.println("소형: 70,000");
			System.out.println("중형: 80,000");
			System.out.println("대형: 90,000");
			System.out.println("===========");
			if(car_kind.equals("소형")){
				car_kind = "소형";
				car_money = 70000;
				car_time = 2;
			}
			else if(car_kind.equals("중형")){
				car_kind = "중형";
				car_money = 80000;
				car_time = 2;
			}
			else
			car_kind = "대형";
			car_money = 90000;
			car_time = 2;
			break;
		case 5:
			System.out.println(">>3일 이상 ");
			System.out.println("==========");
			System.out.println("소형: 80,000");
			System.out.println("중형: 90,000");
			System.out.println("대형: 100,000");
			System.out.println("===========");
			if(car_kind.equals("소형")){
				car_kind = "소형";
				car_money = 80000;
				car_time = 3;
			}
			else if(car_kind.equals("중형")){
				car_kind = "중형";
				car_money = 90000;
				car_time = 3;
			}
			else
			car_kind = "대형";
			car_money = 100000;
			car_time = 3;
			break;
		case 6:
		    System.out.println("시스템이 종료 되었습니다.");
		    System.exit(0);
		default:
			System.out.println("## 입력 오류입니다. ##");
		}

	}// car_time() 메소드 종료

	void printInfo() {
		System.out.println("======================================");
		System.out.println("\t고객님이 선택하신 차량\t");
		System.out.println(">차 종류: "+ car_kind);
		System.out.println(">차 렌트기간:"+car_time);
		System.out.println(">차 금액:"+car_money);
		System.out.println("=====================================");
	}
}// 클래스 Car

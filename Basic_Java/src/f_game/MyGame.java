package f_game;

import e_oop.ScanUtil;

public class MyGame {

	//게임의 주인공
	Character c;
	Item[] items; //아이템
	
	//생성자를 사용해서 초기화
	MyGame(){
		c = new Character("가렌", 100, 50, 20, 10);
		
		//Item클래스 객체 생성
		items = new Item[10];
		items[0] = new Item("무한의대검",0,0,10,0);
		items[1] = new Item("가시갑옷", 0,0,0,10);
		
	}
	public static void main(String[] args) {
		new MyGame().start();

	}
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.종료");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				c.showInfo();break;
			case 2:
				hunt();break;
			case 3:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	
	void hunt(){
		Monster m = new Monster("고블린", 50, 10, 15, 5, new Item[]{items[0], items[1]}); //인덱스 0,1번에 들어있는 무기를 줌
		Monster m2 = new Monster("주황버섯", 50, 10, 15, 5, new Item[]{items[0], items[1]}); //인덱스 2,3번에 들어있는 무기를 줌
		Monster m3 = new Monster("초록버섯", 30, 20, 10, 10, new Item[]{items[0], items[1]}); 

		
		System.out.println(m2.name + " 을(를) 만났습니다. 전투를 시작합니다.");

		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:

				c.attack(m2);

				if (m2.hp <= 0) {
					System.out.println(m2.name + "을 처치하였습니다.");
					c.getExp(150);
					c.getItem(m2.itemDrop());// 아이템 불러옴.(연결)
					break battle;
				}

				m2.attack(c);

				break;
			case 2: 
				break battle;
			}
		}
	}
}

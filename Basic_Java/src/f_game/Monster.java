package f_game;

public class Monster {
	
	String name; // 이름
	int maxHP; // 최대 체력
	int maxMP; // 최대 마나
	int hp;
	int mp;	
	int att; 
	int def; 
	Item[] items; // 몬스터가 캐릭터에게 주는 아이템 Moster클래스에서 만든 items배열
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items) {
		this.name = name;
		this.maxHP = hp;
		this.maxMP = mp;
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	


		//공격력 메소드
		void attack(Character c){

			
			int damage = att-c.def; //방어력이 더 큰 경우가 존재할 수 있음. 
			damage = damage <= 0 ? 1: damage; //데미지가 0 이하면 최소한 1이 되도록 만들어줌. 
			
			c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage; 
			System.out.println(name + "가 공격으로" + c.name + "에게"
					+damage + "만큼 데미지를 주었습니다.");
			System.out.println(c.name + "의 남은 HP : " + c.hp);
		}
		
		//몬스터가 죽을 때 주는 아이템
		Item itemDrop(){
			return items[(int)(Math.random()* items.length)]; //몬스터에서 만든배열의길이 
		}
		
		
}

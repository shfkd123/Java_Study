package f_game;

public class Character {

	String name; //이름
	int maxHP; //최대 체력
	int maxMP; //최대 마나
	int hp;
	int mp;
	
	//능력치는 2가지만
	int att; //공격력
	int def; //방어력
	int level; //레벨
	int exp; //경험치
	Item[] items; //보유 아이템 배열 생성
	
	//변수를 생성했으니 초기화를 생성해야한다. 
	
	
	//생성자
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		//레벨업시 체력과 마나 생각
		this.maxHP = hp;
		this.maxHP = mp;
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("===========================");
		System.out.println("----------상태--------------");
		System.out.println("이름: " +name);
		System.out.println("레벨: " +level + "(" + exp + "/100)");
		System.out.println("체력: " + hp + "/" + maxHP);
		System.out.println("마나: " + mp + "/" + maxHP);
		System.out.println("공격: " + att);
		System.out.println("방어: " + def);
		System.out.println("-----------아이템-----------");
		for(int i =0; i<items.length; i++){
			//보유한 아이템 출력 / 10번까지 돌면서 가지고 있는 것만 출력 (null이 아닌 것)
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
				
			}
		}
		System.out.println("==============================");
	}
	
	//공격력 메소드
	void attack(Monster m){
		int damage = att-m.def; //방어력이 더 큰 경우가 존재할 수 있음. 
		damage = damage <= 0 ? 1: damage; //데미지가 0 이하면 최소한 1이 되도록 만들어줌. 
		
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; 
		System.out.println(name + "가 공격으로" + m.name + "에게"
				+damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	//몬스터가 죽으면 경험치와 아이템을 줌.
	//경험치 메소드
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		//경험치가 100이 넘어가는 순간 경험치 증가
		//경험치를 얻으면 한번으로 끝나지 않을 수 있음. 한번에 200, 300 ..을 받을 수 있기 때문
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	//레벨 업 메소드
	void levelUp(){
		level++;
		maxHP += 10;
		maxMP += 5;
		att += 2;
		def += 2;
		hp = maxHP;
		mp = maxMP;
		System.out.println("LEVEL UP!!");
	}
	
	//아이템 메소드
	//어떤 아이템을 얻었는지 파라미터가 받음.

	void getItem(Item item){		//어떤 아이템을 얻었는지에 대한 정보가 필요하므로 파라미터에 입력
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i=0; i<items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		
		maxHP += item.hp;
		maxMP += item.mp;
		att += item.att;
		def += item.def;
	}

}

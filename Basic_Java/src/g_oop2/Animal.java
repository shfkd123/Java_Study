package g_oop2;

//동물을 표현하기 위한 추상클래스 Animal
public abstract class Animal {

	//동물이 하는 행동을 메소드로 만들 것임
	
	//1.동물이 달려가는 메소드 
	//2.소리를 내는 메소드 
	
	//날지 못하는 이상 어떤 동물이는 걸을 수 있음. 
	void run(){
		System.out.println("달려간다~~~");
	}
	
	//동물들이 내는 소리는 서로다르기 때문에 추상메소드로 생성
	abstract void sound();
	//상속받는 클래스에게 sound 메소드를 반드시 만들게 하기 위해 (강제) abstract 사용
	
	
}
//Dog가 추상클래스인 Animal에게 상속을 받고 있기 때문에
//추상 메소드도 상속을 받은 상태
//Dog를 추상클래스로 만들던지, 추상메소드의 내용을 만들어주든지 
class Dog extends Animal {
                        
	// (ctrl + 1 add ~~ 자동 메소드 생성 )

	@Override
	void sound() {

	}

}

class Cat extends Animal {

	@Override
	void sound() {

	}

}

class Tiger extends Animal {

	@Override
	void sound() {

	}

}

     
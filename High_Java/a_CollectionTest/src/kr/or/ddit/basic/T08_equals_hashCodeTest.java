package kr.or.ddit.basic;

import java.util.HashSet;
import java.util.Set;

public class T08_equals_hashCodeTest {
	/**
	 * 해시함수(Hash function)은 임의의 데이터를 고정된 길이의 데이터로 매핑하는 함수이다.
	 * 해시 함수에 의해 얻어지는 값은 해시 값, 해시코드, 해시 체크섬 또는 간단하게 해시라고 한다.
	 * (암호화적 해시함수 및 비암호화적 해시함수)
	 * 
	 * HashSet, HashMap, Hashtable과 같은 객체들을 사용할 경우...
	 * 객체가 서로  같은지를 비교하기 위해 equals()메서드와 hashCode()메서드를 호출한다.
	 * 그래서 객체가 서로 같은지 여부를 결정하려면 두 메서드를 재정의 해야 한다.
	 * 
	 * 
	 * Object -> HashSet, HashMap, Hashtable에서는 객체가 같은지 여부는 데이터를 추가할 때 검사한다.
	 * 
	 * -equals()메서드는 두 객체의 내용(값)이 같은지 비교하는 메서드이고, 
	 * -hashCode()메서드는 두 객체가 같은 객체인지 비교하는 메서드 이다. 
	 * 
	 * -equals()메서드와 hashCode()메서드에 관련된 규칙
	 * 1. 두 객체가 같으면 반드시 같은 hashCode를 가져야 한다.
	 * 
	 * 2. 두 객체가 같으면  equals() 메서드를 호출했을 때 true를 반환해야 한다.
	 * 	즉, 객체 a, b가 같다면  a.equals(b)와 b.equals(a) 둘다 true이어야 한다.
	 * 
	 * 
	 * 3. 두 객체의 hashcode가 같다고 해서 두 객체가 반드시 같은 객체는 아니다. 
	 * 	  하지만, 두 객체가 같으면 반드시 hashcode가 같아야 한다.
	 * =>>>>hashcode(int값)을 호출하면 정수값으로 리턴
	 * 		ex)a.hashcode=> 3 b.hashcode => 99  확률은 적지만 다른 객체인데도 같은 hashcode(int 값)이 나올 수 있음. 
	 * 		해시코드만 보고 두 객체가 같다고 판단할 수 없다 따라서 equals를 사용해야 한다.
	 *		
	 *		처음부터 equals를 사용하지 왜 해시코드를 사용하는가 ? 
	 *		=> 해시 함수의 특징은 속도가 엄청빠르다. -> 두 객체가 다른 것은 확실히 알 수 있다. 
	 *		두 객체가 같은지 안같은지 헷갈릴 때는 equals를 사용한다.
	 *		=> 같을 때는 Hashcode가 우연히 같게 나온 것이고
	 *		=> 다를 때는 확실히 다른 객체라고 판단한다.  
	 * 
	 * 
	 * 4. equals() 메서드를 override하면 반드시 hashCode()메서드도 override해야 한다. 
	 * 
	 * 5. hashCode()는 기본적으로 Heap에 있는 각 객체에 대한 메모리 주소 매핑 정보를 기반으로 한 정수값을 반환한다. 
	 * 	그러므로 , 클래스에서 hashCode()메서드를 override하지 않으면 절대로 두 객체가 같은 것으로 간주 될 수 없다.
	 * 
	 * -hashCode()메서드에서 사용하는 '해싱알고리즘'에서 서로 다른 객체에 대하여 같은 
	 * 	hashcode값을 만들어 낼 수 있다. 그래서 객체가 같지 않더라도 hashcode가 같을 수 있다.
	 */
	public static void main(String[] args) {
		//Person객체 생성
		Person p1 = new Person(1, "홍길동");
		Person p2 = new Person(1, "홍길동");
		Person p3 = new Person(1, "이순신");
		
		//비교
		System.out.println("p1.equals(p2) : " + p1.equals(p2)); 
		//객체는 서로 다른 곳(주소)에 만들어있지만 데이터가 같기 때문에 true가 나온다. 
		System.out.println("p1 == p2 : " + (p1 == p2));
		//두 객체가 진짜 같은지 비교!!  단지 id와 이름만 같을 뿐이지 p1과 p2는 서로 다른 놈이다. 

		Set<Person> set = new HashSet<Person>();
		 
		set.add(p1);
		set.add(p2);
		
		System.out.println("p1, p2 등록 후 데이터");
		for(Person p : set) {
			System.out.println(p.getId() + " : " + p.getName());
		}
		
		System.out.println("add(p3) 성공여부 : " + set.add(p3));
		
		System.out.println("add(p3) 후 데이터");
		for(Person p : set) {
			System.out.println(p.getId() + " : " + p.getName());
		}
		
		System.out.println("remove(p2) 성공여부 : " + set.remove(p2));
		
		System.out.println("remove(p2) 후 데이터");
		for(Person p : set) {
			System.out.println(p.getId() + " : " + p.getName());
		}
		
	}

}

class Person {
	private int id;
	private String name;
	
	//생성자
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Object에서는 숫자가 다르면 false, 같으면 true가 나오게 설계를 해놓음.
	//우리는 Override를 통해 hashCode랑 equals를 재정의 할 것임.
	
	@Override  
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
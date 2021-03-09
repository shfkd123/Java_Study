package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		//List, Map, Set
		
		//Collections중의 하나 HashMap
		
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * - Array에서는 add로 인덱스를 저장하지만  HashMap은 put으로 지정된 키와 값을 저장
		 * - key는 주로 String타입을 사용하고 value는 내가 저장하고 싶은 타입으로 저장하면 된다. 
		 *   
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * - 지우고 싶은 키를 넘겨주면, 키에 저장된 값을 제거해준다.
		 * - 키와 값 모두 제거 됨.
		 * 
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반화난다.
		 * - ArrayList와 마찬가지로 get을 사용
		 * - 키로 저장을 했으니, 키를 가져오고 키를 넘겨주면 저장 된 값을 얻을 수 없다. 
		 * - 키 안에값이 없으면 null을 반환한다.
		 * 
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 * - 키로 저장을 한다. 내가 만든 Hash는 어떤 키로 저장되어 있는 지 알기쉽지만 내가 만들지 않았다면 알기 어렵다.
		 * - 저장된 키들을 알기 위해 keySet()을 사용한다.
		 */
		
		//HashMap 제네릭 안에 Object로 지정해서 아무 타입이나 올 수 있다. 
		HashMap<String, Object> map = new HashMap<>();
		map.put("number", 10); //a라는 키를 가지고, 10이라는 int 값을 저장
		map.put("name", "홍길동"); //b라는 키를 가지고, 홍길동이라는 String 값을 저장
		map.put("scanner", new Scanner(System.in));
		
		Object object = (Scanner)map.get("scanner");
		//object.nextLine();
		
		
		//HashMap 키를 보면 어떤 값인지 대충 알수 있다.
		//map.put("number", 10);
		//map.put("name", "홍길동");
		//map.put("scanner", new Scanner(System.in));
		//키에 저장된 값을 유추할 수 있도록 키의 이름을 저장해주면 알아보기 쉽다. 
		//ArrayList에서는 Object를 제네릭으로 주로 안쓰지만 HashMap에서는 Object를 주로 (?)사용한다.
		
		System.out.println(map);
		
		map.put("name", "이순신");//같은 키로 저장하면 덮어씌어 진다. => 값 바뀜
		//한개의 키에는 한 개의 값만 저장된다. 
		System.out.println(map);
		//HashMap은 순서를정할 기준이 없다. List에서는 0~ 인덱스 순서대로 출력
		
		/*map.remove("number");
		System.out.println(map);
		*/
		//값 출력
		Object value = map.get("name");
		System.out.println(value);
		
		//subStrig 사용하여 자르기
		System.out.println(((String)value).substring(0,1));
		
		//keySet사용
		Set<String> keys = map.keySet(); //저장된 모든 키
		//for(변수 : collection(list/map/set)/배열)
		for(String key : keys){
			//저장되어 있는 키와 값을 출력
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("====================");
		for(String key: map.keySet()){
			
			System.out.println(key + " : " + map.get(key));
		}

		//컬럼은 Hashmap의 키로 저장하고 컬럼의 값을  Hashmap의 value로 저장이된다. (테이블 한줄)
		//여러개의 테이블을 저장하려면 ArrayList를 사용한다.
		//데이터베이스의 테이블 구조를 자바에서는 ArrayList와 Hashmap을 사용한다.
		//ex)
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		
		//자바에서 HashMap으로 데이터베이스의 테이블 구조를 저장, 데이터베이스의 테이블 한줄 저장 예시
		HashMap<String, Object> row = new HashMap<>();
		row.put("CART_MEMBER", "a001");
		row.put("CART_NO", "200504010001");
		row.put("CART_PROD", "p101000001");
		row.put("CART_QTY", 5);
		
		//HashMap으로 만든 한줄을 리스트 table에 저장
		table.add(row);
		
		//래퍼클래스
		/*
		 * 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * char : Character
		 * boolean : Boolean
		 * 
		 * Collection들은 클래스(객체)만 저장할 수 있음. 
		 */
		
		//ex) 회원테이블이 하나 있고, 이것을 자바에서 표현하려고 한다.
		//회원 테이블에는 컬럼이 아이디, 비밀번호, 이름, 전화번호가 있다고 가정. 
		ArrayList<HashMap<String, Object>> users = new ArrayList<>();
		HashMap<String, Object> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		
		users.add(user);// 한줄, 테이블이 리스트에 담김
		//또 한명을 추가하고 싶으면 새로운 HashMap을 만들어서 users리스트에 넣어주면 된다. 
		
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("id", "shfkd");
		user1.put("password", "shfkd123");
		user1.put("name", "사용자1");
		user1.put("tel", "010-3813-5678");
		
		users.add(user1);
		
		
	/*	System.out.println("=====================================");
		Set<String> keys1 = user.keySet(); 
		for(String key : keys1){
			System.out.println(key + " : " + user.get(key));
		}
		System.out.println("=====================================");
		Set<String> keys2 = user.keySet(); 
		for(String key : keys2){
			System.out.println(key + " : " + user1.get(key));
		}*/
		
		for(int i =0; i<users.size(); i++){
			//users ArrayList 사이즈 만큼 
			HashMap<String, Object> u = users.get(i);
			//HashMap을 만드는데 users의 리스트의 값을 가져와서 u에 넣어준다.
			for(String key: u.keySet()){
				//key라는 변수에 u에 넣어져 있는 key값을 넣어준다.
				System.out.println(key + ":" + u.get(key));
			
			}
		}
		
		//위와 동일 출력
		for(HashMap<String, Object> u : users){
			for(String key: u.keySet()){
				System.out.println(key + ":" + u.get(key));				
			}
		}
		
		/*Set<String> keys1 = user.keySet(); //user에 저장되어 있는 키가 keys1에 넘어감
		//user1과 user의 hashmap에서 키 값은 동일
		for(String key : keys1){
			//key라는 변수에 keys hashmap
			//for(String key : keys1)
			System.out.println(key + " : " + user1.get(key));
			System.out.println(key + " : " + user.get(key));
	*/
		
		/* <향상된 for문의 단점>
		 * for(변수 : collection) 형태
		 * 인덱스를 알수 없다.
		 * 인덱스를 알 수 없어 접근도 불가능 -> 값을 변경할 수 없다.
		 * 주로 값을 읽어오고, 출력할 때만 사용한다. 
		 */
		}
	
}

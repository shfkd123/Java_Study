package j_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
	
		//List, Map, Set
		
		/* List, Map, Set은 인터페이스 
		 * List : 인덱스로 저장 (종류가 다양)
		 * Map : 값을 저장하는데 인덱스로 저장하는 것이 아닌 키로 저장
		 * Set : 중복된 값을 저장할 수 없다. 잘 사용하지는 않음. 
		 */
		
		
		/*
		 * <ArrayList에 값을 저장할 수 있는 메소드들> 
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * 인덱스를 지정하는 것이 아닌 마지막에 인덱스를 추가 
		 * 
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * 저장하고 싶은 인덱스를 지정하여 사용할 수 있다. 이미 저장되어 있는 객체들 사이에만 저장가능.
		 * 그러면 덮어씌어지는 것이 아닌 뒤에 인덱스들은 한칸씩 밀려남. 
		 * 
		 * Object set(int index, Object obj): 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * set은 수정하는 메서드 , 기존에 가지고 있던 값에 덮어씌워서 값을 바꿈.
		 * 기존의 인덱스의 값은 사라지고, 새로운 값으로 덮어씌어줌.
		 * 
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * 위치에 있는값을 반환
		 * 
		 * int size() : 저장된 객체의 수를 반환한다.
		 * ArrayList에 저장된 수 처음사이즈는 0,~ 유동적으로 사이즈가 바뀔 수 있음.
		 * 
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다. 
		 * 위치에 저장되어 있는 값을 제거할 수 있음. 저장이 됐는지 안됐는지의 여부는 boolean타입으로 나타난다.
		 * 그 지정된 위치에 값이 없을 때에는 제거가 안된다. -> false
		 */
		
		
		//(1) List - ArrayList
		ArrayList sample = new ArrayList(); // 객체 생성
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		//컬렉션에 타입을 지정해 주는 것을 제네릭이라고 한다.
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		//따라서 제네릭의 사용이 권장된다.
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		//list.add("abc"); //제네릭을 사용하면 다른 타입은 사용할 수 없다. 
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list); //값이 출력
		
		list.add(1,40);//1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list);
		
		//list.add(7, 50); //7번 인덱스는 현재 없음.
		
		
		//list.set(2,50); //2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		Integer before = list.set(2,50); //2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2); //Integer 타입으로 지정했기에, int타입으로 반환
		System.out.println(integer);
		
		//size는 주로 for문 돌릴 때 사용
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			list.remove(i); //i번째에 있는 인덱스를 제거하겠다.
			//다 제거가 될줄알았는데 다 제거가 안돼서 나온다.
		}
		System.out.println(list);*/
		
		//안지워진 이유 : 0번인덱스부터 for문이 시작하는데 사이즈가 줄어들고, 0번인덱스를 지우면 1번 인덱스는 0번으로 땡겨진다.
		//2번도 -> 1번 , 3번도 -> 2번
		//따라서 2개만 지워짐..
		//만약 지우고 싶을 때에는 for문을 뒤에서 부터 돌려서 지워야 다 지울 수 있다.
		
		for(int i = list.size() - 1; 0<=i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		//list에 1부터 100까지 랜덤값을 10개 저장해주세요. 
		for(int i =1; i<10; i++){
			int random = (int)(Math.random() *100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값을 합계와 평균을 구해주세요.
		int sum =0;
		double avg =0;
		for(int i=0; i<list.size(); i++){
			sum += list.get(i);			 			
		}
		avg = (double)sum / list.size();
		System.out.println("합" +sum);
		System.out.println("평균" +avg);
		
		//list에서 최소값과 최대값을 구해주세요. s
		//선생님 풀이
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
			if (max < list.get(i)) {
				max = list.get(i);
			}	
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		//list를 오름차순으로 정렬
		for (int i = 0; i < list.size() - 1; i++) {
			int m = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(m)) {
					m = j;					
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(m)); //i번째에 덮어씌움
			list.set(m, temp);
		}
		System.out.println(list);
		
		
		//2차원 arraylist안에 arraylist => 제네릭으로 arraylist 지정
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//1차원에 값 저장
		//2차원에 저장
		list2.add(list);
		
		
		list = new ArrayList<>();
		list2.add(list); //2차원에 먼저 저장
		list.add(40);
		list.add(50);
		
		
		list2.get(0).add(70);
		System.out.println(list2);
		
				
		//저장된 값을 꺼낼 때
		//(1)속도가 더 빠름
		
		//(1)
		
		System.out.println("여기");
		for(int i =0; i<list2.size(); i++){
			ArrayList<Integer> li = list2.get(i); //i번째 하나 꺼냄
			for(int j = 0; j<li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		//안쪽에서 값을 한번에 꺼내고 싶을 때
		//(2)
		for(int i =0; i<list2.size(); i++){
			for(int j =0; j<list2.get(i).size(); j++){
				System.out.print(list2.get(i).get(j)+ " ");
			}
		}
		
		//2차원 list의 인덱스를 바꾸고 싶을 때
		ArrayList<Integer> tempList = list2.get(0);
		list2.set(0,list2.get(1));
		list2.set(1,tempList);
		
		//list 정렬 메소드 (내부적으로 퀵정렬로 되어있음)
		Collections.sort(list);
	
	}
}

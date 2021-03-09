package i_api;

import java.util.Arrays;

public class StringClass {


	public static void main(String[] args) {
		/*
		 * String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다. 파라미터로 인덱스를 넘겨주고 문자열 내에서 받은 인덱스의 위치를 찾아 반환
		 * - subString() : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf() : 문자열내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다.
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 */
		
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2)); //str1에는 객체(문자열)이 들어있다.
		//System.out.println(str2.equals(str1)); //str2에는 null 즉 아무것도 안들어있어서 equals를 호출할 수 없다.
		//null이 있을 수 있는  변수를 앞에두지 않는다.
		
		String str = "12345";
		int length = str.length(); //문자열의 길이를 반환
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);
			System.out.print(charAt);
		}
		
		//문자열 뒤집기
		String rev = "";
		for(int i= str.length()-1; 0<=i; i--){
			rev += str.charAt(i);
	
		}
		System.out.println(rev);
		
	
		str = "0123456789";
		String sub1 = str.substring(3);// 3번 인덱스부터
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); // 5번 인덱스부터 8번 인덱스까지 잘라서 반환한다.
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index);
		
		//substring과 indexOf를 조합해서 문자열 자르기
		
		//배열 생성 , 이름과 가격이 적혀있는 문자열
 		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원" //나는 이름만 가져오고 싶음. 
		};
 		for(int i = 0; i< menu.length; i++){
 			String name = menu[i].substring(0,menu[i].indexOf(" "));//이름은 0번 인덱스에서 시작하는 것은 분명히 알 수 있음. 
 			//하지만 과일마다 끝나는 인덱스가 다름 => indexOf
 			System.out.println(name);
 			
 			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")));
 	 		//공백의 인덱스를 찾고 +1, 숫자는 맨뒤에 "원"이라는 문자로 끝난다.. 
 	 		System.out.println(price);
 		}
 		
 		str = "abcd";
 		boolean contains = str.contains("c");//문자열이 포함하고 있으면 true, 없으면 false
 		System.out.println(contains);
 		
 		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
 		for(int i =0; i<menu.length; i++){
 			if(menu[i].contains("귤")){
 				System.out.println("귤은" + i + "번 인덱스에 있습니다.");
 			}
 		}
 		
 		
 		str = "a/b/c";
 		//쪼개진 문자열을 배열로 만들어서반환
 		String[] split = str.split("/");
 		String[] split2 = str.split("/",2);
 		System.out.println(Arrays.toString(split));
 		System.out.println(Arrays.toString(split2));
	
	
 		//메뉴명과 가격 나누기
 		for(int i=0; i<menu.length; i++){ //배열에 접근
 			split = menu[i].split(" "); //메뉴와 가격 사이에는 공백이 존재, 공백으로 나눠준다.
 			System.out.println("메뉴명: " + split[0] + " / 가격: " +split[1]);
 			//0번인덱스 부터 순서데로 저장해서 반환해준다.
 		}
 		
 		str = " 문자열 ";
 		String trim = str.trim(); //trim은 문자열 사이에 존재하는 공백이 존재하면 제거해준다(앞뒤에 있는 공백만 제거, 중간 공백은 나둔다.)
 		System.out.println("[" + str + "] -> [" + trim + "]");
 		//주로 사용자의 입력실수를 방지하기 위해 trim을 사용한다. (아이디나 비밀번호 앞뒤에 공백이 들어가는 것을 방지)
 		String id = " myId ";
 		String password = "myPassword ";
 		//앞뒤에 있는 공백은 찾기 쉽지만 뒤에만 공백이 있을 경우 사용자는 찾기 힘들다.
 		System.out.println(id);
 		System.out.println(password);
 		System.out.println(id.trim());
 		System.out.println(password.trim());
 		
 		int number = 10;
 		str = number + "";
 		str = String.valueOf(number); //valueOf는 파라미터로 넘어오는 값을 String타입으로 바꿔준다. 
	}


}


package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba(); //알바 하나 고용
		
		String[] order = alba.order(); //알바야 주문 받아라!
		System.out.println(Arrays.toString(order));
		//String 타입의 order배열은 손님이 주문한 음식
		
		System.out.println("요리 만드는 중.... 완성!!!!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"}; //음식 완성!
		
		//알바야 서빙!
		alba.serve(foods); //음식을 넘겨줌(파라미터 값으로)
		
		alba.pay(order); //계산 시에는 주문서가 필요하기에 파라미터 값으로 넘겨줌. 
		
		

	}

}

package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		/*
		int money = (int)(Math.random()*500)*10; //1~5000
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("거스름돈: " + money);*/
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출려개주세요. 
		 * 
		  거스름돈 : 2860원
		 500원 : 5개
		 100원 : 3개
		 50원 : 1개
		 10원 : 1개 
		 */

/*		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		
		for(int i=0; i<coin.length; i++){
			c1 = money / 500;
			c2 = (money - (c1 * 500)) /100;
			c3 = (money - (c1 * 500) - (c2 * 100)) / 50;
			c4 = (money - (c1 * 500) - (c2 * 100) - (c3 * 10)) / 10;
					}
		System.out.println("500원: " + c1);
		System.out.println("100원: " + c2);
		System.out.println("50원: " + c3);
		System.out.println("10원: " + c4);*/
		
		//선생님 해석
		/*
		int count = money / coin[0];
		money =money % coin[0];
		System.out.println(coin[0] + "원:" + count + "개");
		count = money / coin[1];
		money =money % coin[1];
		System.out.println(coin[1] + "원:" + count + "개");
		count = money / coin[2];
		money =money % coin[2];
		System.out.println(coin[2] + "원:" + count + "개");
		count = money / coin[3];
		money =money % coin[3];
		System.out.println(coin[3] + "원:" + count + "개");
		*/
		
		//선생님 풀이 (정답)
		/*for(int i=0; i<coin.length;i++){
			int count = money / coin[i];
			money = money % coin[i];
			System.out.println(coin[i] + "원:" + count + "개");
		}*/
		
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요. 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : ***** 5
		 * 5 : * 1
		 * */
				
		/*int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;		
			for (int j = 1; j <= 5; j++) {
				if (arr[i] == j) {
					System.out.print(j + ": * ");
				}				
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));*/
		
		/*//선생님 풀이
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(i + 1 + " : ");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + count[i]);
		}*/
		
		//1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		//[5,5,3,5,2,2,2,5,5,5]
		//[5,3,2]
		//힌트: 배열을 하나 새로 만들고, 중복되지 않는 값만 넣을 거임
		// 숫자 하나하나 중복이 안되는지 확인해야 함.
		//나중에 중복이 안된 값의 개수만큼 배열을 생성해서 넣어줌.
		
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		int count = 0;		
		//[5,5,3,5,2,2,2,5,5,5]
		// temp배열에 하나씩 넣을 것임. 		
		int[] temp = new int[5]; //새로운 배열생성{0, 0, 0, 0, 0}, 여기에 중복되지 않는 값을 넣을 거임.
		for(int i = 0; i<arr.length; i++){
			boolean flag = false;
			for(int j =0; j <temp.length; j++){ //하나라도 같은 값이 있는지 확인 
				if(arr[i] == temp[j]){
					flag = true; //여기에 한번이라도 들어오면 중복이 됐다는 것. 
				}
			}
			if(!flag){
				temp[count++] = arr[i]; //중복이 없었다는 것, 어디 인덱스에 넣어줘야할지 모르기 때문에 count라는 변수를 만들어서 인덱스로 활용
			}
		}
		System.out.println(Arrays.toString(temp));
		
		int[] result = new int[count];
		for(int i = 0; i< result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
    
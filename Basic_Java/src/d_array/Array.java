package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 같은 데이터타입에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다. 주소를 참조 
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다. 
		 * */
		
		/*int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. int형 5개(배열의 길이,크기)의 공간을 만들겠다!
		//배열 초기화시 기본값이 저장된다. 
		
		 * 기본값 : 내가 저장하지 않았을 때 저장되는 값
		 * byte, short, int, long : 0
		 * float, double : 0.0
		 * char : ''(0)
		 * boolean : false
		 * 참조형 : null (값이 없다.)
		 * 
		
		
		 * 변수 = 주소
		 * 주소 {0, 0, 0, 0, 0}
		 * 
		array = new int[]{1,2,3,4,5};//길이를 지정하지 않고 중괄호 안에 실제 저장할 값을 넣어 줌.
		
		//array = {1,2,3,4,5}; //선언과 초기화를 동시에 해야한다. 
		
		int[] array2 = {1,2,3,4,5};
		System.out.println(array[0]);//[]안의 숫자가 인덱스
		System.out.println(array[1]); //인덱스는 0부터 시작
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//반복문을 사용 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);//[]안의 숫자가 인덱스
		System.out.println(array[1]); //인덱스는 0부터 시작
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
				
		for (int j =0; j < array.length; j++){
			array[j] = (j+1) * 10;
			System.out.println(array[j]);
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요. 
		int[] array1 = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		int sum=0;
		double avg=0;
		for(int i=0; i < array1.length; i++){
			array1[i] = (int)(Math.random() * 100) + 1;
			sum += array1[i];
			avg = (double)sum / 10;
			//avg = (double)sum / array1.length;
			//반올림
			//avg = Math.round((double)sum / array1.length * 10) / 10.0;
			
		}
		System.out.println(Arrays.toString(array1));
		//Arrays.toString은 배열에 들어있는 값을 문자열로 표시 
		
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요. 
		System.out.println(sum);
		System.out.println(avg);
		*/
	/*int[] array1=new int[10];
		//배열에 저장된 값들 중 최소갓과 최대값을 출력해주세요. 
		int max = array1[0];
		int min = array1[0];
		int temp=0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100) + 1;
			
			if (max < array1[i]) {
				 temp=max;
				 max=array1[i];
				 array1[i]=temp;
				
			}
			if (min > array1[i]) {
				temp=min;
				min = array1[i];
				array1[i]=temp;
			}
		}
		System.out.println("여기");
		System.out.println(Arrays.toString(array1));
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);*/
		
		//선생님 풀이
		int[] randoms = new int[10];
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int) (Math.random() * 100) + 1;
		}
	
		int max2 = randoms[0];
		int min2 = randoms[0];
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int) (Math.random() * 100) + 1;
			if (randoms[i] < min2) {
				min2 = randoms[i];
			}
			if (max2 < randoms[i]) {
				max2 = randoms[i];
			}
		}
		System.out.println(Arrays.toString(randoms));
		System.out.println("min: " + min2 + " max: " + max2);
		
		
		//10개를 저장할 수 있는 배열을 만들어서 배열에 1~10까지 넣음.
		int[] shuffle = new int[10];
		int r=shuffle[0];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
			shuffle[0] = (int)(Math.random() * 10) + 1;	
			shuffle[r] = shuffle[0];
			shuffle[0] = shuffle[r];
			
		}

		System.out.println(Arrays.toString(shuffle));
		
		//0~9사이의 랜덤한 숫자를 인덱스로 사용.
		//인덱스가 서로 바뀜
		//배열의 값을 섞어주세요.
		//랜덤 인덱스와 0번 인덱스의 자리를 바꿔주세요.(여러번 반복)
		
		
	/*	//선생님 풀이
		for (int i = 0; i < shuffle.length * 10; i++) {
			int random = (int) (Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println("여기");
		System.out.println(Arrays.toString(shuffle));
		*/
		//1~10사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수룰 출력해주세요.
		/*int[] shuffle2 = new int[500];
		int sum2 = 0;
		for (int i = 0; i < shuffle2.length; i++) {
			int rn = (int) (Math.random() * 10) + 1;	
			shuffle2[i] = rn;
			if (shuffle2[rn] == shuffle2[rn]) {
				sum2 += 1;
			}

		}
		System.out.println("숫자가 생성된 횟수: "+sum2);*/
		
		//2번째 생각
		/*int[] shuffle2 = new int[10];
		int sum2 = 0;
		for (int i = 0; i < shuffle2.length; i++) {
			for (int j = 0; j < 500; j++) {
				int rn = (int) (Math.random() * 10) + 1;
				if (shuffle2[0] == rn) {
					sum2 += 1;
				}
			}
			System.out.println(shuffle2[i]+"숫자가 생성된 횟수: " + sum2);
		}		*/
		
		int[] counts = new int[10];
		
		for(int i =0;i<500; i++){
			int random = (int)(Math.random() *10) +1;
			//1->counts[0]
			//2->counts[1]
			//3->counts[2]
			
			counts[random-1]++;
		}
		
		System.out.println(Arrays.toString(counts));
	}
}

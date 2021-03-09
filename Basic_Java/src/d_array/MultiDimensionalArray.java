package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다. 
		 * */

		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		/*
		 * 변수 = 주소1이 들어감.
		 * 
		 * 주소1 : {값, 값}
		 * 
		 * 2차원 배열
		 * 주소1 : {주소2, 주소2}
		 * 
		 * 주소2 : {값1, 값2}
		 * 주소3 : {값3, 값4}
		 */
		
		int[][] arr = new int[2][3]; //2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다. 
		//1차원의 배열의 길이는 2,2차원의 배열의 길이는 3
		//총 6개의 값을 저장할 수 있음. 
		//현재 초기값은 0 
		int arr2[][] = new int[][]{{1,2,3},{4,5,6}};//값의 개수로 배열의 길이가 정해진다. 
		int[] arr3[] = { {1,2,3}
						,{4,5,6}
						,{7,8,9} };//선언과 초기화를 동시에 해야한다. 
		
		int[][] arr4 = new int[3][]; //가변 배열, 2차원 배열은 아직 만들어지지 않은 상태 2차원 배열의 크기를 직접 만들 수 있다. 
		arr4[0] = new int[3];
		arr4[1] = new int[5];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]); //배열에 접근
		
		//오류 - arr[0] = 10; //값을 저장
		//이유: 1차원에는 배열을 저장해야 함
		arr[0] = new int[5]; //이렇게 배열을 저장
		
		arr[0][0] = 10;//2차원에 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		//2차원 배열에서 1차원은 배열이고, 2차원에 값이 들어있다. 라는 것을 명심!
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //1차원 배열에 접근 후 length => 2차원 배열의 길이
		System.out.println(arr[1].length);
		
		//2차원 배열의 인덱스마다 길이가 다를  수 있다. 
		//arr[0] = 3
		//arr[0] = 5
		
		for(int i=0; i<arr.length; i++){ //1차원 배열에 접근
			for(int j = 0; j < arr[i].length; j++){ //2차원 배열에 접근
				System.out.println(arr[i][j]); //2차원 배열의 모든 값을 출력
				arr[i][j] = i * j; //2차원 인덱스까지 접근을해서 값을 저장함.
			}
		}
		
		int[][] scores = new int[3][5]; // int[학생수][과목수]
		//학생들의 점수를 저장하기 위한 배열
		//학생수는 3명, 과목은 5과목
		int[] sum = new int[scores.length];//합계
		double[] avg = new double[scores.length]; //평균
		//합계와 평균도 3개씩 나와야 하니까 (15개의 점수) 배열에 저장.
		
		for(int i=0; i<scores.length; i++){
			for(int j=0; j< scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		/*
		 * 출력결과
		 * 학생 1 :[61, 99, 48, 91, 22]
		      학생 2 :[77, 73, 64, 58, 41]
   		      학생 3 :[96, 87, 75, 28, 97]
		 * */
		
	/*	//합계와 평균을 구해주세요.(평균은 소수점 1자리까지 표현해주세요.)
		for (int i = 0; i < scores.length; i++) { // 1차원 배열에 접근
			for (int j = 0; j < scores[i].length; j++) { // 2차원 배열에 접근
				sum[i] += scores[i][j];	
			}
			avg[i] = sum[i] / 3; 
			System.out.println(i+1 +"학생의 합계: " + sum[i] + "평균: " + avg[i] );

		}*/
		
		//선생님 풀이
		for (int i = 0; i < scores.length; i++) { // 1차원 배열에 접근
			for (int j = 0; j < scores[i].length; j++) { // 2차원 배열에 접근
				sum[i] += scores[i][j];	
			}
			avg[i] = Math.round((double)sum[i] /scores[i].length * 10) /10.0;
			System.out.println("합계: " +sum[i] + " / 평균: " +avg[i]);
		}
	}

}

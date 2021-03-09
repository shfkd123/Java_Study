package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * -석차 구하기 : 정수를 비교해 적은 점수의 등수를 증가시키는 방식
		 * -선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * -버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * -삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 * */
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.print("점수 :");
		System.out.println(Arrays.toString(arr));

				
		//석차구하기
	/*	int[] rank = new int[arr.length];
		
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		} //등수에 모두 다 1로 넣어 놓음. 우선 비교하기 전의 등수는 1등임.
		
		//중첩된 for문이 있어야 모든 사람들이 모든 사람들과 등수 비교를 할 수 있음.
		for(int i =0; i< arr.length; i++){
			for(int j =0; j < arr.length; j++){
				//i(나)번째와 j(다른 사람)번째를 비교
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}
		}
		System.out.print("등수 :");
		System.out.println(Arrays.toString(rank));*/
		
		/*
	    i,j 선택정렬 인덱스 변화
		0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
		1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9 
		2,3 2,4 2,5 2,6 2,7 2,8 2,9
		3,4 3,5 3,6 3,7 3,8 3,9 
		4,5 4,6 4,7 4,8 4,9
		5,6 5,7 5,8 5,9
		6,7 6,8 6,9 
		7,8 7,9
		8,9
*/		
		
		
		//선생님 풀이
		for (int i = 0; i < arr.length - 1; i++) {
			//arr.legth에서 1을 빼는 이유는 i는 8까지 돌기 때문
			int min = i; //0번인덱스에 있는 값을 저장하는게 아니라 0번 인덱스 자체를 저장
					//, 근데 0번을 넣는게 아니라 i의 값은 계속 증가하니까 i를 넣는다.
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]){					
						min = j; //최솟값이 min에 저장
					}				
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;          
			}
		}
		System.out.println(Arrays.toString(arr));	

		/*
		 * 버블정렬 j,j+1 변화 (i는 8번 반복) 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 
		 * 0,1 1,2 2,3 3,4 4,5 5,6
		 * 0,1 1,2 2,3 3,4 4,5 
		 * 0,1 1,2 2,3 3,4 
		 * 0,1 1,2 2,3 
		 * 0,1 1,2 
		 * 0,1
		 * */
		
		//버블정렬

		//선생님 풀이 
		for (int i=0; i < arr.length -1; i++){
			boolean flag = false;
			for(int j =0; j < arr.length-i-1; i++){
				//j가 처음에 0부터 8까지 돈다. 그래서 9까지 돌면 안되기 때문에 -1 해준다. 
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
					flag =true;
				}				
			}//안쪽에 있는 for문에서 자리를 한번도 바꾸지 않을때 끝내기 자리를 한번도 바꾸지 않았다는 것은 
			//여기 for문에 들어가지 않았다는 것임
			if (flag == false){    
				//!flag 를 넣어도 됨. 
				break;				
			}
		}

		System.out.println("===============================================");
		System.out.print("버블정렬 :");
		System.out.println(Arrays.toString(arr));
		
		//삽입정렬
		
		/*
		 * i,j
		 * 1,0
		 * 2,1 2,0
		 * 3,2 3,1 3,0
		 * 4,3 4,2 4,1 4,0
		 * 5,4 5,3 5,2 5,1  5,0
		 * 6,5 6,4 6,3 6,2 6,1 6,0
		 * 7,6 7,5 7,4 7,3 7,2 7,1 7,0
		 * 8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
		 * 9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
		 * */
		
		for(int i=1; i<arr.length;i++){
			int temp = arr[i];//삽입정렬이 될 때마다 값이 밀려 바뀜=>i가 없어질 수도 있기 때문에 변수에 저장해놓고 비교
			int j=0;
			for(j=i-1; j>= 0; j--){ 
				if(temp < arr[j]){
					//i와 j를 비교하고j가 더 클때 뒤로 밀림
					arr[j+1] = arr[j];
				}else{
					break; //for문을 빠져 나옴.
				}
			}
			arr[j+1] = temp; //임시 저장
			//j+1은 빈자리 
		}
		System.out.print("삽입정렬 :");
		System.out.println(Arrays.toString(arr));
	}
}

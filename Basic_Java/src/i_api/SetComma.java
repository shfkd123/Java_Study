package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args){
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,) 붙여 출력해주세요.
		Scanner in = new Scanner(System.in);

		/*System.out.println("숫자 입력>>");
		String num = in.nextLine(); // 숫자 입력
		int length = num.length();
		for (int i = 0; i <= length; i++) {
			String sub = num.substring(0,3*i);
			System.out.println("," + sub);
			
		}
		
		String str = "1234567";
		String str2 = ",";
		for(int i =0; i<str.length(); i++){
		}*/
		//선생님 풀이
		
		//charAt() : 특정 인덱스에 위치한 문자를 반환한다. 파라미터로 인덱스를 넘겨주고 문자열 내에서 받은 인덱스의 위치를 찾아 반환
		int count = 0;
		System.out.println("숫자를 입력해주세요>");
		String number = in.nextLine();
		String number2 = "";
		for(int i = number.length() - 1; i>=0; i--){
			number2 = number.charAt(i) + number2;
			count++;
			if(count % 3 == 0 && count != number.length()){
				number2 = "," + number2;
			}
		}
		System.out.println(number2);
		
		
		
		
	}

}

package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
		//String 문자열클래스
		/*
		 * 특징: 문자열을 만들면객체 생성, 그 문자열에 변형을 가하면 새로운 문자열이 만들어진다. 
		 * a라는 문자열에 a라는문자열을 추가해서 aa를 만들면 기존에 만들었던 a에 a가 붙는 것이 아닌
		 * 다른 aa문자열이 만들어진다. 
		 */
		
		/*String str = "a";
		long start = System.currentTimeMillis(); //시간 초 메소드
		for(int i = 0; i< 200000; i++){
			str += "a"; //a뒤에 a가 계속 붙으면서 계속 만들어진다. (얼마나 걸리는지 시간을 잰다)
		}
		long end = System.currentTimeMillis(); //시간 초 메소드
		System.out.printv   ln(end - start + "ms");*/
		
		//컴퓨터의 입장에서는 20초 정도 걸리는것은 매우 느린 것.
		//String 클래스의 속도를 보완해주기 나온것이 StringBuffer
		
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis(); 
		for(int i = 0; i< 200000; i++){
			sb.append("a"); 
		}
		long end = System.currentTimeMillis(); 
		System.out.println(end - start + "ms");
	}

}

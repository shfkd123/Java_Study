package h.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러: 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러: 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리불가)
		 * - 예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try{} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다. 
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch 가 없을 경우 예외는 처리되지 않는다. 
		 */
		
		
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
		at h.exception.ExceptionHandling.main(ExceptionHandling.java:32)*/
		//정수는 0으로 나눌 수 없다고 오류
		try {
			int result = 10 / 0;
			System.out.println(result);
			
		}
		//catch()의 파라미터에는 오류가 발생한 곳을 넣어준다.
		catch(ArithmeticException e){
			//catch안에 아무것도 없어도 예외처리가 된다.
			//try안에 있는 문장의 예외가 발생한 부분이 catch로 넘어가서 
			//예외가 파리미터에 일치하는 것이있는지 찾고 catch안에 있는 내용이 실행된다.
			//catch안에 아무것도 없어도 되는데, 아무것도 없으면 사용자는 어떤 상황인지 모르니까 예외처리를 했다는 메소드를 넣어준다.
			System.out.println("예외처리가 발생되었다.");
			e.printStackTrace();
			//e.printStackTrace()메소드를 호출하면 처음에 발생했던 오류 문구가 출력된다. 
			 
		}
		
		//ArithmeticException의 예외만 있는 것이 아닐 수도 있으니까 
		//다른 오류가 발생할 수 있는 것도 생각해서 catch밑에 또 catch를 붙여서 예외를 처리해줬다.  
		/*catch(NullPointerException e){
			
		}*/
		//동시에 예외처리도 가능하다.
		//NullPointerException과 IndexOutOfBoundsException은 많이 사용한다. 
		catch(NullPointerException | IndexOutOfBoundsException e){
			//NullPointerException은 null을 참조해서 나타나는 오류이다.
			String str = null;
			System.out.println(str.equals(""));
			
			//IndexOutOfBoundsException은 배열을 사용할 때 인덱스를 벗어난 값을 찾을 때 나타나는 오류
			int[] arr = new int[10];
			System.out.println(arr[10]);
		}
		//(어떤 부분을 예외처리할지 모른다면 )Exception은 모든 예외처리가 가능하다. 
		catch(Exception e){
			
		}
		
		
		//별 이상이 없어보이는데  컴파일 에러가 뜬다. Ctrl + 1을 눌러서 Surround with try/catch가 나온다면 
		//무조건 try/catch를 사용한다. 
		try {
			Thread.sleep(1000);
			//Open Declaration java.lang.Thread (java.lang으로 되어있는 클래스는 import를 해주지 않아도 된다.)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * JVM에서의 CallStack (CallStack - 현재 호출된 메소드들을 저장하는 공간)
		 * 스택구조는 먼저들어온 데이터를 나중에 들어온 데이터보다 먼저 나갈 수 (호출) 없다. 
		 * test2()가 제일 최근에 호출된 메소드로볼 수 있다. 
		 * |		 |
		 * |_test2()_|
		 * |_test1()_|
		 * |_main()__|
		 * 
		 */
		
		test1();
		

	}

	private static void test1() {
		test2();
		
	}

	//예외는 메인메소드에서만 발생하는 것이 아니다. 
	private static void test2() {
		//System.out.println(10/0);
		
		//오류 문구 
		/*at h.exception.ExceptionHandling.test2(ExceptionHandling.java:88)
		at h.exception.ExceptionHandling.test1(ExceptionHandling.java:83)
		at h.exception.ExceptionHandling.main(ExceptionHandling.java:77)*/
		
		
		//객체 생성
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	//중요한것은 예외를 찾아서 수정해주는 것이다!!!!!
	/*at java.io.FileInputStream.open(Native Method)
	at java.io.FileInputStream.<init>(FileInputStream.java:146)
	at java.io.FileInputStream.<init>(FileInputStream.java:101)
	//여기까지는 내가 작성해서 나온 에러가 아니다!!!! 이럴땐 위에서부터 내가 만든 코드를 찾자.
	
	//내가쓴 코드 어디에서 에러가 났는지 찾자. 보통은 가장 최근에 실행된 메소드에서 발생될 가능성이 크다. 
	at h.exception.ExceptionHandling.test2(ExceptionHandling.java:111)
	at h.exception.ExceptionHandling.test1(ExceptionHandling.java:96)
	at h.exception.ExceptionHandling.main(ExceptionHandling.java:90)*/
}

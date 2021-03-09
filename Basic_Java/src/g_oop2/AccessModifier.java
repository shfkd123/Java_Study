package g_oop2;

//접근제한자
public class AccessModifier {
	
	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능"; //접근제한자를 붙이지 않으면 default로 자동으로 됨. 
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	//접근제한자는 메소드에도 붙일 수 있다.
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args){
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		//public은 어디든 사용가능해서 사용가능한 모습이 나옴!
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		//Time 객체 생성
		Time t = new Time();
	
		//private으로 선언하여 변수를 직접적으로 사용 불가
	/*	t.hour = 14;
		t.minute = 2;
		t.second = -15; //초가 -15일 수 있을까? -> 데이터 값 이상 => 이상 데이터를 막기위해 접근제한자를 사용
		
*/
		t.setHour(14);
		t.setMinute(2);
		t.setSecond(-15);
		System.out.println(t.getTime());
		
		
		/*
		 * 접근제한자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 사용하는데 불필요한 멤버를 숨기기 위해 
		 * (예를 들어 맥도날에 가서 메뉴를 선택할 때, 메뉴판에 모든 재료가 다 쓰여 있다면 
		 * 사용자에게 혼란을 줄 수 있음. 그런것을 감추기위해 접근제한자를 사용. 
		 * 필요한 부분만 보여줄 수 있음. 
		 */
		
		t.clock();
		//출력해줄때 잠깐 잠깐멈춰주기 위해 만든 메소드였기 때문에 보여주지 않는게 좋음!
		//t.stop(interval); 
	}
}

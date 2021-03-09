package g_oop2.test;

import g_oop2.AccessModifier;

//상속받음
public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//protected는 같은 패키지에서 사용 가능, 상속 받거나
		//지금은 다른 패키지이므로 사용 불가.
		/*System.out.println(am.protectedVar);
		am.protectedMethod();*/
		
		
		//상속받았다고 바로 사용하는것이 아니라!!! 자신의 클래스를 
		//객체 생성 후에 사용가능 
		AccessTest at = new AccessTest();		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		//default 상속받았지만 다른 패키지에 있으면 사용 불가
		/*System.out.println(at.defaultVar);
		at.defaultMethod();*/

	}

}

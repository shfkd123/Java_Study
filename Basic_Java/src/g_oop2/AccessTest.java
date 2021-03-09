package g_oop2;

public class AccessTest {
	public static void main(String[] arg) {
		AccessModifier am = new AccessModifier();
		
		//같은 패키지에 있어서 가능
		System.out.println(am.publicVar);
		am.publicMethod();

		//같은 패키지에 있어서 가능
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		//같은 패키지에 있어서 가능
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//private는 같은 클래스 내에 사용 가능하기 때문에 오류 
		/*System.out.println(am.privateVar);
		am.privateMethod();*/
	}
}

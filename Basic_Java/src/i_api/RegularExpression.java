package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식  : 문자열의 패턴을 검사하는 표현식
		 *  우리가입력한 문자열이 제대로 되었는지 검사 (회원가입할 때 주로 사용)
		 *  
		 *  
		 * ^ 뒷 문자로 시작
		 * $ 앞 문자로 종료
		 * . 임의의 문자(줄바꿈 제외)
		 * * 앞문자가 0개 이상
		 * + 앞 문자가 1개이상
		 * ? 앞문자가 없거나 1개
		 * [] 문자의 집합이나 범위(a-z): a부터 z까지, [^a-z]: a부터 z가 아닌것 (부정의 표시))
		 * {} 앞에있는 문자의 개수({2}:2개, {2,4}: 2개 이상 4개 이하) 
		 * () 그룹화(1개의 문자처럼 인식)
		 * | OR 연산
		 * \s 공백, 탭, 줄바꿈
		 * \S (부정) 공백, 탭, 줄바꿈이 아닌 문자
		 * \w 알파벳이나 숫자
		 * \W (부정) 알파벳이나 숫자가 아닌 문자
		 * \d 숫자
		 * \D (부정) 숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안함
		 * \  정규표현식에서 사용되는 특수문자 표현 
		 */
		
		//검사하고 싶은 문자열을 만든다. 
		String str = "abc123";
		//정규 표현식- 정규표현식은 문자열로 만든다. 
	//(1)	String regex = "[a-z]{3}[0-9]{1,3}"; //소문자 a~z까지가 세글자 온다. 숫자 0~9까지 1부터 3까지 [범위]
	//(2)	String regex = "[a-z0-9]+"; //
		String regex = "\\w*"; //알파벳 또는 숫자가 0개 이상 온다.
		
		//Pattern이라는 클래스안에 compile이라는 메소드
		Pattern p = Pattern.compile(regex); //정규 표현식을 분석
		//p.matcher(str); //패턴이 일치하는지 확인하는 코드
		Matcher m = p.matcher(str);
		System.out.println(m.matches()); //일치하면 true, 일치하지 않으면 false => true
		
		//정규표현식을 만들 때는 내가 원하는 범위 만큼만 만들어서 사용하는 것이 더 좋다. 
		
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요. 
		String id = "abc123";
		String regex1 = "[a-z]{3}[0-9]{1,3}";
		//STring regex1 = "[a-z0-9_-]{5,20}";
		Pattern p1 = Pattern.compile(regex1); 
		Matcher m2 = p1.matcher(id);
		System.out.println(m2.matches()); //일치하면 true, 일치하지 않으면 false => true
		
		String phone = "01012345678";
		String regex2 = "\\d{11}";
		//String regex2 ="^0\\d[1,3]-11d{3,4}-\\d{4}";
		Pattern p2 = Pattern.compile(regex2); 
		Matcher m3 = p2.matcher(phone);
		System.out.println(m3.matches()); 
		
		//[a-z_] :a~z, _까지 포함
		String email = "abc123@naver.com";
		//String regex3 = "(?i)[a-z]{0,9}[0-9]{0,9}\\[@a-z]{0,7}\\[.a-z]{0,4}";
		String regex3 ="[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.[a-z]{2}))";
		Pattern p3 = Pattern.compile(regex3); 
		Matcher m4 = p3.matcher(email);
		System.out.println(m4.matches()); 
		
	}

}

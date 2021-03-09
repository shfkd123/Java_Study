package g_oop2;

public class Time {
	
	//다른 클래스에서 사용 못함-private
	private int hour;
	private int minute;
	private int second;
	
	//우리가 할것은 데이터에 직접적으로 접근하지 못하게 해야 한다. => 간접적으로 사용!
		//->getter, setter사용
	//변수 하나당 get-, set- 가 있음.
	
	//값을 읽어옴. 
	public int getHour() {
		return hour;
	}
	//파라미터로 받아서 값을 저장
	//잘못된 값을 받아도 set에 로직을 만들어서 거를 수 있음. 
	public void setHour(int hour) {
		
		if(hour < 0 || hour > 24){
			System.out.println("hour 잘못된 값");
		}
		else{
			this.hour = hour;
		}
	}
	
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		if(minute < 0 || minute > 60){
			System.out.println("minute 잘못된 값");
		}
		else{
			this.minute = minute;
		}
	}
	
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 60){
			System.out.println("second 잘못된 값");
		}
		else{
			this.second = second;
		}
	}
	
	//시간 출력 메소드 
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	//시간 출력 메소드 
	//시간이 한번 출력되고 1초동안 쉬고, 1초 증가 후 다시 출력 
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
		}
	}
	
	//출력해줄때 잠깐 잠깐멈춰주기 위해 만든 메소드였기 때문에 보여주지 않는게 좋음!
	//일정한 시간만큼 시간을 멈추는 메소드
	private void stop(int interval){
		//예외처리 try-catch (ctrl + 1)
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

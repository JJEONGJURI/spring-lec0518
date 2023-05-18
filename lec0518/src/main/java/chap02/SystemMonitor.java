package chap02;
//1.setPeriodTime(int) 메서드 필요
//2.setSender(SmsSender) 메서드 필요
public class SystemMonitor {
	private int time; //10  //2번
	private SmsSender sender; //5번
	public void setPeriodTime(int time) {  //1번
		this.time = time;  //3번
	}
	public void setSender(SmsSender sender) {  //4번
		this.sender = sender;  //6번
	}
	@Override
	public String toString() {
		return "SystemMonitor [time=" + time + ",sender="+sender+"]";
	}
	
}

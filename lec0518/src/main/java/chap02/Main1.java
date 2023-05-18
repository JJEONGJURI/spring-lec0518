package chap02;


import org.springframework.context.support.GenericXmlApplicationContext;



public class Main1 {
	public static void main(String[] args) {
//1. ApplicationContext(컨테이너:다른 객체들을 가져 와서 가지고 있어서) 객체 생성
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
//2. chap02.SystemMonitor 객체를 컨테이너에서 조회하여 monitor 변수 저장하기
		SystemMonitor monitor = ctx.getBean("monitor",SystemMonitor.class);
		//applicationContext 보면 monitor의 실제객체는 SystemMonitor임
		//이름이 모니터인 객체를 가지고 와라
		System.out.println(monitor);
		
//3.minitor 콘솔 출력하기

//스프링 없이 객체 생성하기
		SystemMonitor m = new SystemMonitor();
		m.setPeriodTime(10);
		SmsSender s = new SmsSender();
		m.setSender(s);
		System.out.println(s);
	}

}

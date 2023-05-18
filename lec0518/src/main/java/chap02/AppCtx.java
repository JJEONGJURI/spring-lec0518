package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바 config를 사용하여 객체 주입
//AppCtx =>Application Context
//자바환경에서 객체만들어서 주입

@Configuration //환경설정파일이구나~~
public class AppCtx {
	@Bean //SystemMonitor 객체를 생성하여 monitor 라는 메서드(이름)로 컨테이너에 저장 
	public SystemMonitor monitor() { //Main2의 객체의 이름이 monitor라서
		SystemMonitor s = new SystemMonitor();
		s.setPeriodTime(10);
		s.setSender(sender());
		return s; //s-> 객체
	}
	@Bean
	public SmsSender sender() {
		return new SmsSender();
	}
}

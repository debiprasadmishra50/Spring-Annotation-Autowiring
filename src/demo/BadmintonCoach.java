package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component //if this is there, then the default bean id is "badmintonCoach"

@Component("theBadmintonCoach") //Spring will automatically register bean for this class
public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BadmintonCoach() {
		System.out.println(">> BadmintonCoach : Inside Default Constructor");
	}
	
//	Constructor Injection
//	@Autowired
//	public BadmintonCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	Setter Injection
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}
//
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> Inside Setter Method setFortuneService()");
//		this.fortuneService = fortuneService;
//	}
	
	@Autowired
	public void doSomething(FortuneService fortuneService) {
		System.out.println(">> BadmintonCoach : Inside regular method : doSomething()");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyFortune() {
		return "In BadmintonCoach : "+fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "In BadmintonCoach : Practice Badminton smash 2 hours a day";
	}

}

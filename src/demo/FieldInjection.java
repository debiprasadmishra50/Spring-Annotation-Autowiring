package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public FieldInjection() {
		System.out.println(">> FieldInjection : Inside Default Constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "In FieldInjection : Practice Badminton smash 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return "In FieldInjection : "+fortuneService.getFortune();
	}

}

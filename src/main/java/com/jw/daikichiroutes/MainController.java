package com.jw.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {
	@RequestMapping("")
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow you will surely die!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congrats, you will travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") String number) {
		
		try {
			int n = Integer.parseInt(number);
			if (n % 2 == 0) {
				return "Congrats, you're gonna live!";
			} else {
				return "Uh oh... I have bad news...";
			}
			
		} catch (Exception e){
			return "You did something wrong...";
		}
	}
}

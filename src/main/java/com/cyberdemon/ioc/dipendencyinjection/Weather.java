package com.cyberdemon.ioc.dipendencyinjection;

import java.util.Random;


public class Weather {
	static private Random r = new Random(System.currentTimeMillis());
	public String description;
	
	public Weather() {
		
		switch (r.nextInt(4)) {
		case 0:
			this.description = "Sunny";
			break;
			
		case 1:
			this.description = "Cloudy";
			break;
		
		case 2:
			this.description = "Raining";
			break;
			
		case 3:
			this.description = "Snowing";
			break;
		}
		
	}
}

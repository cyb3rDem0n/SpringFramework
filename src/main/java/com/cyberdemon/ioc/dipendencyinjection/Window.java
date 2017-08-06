package com.cyberdemon.ioc.dipendencyinjection;

public class Window {
	
	private Weather weather;
	
	public Window() {
		this.weather = new Weather();
	}
	
	public void lookout() {
		System.out.println(this.weather.description);
	}
}

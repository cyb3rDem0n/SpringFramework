package com.cyberdemon.ioc.dipendencyinjection;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private List <Window> windows = new ArrayList<Window>(4);
	
public House() {
	windows.add(new Window());
	windows.add(new Window());
	windows.add(new Window());
	windows.add(new Window());
}

public void lookThroughWindows() {
	for( Window w : windows) {
		w.lookout();
	}
}

}

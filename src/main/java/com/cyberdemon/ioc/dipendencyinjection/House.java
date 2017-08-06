package com.cyberdemon.ioc.dipendencyinjection;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private List <Window> windows = new ArrayList<Window>(4);
	
	// 3 - 
	// usando il metodo A, mi serve
	// un oggetto weather nel param del costruttore
	
	
public House(Weather weather) {
	windows.add(new Window(weather));
	windows.add(new Window(weather));
	windows.add(new Window(weather));
	windows.add(new Window(weather));
}
	
	// ora torno in App per aggiungere
	// l istanza di weather creata al
   //al passo 1         - 4 

public void lookThroughWindows() {
	for( Window w : windows) {
		w.lookout();
	}
}

}

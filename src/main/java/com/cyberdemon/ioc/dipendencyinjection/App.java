package com.cyberdemon.ioc.dipendencyinjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	// 1 mi creo questo e vado in Window
    	// - 2 vai in Window
    	Weather weather = new Weather();

    	
    	// 4 uso l istanza di weather 
    	// creata all inizio e la passo a House
    	
    	House h = new House(weather);
    	
    	h.lookThroughWindows();
    	
    	/*con IoC - l inversione del controllo e la 
    	la sua implementazione con la DI
    	adesso avro' lo stesso meteo se mi affaccio
    	da qualsiasi finestra*/
    	
    }
}

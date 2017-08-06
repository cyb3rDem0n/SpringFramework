package com.cyberdemon.ioc.dipendencyinjection;

public class Window {
	
	/* inizialmente siccome costruisco ogni oggetto windows con il proprio meteo 
	 avro' meteo diversi ad ogni finestra.
	 questo vuol dire che abbiamo TIGHT COUPLING, in questo caso della
	 classe Windows e della classe weather
	 */
	
	/*per prima cosa vogliamo un meteo comune per tutte le 
	 * finestre - 1 vai in App
	 */
	
	private Weather weather;
	
	// A) public Window(Weather w) {
	
	

	public Window(Weather weather) {
		this.weather = weather;
		
		// rimuovo il costruttore dell oggetto weather.
		//this.weather = new Weather();
		
		// A) this.weather = weather;
	}
	
	public void lookout() {
		System.out.println(this.weather.description);
	}
	
	/*ora abbiamo diversi possibili approcci per effettuare 
	l injection delle dipendenze
	*
	* A) Constructor Injection: metto come parametro di
	* ingresso nel costruttore l oggetto weather ed
	* eguaglio l attrib. al parametro
	* 
	* B) Setter Injection: mi creo il setter dell oggetto
	* weather.
	* 
	* C) @Autowired: potremo effettuare l inject dell istanza weather...
	*  
	*/

	// generalmente si usa il metedo A, essendop iu sicuro
	// visto che saremo sicuri che la dipendency esiste.
	// altrimento potremmo avere null pointer
	
	
	// usiamo in questo esempio il caso A
	// - 3 vado in House ora
	
	
	/*public void setWeather(Weather weather) {
		this.weather = weather;*/
	}

package ch.hwz.bfas;

public class Anlagevorschlag extends abstractPortfolio {

	//get List from AnlageuniversumDef
	AnlageuniversumDefin anlageuniversumDefin;
	
	// Kapital abrufen
	int getWertKapitalTest = 100; // - get Wert Kapital
	int modulo;

	public void selection() {
		// Sich f�r ein Paket enscheiden
		anlageuniversumDefin.getGewaehlteListe();
		
		//Summe des Preises der Aktien in diesem Array ausrechnen
		// TODO vielleicht String to Int
		
		// Ausrechnen wieviel mal ein GANZES Paket in unserem Kapital Platz hat // Modulo %
		// TODO modulo = getWertKapitalTest % anlageuniversumDefin.getGewaehlteListe(); // <- getWert int | anla stringlist
		
		// Die GANZE anzahl vorschlagen
		 System.out.println("Unser Vorschlag");
		 System.out.println(modulo + " Mal das Aktienpaket " + "|Listenname, Bsp: A");
		 System.out.println();
		 System.out.println("Total Kosten Aktien: " + "|Summe der Preise" );
		 System.out.println("Ihr zur verf�gung stehendes Kapital: " + getWertKapitalTest);
		 System.out.println("Restbetrag auf Ihrem Konto: " + getWertKapitalTest + "- |Summe der Preise");
	}
	
	public void annahme() {
		// TODO Siehe von oben
		
	}
	
	public void abgelehnt() {
		// TODO Neue Anlagestrategie w�hlen --> Neuer Buchstabe
		
		//Anschliessend erneut selektion
		selection();
		
	}
	
}

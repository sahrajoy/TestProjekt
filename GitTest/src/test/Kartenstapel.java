package test;

import java.util.Random;

public class Kartenstapel {
	 private Karte[] karten;
	 
	 public Kartenstapel() {
		 Random r = new Random();
		 karten = new Karte[r.nextInt(20) + 1];
		 Karte.Farbe[] alleFarben = Karte.Farbe.values();
		 Karte.Wert[] alleWerte = Karte.Wert.values();
		 for(int i = 0; i < karten.length; i++) {
			 karten[i] = new Karte(alleFarben[r.nextInt(alleFarben.length)], alleWerte[r.nextInt(alleWerte.length)]);
		 }
	 }
	 
	 public void drucken() {
		 int gesamtWert = 0;
		 for(Karte eineKarte : karten) {
			 System.out.println(eineKarte);
			 gesamtWert += eineKarte.kartenWert();
		 }
		 System.out.println("Gesamtwert: " + gesamtWert);
	 }
}

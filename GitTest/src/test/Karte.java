package test;

public class Karte {

	// Enum
	public enum Farbe{HERZ, KARO, PIK, KREUZ}
	public enum Wert{ZWEI, DREI, VIER, FUENF, SECHS, SIEBEN, ACHT, NEUN, ZEHN, BUB, DAME, KOENIG, ASS}
	// Enum ende
	
	private Farbe kartenfarbe;
	private Wert kartenwert;
	
	public Karte(Farbe kartenfarbe, Wert kartenwert) {
		super();
		this.kartenfarbe = kartenfarbe;
		this.kartenwert = kartenwert;
	}
	
	@Override
	public String toString() {
		return "Karte [kartenfarbe=" + kartenfarbe + ", kartenwert=" + kartenwert + "]";
	}
	
	public int kartenWert() {
		return kartenwert.ordinal() + 2;
	}
	
}

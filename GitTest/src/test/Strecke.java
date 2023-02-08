package test;

public class Strecke {
	
	
	//Enumerator
	public enum Length{
		M(1),
		FT(0.3048),
		KM(1000),
		MI(1609.34);
		
		private double unit;

		private Length(double unit) {
			this.unit = unit;
		}

		public double getUnit() {
			return unit;
		}
	}
	// Ende des Enumerator
	
	private double laenge;
	private Length laengenEinheit;
	
	public Strecke(double laenge, Length laengenEinheit) {
		super();
		this.laenge = laenge;
		this.laengenEinheit = laengenEinheit;
	}

	@Override
	public String toString() {
		return "Strecke [laenge=" + laenge + ", laengenEinheit=" + laengenEinheit + "]";
	}
	
	public double toMeter() {
		return laenge * laengenEinheit.getUnit();
	}
	
	
}

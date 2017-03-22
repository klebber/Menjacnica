package menjacnica;

import java.text.SimpleDateFormat;

public class Kurs {

	private double vrednostKursa;
	private SimpleDateFormat datum;
	
	public double getVrednostKursa() {
		return vrednostKursa;
	}
	public void setVrednostKursa(double vrednostKursa) {
		this.vrednostKursa = vrednostKursa;
	}
	public SimpleDateFormat getDatum() {
		return datum;
	}
	public void setDatum(SimpleDateFormat datum) {
		this.datum = datum;
	}
	
}

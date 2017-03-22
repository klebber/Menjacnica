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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vrednostKursa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(vrednostKursa) != Double.doubleToLongBits(other.vrednostKursa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [Vrednost kursa: " + vrednostKursa + ", datum: " + datum + "]";
	}
	
}

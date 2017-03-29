package menjacnica;

import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class Valuta {
	
	private String nazivValute;
	private String skracenica;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public void dodajKurs(Kurs kurs) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(kurs.getDatum())) {
				throw new RuntimeException("Kurs za dati datum vec postoji.");
			}
		}
		kursevi.add(kurs);
	}
	
	public void obrisiKurs(SimpleDateFormat datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)) {
				kursevi.remove(i);
			}
		}
	}
	
	public Kurs vratiKurs(SimpleDateFormat datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)) {
				return kursevi.get(i);
			}
		}
		return null;
	}
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute == null)
			throw new RuntimeException("Null naziv valute");
		this.nazivValute = nazivValute;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if(skracenica == null)
			throw new RuntimeException("Null skracenica");
		this.skracenica = skracenica;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi == null)
			throw new RuntimeException("Null lista kurseva");
		this.kursevi = kursevi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
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
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [Naziv valute: " + nazivValute + ", skracenica: " + skracenica + ", kursevi: " + kursevi + "]";
	}

}

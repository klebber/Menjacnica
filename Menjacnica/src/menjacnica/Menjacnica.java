package menjacnica;

import java.text.SimpleDateFormat;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursa(String nazivValute, double vrednostKursa, SimpleDateFormat datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNazivValute().equals(nazivValute)) {
				Kurs k = new Kurs();
				k.setVrednostKursa(vrednostKursa);
				k.setDatum(datum);
				valute.get(i).dodajKurs(k);
			}
		}
	}

	@Override
	public void brisanjeKursa(String nazivValute, SimpleDateFormat datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNazivValute().equals(nazivValute)) {
				valute.get(i).obrisiKurs(datum);
			}
		}
	}

	@Override
	public Kurs pretragaKursa(String nazivValute, SimpleDateFormat datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNazivValute().equals(nazivValute)) {
				return valute.get(i).vratiKurs(datum);
			}
		}
		return null;
	}

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}

}

package interfejs;

import java.text.SimpleDateFormat;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodavanjeKursa(String nazivValute, SimpleDateFormat datum);
	public void brisanjeKursa(String nazivValute, SimpleDateFormat datum);
	public Kurs pretragaKursa(String nazivValute, SimpleDateFormat datum);
	
}

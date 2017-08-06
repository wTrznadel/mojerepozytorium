package NaukaJavy.Projekt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Kot {

	String imie;
	Date dataUrodzenia;
	Float waga;
	String imieOpiekuna;
	
	public Kot () {
		System.out.println( "Podaj datę urodzenia kota w formacie dd.MM.yyyy" );
		String dataUrodzeniaKota = getUserInput();
		setDataUrodzenia(parseDate(dataUrodzeniaKota));
		System.out.println(getDataUrodzenia());
		
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static String getUserInput() {
	    return sc.nextLine();
	}
	private Date parseDate(String date) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
	    return formatter.parse(date);
	}

	
	public String przedstawSie()
	{
		return "Cześć, nazywam się "+imie+", urodziłem się "+dataUrodzenia+","
				+ " ważę "+waga+", a opiekuje się mną "+imieOpiekuna+".";
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	private void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public Float getWaga() {
		return waga;
	}

	public void setWaga(Float waga) {
		this.waga = waga;
	}

	public String getImieOpiekuna() {
		return imieOpiekuna;
	}

	public void setImieOpiekuna(String imieOpiekuna) {
		this.imieOpiekuna = imieOpiekuna;
	}
	
	
	
}


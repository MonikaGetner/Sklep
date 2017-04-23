package model;

import java.math.BigDecimal;

public abstract class Produkt {
	
	protected int id;            //identyfikator
	protected String nazwa;
	protected BigDecimal cena;
	
	private static int generator =1;    // zmienna globalna widoczna dla wszystkich obiektow klasy Produkt
	
	public Produkt(String nazwa, BigDecimal cena) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.id=generator;
		generator++;
				
	}


	public String getNazwa() {
		return nazwa;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public BigDecimal getCena() {
		return cena;
	}


	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	
	public abstract String dajRabat();             //nie ma sensu tutaj implementowaæ !! dopiero w klasch bazowych
		
	
	public static void wyswietlIloscObiektow(){      //metoda statyczna
		System.out.println(generator);
		//  System.out.println(nazwa);   //nie mozna odnosic sie do skladowych niestatycznych w metodzie statycznej !!
	}

}

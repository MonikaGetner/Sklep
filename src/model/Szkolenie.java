package model;

import java.math.BigDecimal;

public class Szkolenie extends Produkt {
	
	private String technologia;
	

	public Szkolenie(String nazwa, String technologia, BigDecimal cena) {
	    super(nazwa,cena);          // wwywolanie kontruktora klasy bazowej !!!
		this.technologia = technologia;
	}


	public String getTechnologia() {
		return technologia;
	}


	public void setTechnologia(String technologia) {
		this.technologia = technologia;
	}

	public void zaktualizuj(BigDecimal cena, String nazwa, String technologia) {
		 this.nazwa=nazwa;
		 this.cena=cena;
		 this.technologia=technologia;
		}
	
	public String toString() {
		return nazwa + " " + cena + " pln, technologia : " + technologia ;
	}

	public String dajRabat() {
		return "-10%" ;
	}
	

}

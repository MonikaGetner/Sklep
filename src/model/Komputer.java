package model;

import java.math.BigDecimal;

public class Komputer extends Produkt implements UrzadzenieElektroniczne {
		

	private String cpu;
	private String ram;
	
	
	public Komputer(String nazwa, BigDecimal cena, String cpu, String ram) {
		// this - obiekt na ktorym sie znajduje , uzywamy wtedy kiedy jest konflikt nazw !!
	    super(nazwa,cena);          // wwywolanie kontruktora klasy bazowej !!!
		this.cpu = cpu ;
		this.ram = ram;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}

	public String toString() {
		return nazwa + " " +cena + " pln, cpu: " + cpu + " ram: " + ram;
	}


	public void zaktualizuj(BigDecimal cena, String nazwa, String cpu, String ram) {
     this.cena=cena;
     this.nazwa=nazwa;
	 this.cpu=cpu;
	 this.ram=ram;	
	}
	
	public String dajRabat() {
		return "-15%" ;
	}


	@Override
	public void WyswietlCertyfikatCE() {
		System.out.println("Cetryfikat CE dla komputera" );
		
	}
	

	
}

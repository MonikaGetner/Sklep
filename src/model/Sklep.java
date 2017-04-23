package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
	
	private String www;
	
	//private List<Komputer> komputery;
	//private List<Szkolenie> szkolenia;
	private List<Produkt> produkty;
 
	public Sklep(String www) {    //sklep niezatowarowany
		this.www = www;
		this.produkty = new ArrayList<>();   // pusta lista , musimy stworzyæ liste 
		// mozna pominac this
	}
	
	//dodaj product
	public void dodajProdukt(Produkt produkt){
		//komputery.add(komp);
		produkty.add(produkt);
	}
	

	// usun product
	public void usunProdukt(int index){
		produkty.remove(index-1);
	}
	
	// zmodyfikuj produkt
	public void zmodyfikujProdukt(int index, Produkt produkt){
		// komp - bedzie zawieral komplet nowych danych, najprosciej update calego wiersza w bazie
		produkty.set(index-1, produkt);
		// inaczej: komputery.get(index).setCena(komp.getCena());
	}
	

	// wyswietl LISTE
	public void wyswietlListe(){
		// POLIMORFIZM !!  PRZYK£¥D   dla funkcji toString 
		for (int i=0; i< produkty.size();i++) {
			System.out.println((i+1) +" " + produkty.get(i));
			  // produkty.get(i).toString()
		}
	}
	
	public Produkt znajdzProdukt(int index){
		return produkty.get(index-1);
		
	}
	
	public int liczbaElementowListy(){
       return produkty.size();
	}

	public boolean czyPustaLista() {
		if (produkty.isEmpty())  return true;
		else return false;
	}

	public boolean SprawdzIndex(int index) {
		return index>0 && index <= produkty.size();    //zamiast if (index>0 && index <= komputery.size() return ..else
	}
	
	
	public void wyswietlRabaty(){
		for (Produkt produkt: produkty)
			System.out.println( produkt + " rabat: " + produkt.dajRabat());
			
	}
	
	public void wyswietlCertyfikaty(){
	
		for (Produkt produkt: produkty)
			 if (produkt instanceof UrzadzenieElektroniczne) { 
				 UrzadzenieElektroniczne ue= 
				(UrzadzenieElektroniczne) produkt; 
				 
				ue.WyswietlCertyfikatCE(); }
		
			 else { System.out.println(" to nie jest komputer"); }
	}

}

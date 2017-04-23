package ui;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Komputer;
import model.Produkt;
import model.Sklep;
import model.Szkolenie;

public class Menu {


	public void wyswietlMenu(){
		
	Sklep sklep = new Sklep("fdfdffdfdf");
		
	System.out.println(" MENU PROGRAMU");	
	System.out.println(" opcja 1 - Wyswietl towary");
	System.out.println(" opcja 2 - Dodaj komputer");
	System.out.println(" opcja 3 - Usun produkt");
	System.out.println(" opcja 4 - Zmodyfikuj towar");
	System.out.println(" opcja 5 - Dodaj szkolenie ");
	System.out.println(" opcja 8 - Wyswietl RABAT ");
	System.out.println(" opcja 9 - Wyswietl CERTYFIKAT ");	
	
	System.out.println(" q - Koniec programu");
		
	
	Scanner skaner = new Scanner(System.in);
	String wybor;
	
	do {
	System.out.print("Wybierz opcje :  ");
	wybor = skaner.nextLine();	

		// wyswietl menu . a potem switch wg wyboru opcji 
		switch (wybor){
		case "1" :   {   // wyswietl towary
			// wyswietl liste'
			sklep.wyswietlListe();
		}
			break;
		case "2" :   {   
			// dodaj komputer
			String nazwa;
			BigDecimal cena;
			String cpu;
			String ram;
			
			System.out.println(" WPROWADZENIE KOMPUTERA" );
			System.out.println("Podaj nazwe komp : ");
			nazwa = skaner.nextLine();
			System.out.println("Podaj cene : ");
			cena = skaner.nextBigDecimal();
			skaner.nextLine();
			System.out.println("Podaj cpu : ");
			cpu= skaner.nextLine();
			System.out.println("Podaj ram : ");
			ram= skaner.nextLine();
			
			Komputer komp=new Komputer(nazwa,cena,cpu,ram);
			sklep.dodajProdukt(komp);
		}
			break;			
		case "3" :	{    //usun towar
			if (sklep.czyPustaLista()) { System.out.println("Lista jest pusta");}
			else {
			sklep.wyswietlListe();
			System.out.println("Podaj indes do usuniecia : ");
			int index=skaner.nextInt();
			skaner.nextLine();
			if (sklep.SprawdzIndex(index)) {
			sklep.usunProdukt(index);
			System.out.println("Komputer zostal usuniety");	} 
			else { System.out.println(" Podales zly index" );}
			}
		}
			break;		  	
		case "4" :    { //zmien towar
			if (sklep.liczbaElementowListy()!=0) {
			sklep.wyswietlListe();
			System.out.println("Podaj indes do edycji : ");
			int index=skaner.nextInt();
			skaner.nextLine();
			 Produkt produkt =sklep.znajdzProdukt(index);
			 if (produkt instanceof Komputer)    {    ///if instanceof
			
			// operacja RZUTOWANIA obiekt produkt na obiekt komputer
			Komputer komputer= (Komputer)sklep.znajdzProdukt(index);
			
			System.out.println("Podaj nowa cene (aktualna cena = "+ komputer.getCena());
			BigDecimal cena= skaner.nextBigDecimal();
			skaner.nextLine();
			
			System.out.println("Podaj now¹ NAZWE (aktualna NAZWA  = "+ komputer.getNazwa());
			String nazwa= skaner.nextLine();
			
			System.out.println("Podaj nowe CPU (aktualne CPU = "+ komputer.getCpu());
			String cpu= skaner.nextLine();
			
			System.out.println("Podaj nowy RAM (aktualne RAM = "+ komputer.getRam() );
			String ram= skaner.nextLine();
			

			komputer.zaktualizuj(cena,nazwa,cpu,ram);
		
			System.out.println(" Komputer zostal zmodyfikowany" + komputer);	
			} //if lista pusta 
			else
			 {  System.out.println("Lista jest pusta"); }
		    } ///if instanceof
			    else { System.out.println("To nie jest komputer");}
			
		}			
			break;	
			
		case "5" :    {  //dodaj szkolenia	
		
			String nazwa;
			BigDecimal cena;
			String technologia;
						
			System.out.println(" WPROWADZENIE SZKOLENIA" );
			System.out.println("Podaj nazwe szkolenia : ");
			nazwa = skaner.nextLine();
			System.out.println("Podaj cene : ");
			cena = skaner.nextBigDecimal();
			skaner.nextLine();
			System.out.println("Wskaz technologie : ");
			technologia= skaner.nextLine();
		
			Szkolenie szkolenie=new Szkolenie(nazwa,technologia,cena);
			sklep.dodajProdukt(szkolenie);		
		}
		break;
			
		case "8" :   {   // wyswietl RABAT
		    sklep.wyswietlRabaty();
		}
		
		case "9" :   {   // wyswietl certyfikat
			// wyswietl liste'
			sklep.wyswietlCertyfikaty();
		}
		
		
		
		
		case "q" :
		case "Q" :			
			System.out.println(" Koniec programu");			
			break;
		default : 
			System.out.println(" Blad programu");
			break;
		}
	} while(!wybor.equalsIgnoreCase("q"));	
	
	
	}	
}

package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterface {

	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public  LinkedList<Knjiga> vratoSveKnjige();
	
	public  LinkedList<Knjiga> pronadjiKnjige(Autor autor, String isbn, String naslov, String izdavac);
}

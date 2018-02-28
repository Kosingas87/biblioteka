package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga==null)
			throw new RuntimeException();
		else
			
		// TODO Auto-generated method stub
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		if(knjiga==null)
			throw new RuntimeException();
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratoSveKnjige() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjige(Autor autor, String isbn, String naslov, String izdavac) {
		// TODO Auto-generated method stub
		return null;
	}

}

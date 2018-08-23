package biblioteka;

import java.io.File;
import java.io.PrintWriter;

public class Racun {

	private String imeKorisnika;
	private int idBroj = (int) (1 + Math.random() * 10000);
	private int brojPodignutihKnjiga;

	public Racun() {
	}

	public int getIdBroj() {
		return idBroj;
	}

	public String getImeKorisnika() {
		return imeKorisnika;
	}

	public int getBrojPodignutihKnjiga() {
		return brojPodignutihKnjiga;
	}

	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public void ispisiInformacije() {
		System.out.println("Ime korisnika: " + getImeKorisnika());
		System.out.println("ID: " + getIdBroj());
		System.out.println("Broj podignutih knjiga: " + getBrojPodignutihKnjiga());
	}

	public void podigniKnjigu() {
		if (this.brojPodignutihKnjiga >= 3)
			System.out.println("Ne mozete podici knjigu, najvise mozete imati posudjene 3 knjige.");

		else
			this.brojPodignutihKnjiga++;
	}

	public void vratiKnjigu() {
		this.brojPodignutihKnjiga--;
	}

	public  void ispis() throws Exception {
		File racun = new File("");
		PrintWriter output = new PrintWriter(racun);
		output.println("Ime korisnika: " + getImeKorisnika());
		output.println("ID: " + getIdBroj());
		output.println("Broj podignutih knjiga: " + getBrojPodignutihKnjiga());
		output.close();
	}

}

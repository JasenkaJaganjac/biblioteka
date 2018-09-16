
package biblioteka;

import java.util.Scanner;

public class BibliotekaTest {

	// {}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Racun account;
		Knjige book;
		int idKorisnika = 0;
		int idKnjige = 0;
		int izbor = 0;

		System.out.println("Dobrodosli u biblioteku.");
		System.out.println("Izaberite: ");
		System.out.println(
				"1 - Registracija korisnika, " + "\n2 - Registracija knjige, " + "\n3 - Informacije o korisniku, "
						+ "\n4 - Informacije o knjizi, " + "\n5 - Podigni knjigu, " + "\n6 - Vrati knjigu");

		izbor = input.nextInt();
		do {
			switch (izbor) {
			case 0:
				break;
			case 1:
				System.out.print("Upisite vase ime: ");
				String ime = input.nextLine();
				account = new Racun();
				account.setImeKorisnika(ime);
				System.out.println("Vas ID je: " + account.getIdBroj());
				break;
			case 2:
				System.out.print("Unesit ime knjige: ");
				String naslovKnjige = input.nextLine();
				book = new Knjige();
				book.setNaslov(naslovKnjige);
				System.out.print("Unesit ime autora: ");
				String imeAutora = input.nextLine();
				book.setImeAutora(imeAutora);
				break;
			case 3:
				System.out.println("Upiste ID korisnika cije informacije zelite vidjeti: ");
				idKorisnika = input.nextInt();
				// Racun.ispisiInformacije(idKorisnika);
				break;
			case 4:
				System.out.println("Upiste ID knjige cije informacije zelite vidjeti: ");
				idKnjige = input.nextInt();
				// Racun.ispisiInformacije(idKnjige);
				break;
			case 5:
				System.out.println("Upiste ID korisnika koji podize knjigu: ");
				idKorisnika = input.nextInt();

			}
		} while (izbor != 0);

	}

}

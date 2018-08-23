package biblioteka;

public class Knjige {

	private String naslov;
	private String imeAutora;
	private int idBrojKnjige = 0;
	private boolean status = true;

	public Knjige() {
		idBrojKnjige++;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getImeAutora() {
		return imeAutora;
	}

	public void setImeAutora(String imeAutora) {
		this.imeAutora = imeAutora;
	}

	public int getIdBrojKnjige() {
		return idBrojKnjige;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void ispisiInformacije() {
		System.out.println("Naslov knjige: " + getNaslov());
		System.out.println("Autor knjige: " + getImeAutora());
		System.out.println("ID: " + getIdBrojKnjige());
		System.out.println(getStatus() ? "Knjiga se može podici." : "Knjiga je na citanju.");
	}

	public void promijeniStatusKnjige() {
		if (this.status)
			setStatus(false);
		else
			setStatus(true);
	}

}

package src.seminar02.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata=10;
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat() {
		super();
	}
	
	public void afisareVenit() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Angajat.sumaFinantata+" Euro/zi in proiect.");
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}
}

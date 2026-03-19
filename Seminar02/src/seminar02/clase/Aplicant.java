package src.seminar02.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	protected static int pragPunctaj;

	public static int getPragPunctaj() {
		return pragPunctaj;
	}

	public static void setPragPunctaj(int pragPunctaj) {
		Aplicant.pragPunctaj = pragPunctaj;
	}



	public void afisareStatut(){
		StringBuilder sb=new StringBuilder();
	    sb.append("Aplicantul ");
		sb.append(this.nume).append(" ").append(this.prenume);
		sb.append(this.punctaj>Aplicant.pragPunctaj?"":"\n nu");
		sb.append(" a fost acceptat");
		System.out.println(sb.toString());
	}


	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	


	public void setNr_proiecte(int nr_proiecte,String[] denumireProiect) {
		this.denumireProiect=denumireProiect;
		this.nr_proiecte = nr_proiecte;
	}

	public void afisareVenit(){

	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nr_proiecte);
		sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
		return sb.toString();
	}
}

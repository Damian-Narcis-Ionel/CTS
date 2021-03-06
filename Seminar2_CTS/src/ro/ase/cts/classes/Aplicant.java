package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiect;
	
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
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = denumireProiect;
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

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public abstract float getSumaFinantata();

	public void afiseazaStatus(Proiect proiect) {
		System.out.print("Aplicantul " + nume + " " + prenume);
		if (punctaj > proiect.getPragAcceptare()) {
			System.out.println("a fost acceptat.");
		}
			
		else {
			System.out.println("nu a fost acceptat.");
		}
			
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;

	}
	
	

	

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nr_proiecte, String[] vect) {
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = vect;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumiriProiect=");
		builder.append(Arrays.toString(denumiriProiect));
		builder.append("]");
		return builder.toString();
	}
	
	

}

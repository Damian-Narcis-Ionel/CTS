package ro.ase.cts.classes;

public class Pacient {
	private boolean esteInStareGrava;
	private String nume;
	
	public Pacient(boolean esteInStareGrava, String nume) {
		super();
		this.esteInStareGrava = esteInStareGrava;
		this.nume = nume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient [esteInStareGrava=");
		builder.append(esteInStareGrava);
		builder.append(", nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}

	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}

	public String getNume() {
		return nume;
	}
	
	
}

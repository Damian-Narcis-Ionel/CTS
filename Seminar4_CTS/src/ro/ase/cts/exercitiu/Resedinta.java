package ro.ase.cts.exercitiu;

public class Resedinta {
	private int suprafata;
	private String proprietar;
	private String codPostal;
	
	private static Resedinta instance;
	
	synchronized public static Resedinta getInstance(int suprafata,String proprietar,String codPostal) {
		if(instance == null) {
			instance = new Resedinta(suprafata,proprietar,codPostal);
		}
		
		return instance;
	}
	
	private Resedinta(int suprafata, String proprietar, String codPostal) {
		super();
		this.suprafata = suprafata;
		this.proprietar = proprietar;
		this.codPostal = codPostal;
	}
	
	public int getSuprafata() {
		return suprafata;
	}
	public void setSuprafata(int suprafata) {
		this.suprafata = suprafata;
	}
	public String getProprietar() {
		return proprietar;
	}
	public void setProprietar(String proprietar) {
		this.proprietar = proprietar;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resedinta [suprafata=");
		builder.append(suprafata);
		builder.append(", proprietar=");
		builder.append(proprietar);
		builder.append(", codPostal=");
		builder.append(codPostal);
		builder.append(", getSuprafata()=");
		builder.append(getSuprafata());
		builder.append(", getProprietar()=");
		builder.append(getProprietar());
		builder.append(", getCodPostal()=");
		builder.append(getCodPostal());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}

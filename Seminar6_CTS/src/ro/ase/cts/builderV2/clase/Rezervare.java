package ro.ase.cts.builderV2.clase;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	

	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare,
			boolean muzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturaRacoritoare=");
		builder.append(bauturaRacoritoare);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	
}

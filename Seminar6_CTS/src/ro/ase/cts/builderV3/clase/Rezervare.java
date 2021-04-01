package ro.ase.cts.builderV3.clase;

import ro.ase.cts.builderV2.clase.BuilderV2;


public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public static class BuilderV3 implements IBuilder{

		private boolean mancareInclusa;
		private boolean scaunErgonomic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;
		
		public BuilderV3() {
			this.mancareInclusa = false;
			this.scaunErgonomic = false;
			this.bauturaRacoritoare = false;
			this.muzicaAmbientala = false;
			this.genMuzica = "gen";
			this.codRezervare = 0;
		}

		public BuilderV3(int codRezervare) {
			
			this.mancareInclusa = false;
			this.scaunErgonomic = false;
			this.bauturaRacoritoare = false;
			this.muzicaAmbientala = false;
			this.genMuzica = "gen";
			this.codRezervare = codRezervare;
		}
		
		public BuilderV3 setMancareInclusa(boolean mancareInclusa) {
			this.mancareInclusa = mancareInclusa;
			return this;
		}

		public BuilderV3 setScaunErgonomic(boolean scaunErgonomic) {
			this.scaunErgonomic = scaunErgonomic;
			return this;
		}

		public BuilderV3 setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.bauturaRacoritoare = bauturaRacoritoare;
			return this;
		}

		public BuilderV3 setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.muzicaAmbientala = muzicaAmbientala;
			return this;
		}

		public BuilderV3 setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}

		public BuilderV3 setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}
		
		@Override
		public Rezervare build() {
			return new Rezervare(this);
		}
		
	}
	

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
	public Rezervare(BuilderV3 builderV3) {
		// TODO Auto-generated constructor stub
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

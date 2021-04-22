package ro.ase.cts.state.classes;

public class Masa {
	private int nrMasa;
	private StareMasa stareMasa;
	
	public Masa(int nrMasa) {
		super();
		this.stareMasa= new StareLibera();
		this.nrMasa = nrMasa;
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}
	
	public void rezervaMasa() {
		modificaStareMasa(new StareRezervata());
	}
	
	public void elibereazaMasa() {
		modificaStareMasa(new StareLibera());
	}
	
	public void ocupaMasa() {
		modificaStareMasa(new StareOcupata());
	}
	
	private void modificaStareMasa(StareMasa stare) {
		stare.modificaStare(this);
	}
}


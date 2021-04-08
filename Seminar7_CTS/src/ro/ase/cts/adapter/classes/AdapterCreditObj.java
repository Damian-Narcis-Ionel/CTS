package ro.ase.cts.adapter.classes;

public class AdapterCreditObj implements InterfataCredit{
	private Leasing leasing;
	
	public AdapterCreditObj(Leasing leasing) {
		super();
		this.leasing=leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		// TODO Auto-generated method stub
		this.leasing.oferaLeasing(numeClient, suma);
	}
	
	
	
}

package ro.ase.cts.proxy.classes;

public class ProxyRezervare implements IRezervare {

	private Rezervare rezervare;

	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}

	@Override
	public void anuntaRezervare() {
		// TODO Auto-generated method stub
		if(rezervare.getNrPersoane() >=4) {
			rezervare.anuntaRezervare();
		}else {
			System.out.println("Persoanele trebuie sa se prezinte fizic la restaurant");
		}
	}
	
	
	
}

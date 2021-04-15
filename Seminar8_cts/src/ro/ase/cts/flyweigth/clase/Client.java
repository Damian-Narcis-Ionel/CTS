package ro.ase.cts.flyweigth.clase;

public class Client implements FlyweightAbstract{
	private String nume;
	private String nrTelefon;
	private String email;
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}
	@Override
	public void afisareInformatii(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + rezervare.toString() );
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	
}

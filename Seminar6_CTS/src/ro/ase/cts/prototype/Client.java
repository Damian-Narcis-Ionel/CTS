package ro.ase.cts.prototype;

public class Client implements AbstractPrototype{
	private int codClient;
	private String nume;
	private int varsta;
	
	
	public Client(int codClient, String nume, int varsta) {
		super();
		//Validare input
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client() {
		//meow
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [codClient=");
		builder.append(codClient);
		builder.append(", nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public AbstractPrototype copiaza() {
		Client client = new Client();
		client.codClient=this.codClient;
		client.nume=this.nume;
		client.varsta=this.varsta;
		
		return client;
	}
	
	
}

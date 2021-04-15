package ro.ase.cts.flyweigth.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String,FlyweightAbstract> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String,FlyweightAbstract>();
		
	}
	
	public FlyweightAbstract getClient(String email) {
		FlyweightAbstract client = clienti.get(email);
		
		if(client == null) {
			client = new Client("Oana","074218412",email);
			clienti.put(email, client);
		}
		
		return client;
	}
	
	
}

package ro.ase.cts.observer.classes;

public class ClientAbonat implements Observer{
	String numeClient;
	
	
	
	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}



	@Override
	public void receptionareMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+numeClient+" a receptionat mesajul");
	}

}

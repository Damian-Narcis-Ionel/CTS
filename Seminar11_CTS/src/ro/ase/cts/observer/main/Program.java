package ro.ase.cts.observer.main;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientAbonat clientPopescu = new ClientAbonat("Popescu");
		ClientAbonat clientVasile = new ClientAbonat("Vasile");
		ClientAbonat clientIonescu = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClinet(clientIonescu);
		sala.aboneazaClinet(clientVasile);
		sala.aboneazaClinet(clientPopescu);
		
		sala.anuntaMeci();
		sala.dezaboneazaClient(clientIonescu);
		sala.anuntaMeciVolei();
	}

}

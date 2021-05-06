package ro.ase.cts.main;

import ro.ase.cts.classes.Constituie;
import ro.ase.cts.classes.ContBancar;
import ro.ase.cts.classes.Depunere;
import ro.ase.cts.classes.ManagerComenzi;
import ro.ase.cts.classes.Retragere;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituie(new ContBancar("Dem"),800));
		manager.invoca(new Retragere(new ContBancar("Oana"),200));
		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Alisa"),300));
		manager.executaComanda();
		
	}

}

package ro.ase.cts.mainCommand;

import ro.ase.cts.classesCommand.Constituie;
import ro.ase.cts.classesCommand.ContBancar;
import ro.ase.cts.classesCommand.Depunere;
import ro.ase.cts.classesCommand.ManagerComenzi;
import ro.ase.cts.classesCommand.Retragere;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituie(new ContBancar("Dem"),800));
		manager.invoca(new Retragere(new ContBancar("Oana"),200));
		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Alisa"),300));
		manager.executaComanda();
		manager.executaComanda();
		
	}

}

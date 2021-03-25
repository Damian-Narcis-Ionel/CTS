package ro.ase.cts.factorymethod;

import ro.ase.cts.simplefactory.Categorie;
import ro.ase.cts.simplefactory.Raceala;

public class FactoryRaceala implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		return new Raceala(pretDeBaza);
	}

}

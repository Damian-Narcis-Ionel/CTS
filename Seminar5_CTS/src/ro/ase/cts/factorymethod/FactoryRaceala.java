package ro.ase.cts.factorymethod;


public class FactoryRaceala implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		return new Raceala(pretDeBaza);
	}

}

package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.*;

public class FactoryDurere implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		return new Durere(pretDeBaza);
	}

}

package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.*;

public class FactoryDurere implements FactoryCategorie {

	@Override
	public ro.ase.cts.factorymethod.Categorie createCategorie(float pretDeBaza) {
		return new Durere(pretDeBaza);
	}

}

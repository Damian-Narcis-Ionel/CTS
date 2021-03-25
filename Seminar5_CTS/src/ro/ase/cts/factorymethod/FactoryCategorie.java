package ro.ase.cts.factorymethod;

import ro.ase.cts.simplefactory.Categorie;

public abstract interface FactoryCategorie {
	
	Categorie createCategorie(float pretDeBaza);
}

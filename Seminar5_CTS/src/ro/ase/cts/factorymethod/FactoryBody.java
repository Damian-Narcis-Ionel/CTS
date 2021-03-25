package ro.ase.cts.factorymethod;

import ro.ase.cts.simplefactory.Body;
import ro.ase.cts.simplefactory.Categorie;

public class FactoryBody implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Body(pretDeBaza);
	}

}

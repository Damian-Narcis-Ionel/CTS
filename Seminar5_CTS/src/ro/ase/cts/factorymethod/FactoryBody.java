package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.*;

public class FactoryBody implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Body(pretDeBaza);
	}

}

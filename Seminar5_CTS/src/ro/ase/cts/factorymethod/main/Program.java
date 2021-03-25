package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.*;

public class Program {

	public static FactoryCategorie getTipFactory() {
		return new FactoryBody();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie = factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 10);
	}
}

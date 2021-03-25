package ro.ase.cts.main;

import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.CategorieFactory;
import ro.ase.cts.clase.CategoriiMedicamente;
import ro.ase.cts.clase.Durere;

public class Program {

	public static CategoriiMedicamente getTipCategorie() {
		
		return CategoriiMedicamente.body;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CategorieFactory factory = new CategorieFactory();
			Categorie durere = factory.creareCategorie(CategoriiMedicamente.durere, 5);
			Categorie body = factory.creareCategorie(CategoriiMedicamente.body,10);
			Categorie categorie = factory.creareCategorie(getTipCategorie(), 15);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

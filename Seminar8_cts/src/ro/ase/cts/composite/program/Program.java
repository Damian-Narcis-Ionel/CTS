package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.IOptiuniMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOptiuniMeniu optiune1 = new Sectiune("bauturi");
		IOptiuniMeniu optiune2 = new Sectiune("desert");
		IOptiuniMeniu meniu = new Sectiune("Meniu restaurant");
		
		IOptiuniMeniu item1 = new Item("apa minerala");
		IOptiuniMeniu item2 = new Item("apa plata");
		IOptiuniMeniu item3 = new Item("papanasi");
		
		try {
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			optiune2.adaugaNod(item3);
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			meniu.descriere();
			
			optiune1.stergeNod(item1);
			optiune2.adaugaNod(item1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

package ro.ase.cts.builderV1.main;

import ro.ase.cts.builderV1.clase.Builder;
import ro.ase.cts.builderV1.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Builder().setCodRezervare(2).setBauturaRacoritoare(true).build();
		System.out.println(rezervare1);
		Rezervare rezervare2 = new Builder().setCodRezervare(3).setMancareInclusa(true).setScaunErgonomic(true).build();
		
		
		System.out.println(rezervare2);

	}

}

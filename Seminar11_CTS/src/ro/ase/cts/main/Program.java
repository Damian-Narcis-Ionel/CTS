package ro.ase.cts.main;

import ro.ase.cts.classes.FacadeInternare;
import ro.ase.cts.classes.Pacient;

public class Program {
	public static void main(String[] args) {
		Pacient p1 = new Pacient(true,"Dani");
		Pacient p2 = new Pacient(false,"Catalin");
		
		System.out.println(FacadeInternare.verificaPacient(p1));
		System.out.println(FacadeInternare.verificaPacient(p2));
	}
}

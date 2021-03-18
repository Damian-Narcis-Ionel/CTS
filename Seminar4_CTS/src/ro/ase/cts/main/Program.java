package ro.ase.cts.main;
import ro.ase.cts.clase.*;
import ro.ase.cts.exercitiu.*;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy clinicaLazy1 = ClinicaVeterinaraLazy.getInstance("Clinica Zurli", "Str. Berceni", 30, 560.04f);
		ClinicaVeterinaraLazy clinicaLazy2 = ClinicaVeterinaraLazy.getInstance("NU se mai schimba", "Str. neschimbata", 60, 421.43f);

		clinicaLazy1.setNume("Clinica modificata");
		clinicaLazy2.setNrMedici(70);
		
		System.out.println(clinicaLazy1.toString());
		System.out.println(clinicaLazy2.toString());
		
		//Thread Safe
		Resedinta resedinta1 = Resedinta.getInstance(100,"Damian Narcis","052345");
		resedinta1.setSuprafata(9000);
		resedinta1.setProprietar("Dumitru Stefan");
		Resedinta resedinta2 = Resedinta.getInstance(101,"Popescu Dorel","051111");
		
		
		System.out.println(resedinta1.toString());
		System.out.println(resedinta2.toString());
	}

}
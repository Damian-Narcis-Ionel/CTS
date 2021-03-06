package ro.ase.cts.main;


import ro.ase.cts.classes.*;
import ro.ase.cts.readers.*;
import ro.ase.cts.utils.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		
		return reader.citesteAplicanti();
	}

	public static void main(String[] args) {
		
		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		Proiect proiect = new Proiect(80);
		
		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(proiect);
				System.out.println(angajat.getSumaFinantata());
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

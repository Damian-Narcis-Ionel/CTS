package ro.ase.cts.classes;

public class FacadeInternare {
	
	
	public static String verificaPacient(Pacient pacient) {
		Medic medic = new Medic("Ion","Chirurg");
		
		StringBuilder sb = new StringBuilder();
		if(pacient.isEsteInStareGrava()) {
			sb.append("Pacintul" + pacient.getNume()+" este in stare grava, trimite catre medic! ");
			
		}else {
			sb.append("Pacientul nu necesita internare");
		}
		
		if(medic.esteNecesaraInternarea(pacient)) {
			sb.append("Medicul a decis ca este necesara internarea pacientului.");
			Salon salon = new Salon(20);
			if(salon.arePaturiLibere()) {
				sb.append("Pacient "+ pacient.getNume() + " poate fi internat in salonul nostru");
			}else {
				sb.append(pacient.getNume()+" nu are locuri disponibile, va fi trimis la alt spital");
			}
			
			
		}
		return sb.toString();
	}
}

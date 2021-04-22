package ro.ase.cts.strategy.classes;

public class Cash implements ModPlata{

	@Override
	public void plateste(float sumaPlatita) {
		System.out.println("S-a platit cash suma de: "+sumaPlatita);
		
	}
	
}

package ro.ase.cts.strategy.classes;

public class Card implements ModPlata{

	private double sold;
	
	
	
	public Card(double sold) {
		super();
		this.sold = sold;
	}



	@Override
	public void plateste(float sumaPlatita) {
		if(sold >= sumaPlatita) {
			System.out.println("Se plateste cu cardul suma de: "+sumaPlatita);
			sold -= sumaPlatita;
		}else {
			System.out.println("Fonduri insuficiente");
		}
		
	}

}

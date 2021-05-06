package ro.ase.cts.classes;

public class Constituie extends Command {

	public Constituie(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().constituire(super.getSuma());
	}

}

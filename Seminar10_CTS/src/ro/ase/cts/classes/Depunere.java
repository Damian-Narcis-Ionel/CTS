package ro.ase.cts.classes;

public class Depunere extends Command{

	public Depunere(ContBancar cont, float suma) {
		super(cont,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().depunere(super.getSuma());
	}

}

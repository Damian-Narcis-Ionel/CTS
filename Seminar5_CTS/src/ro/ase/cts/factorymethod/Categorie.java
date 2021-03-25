package ro.ase.cts.factorymethod;

public abstract class Categorie {
	float pretDeBaza;

	public Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categorie [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

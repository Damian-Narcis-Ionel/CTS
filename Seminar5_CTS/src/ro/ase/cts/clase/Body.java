package ro.ase.cts.clase;

public class Body extends Categorie{

	public Body(float pretDeBaza) {
		super(pretDeBaza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Body [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}
	
	

}

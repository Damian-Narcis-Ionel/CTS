package ro.ase.cts.classes;

public class ContBancar {
	
	private String detinator;
	private float suma;
	
	
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContBancar [detinator=");
		builder.append(detinator);
		builder.append(", suma=");
		builder.append(suma);
		builder.append("]");
		return builder.toString();
	}
	
	public void constituire(float suma) {
		System.out.println("Contul lui "+detinator+" a fost constituit");
		this.suma=suma;
	}
	
	public void retragere(float suma) {
		
		if(this.suma >= suma) {
			this.suma -= this.suma-suma;
			System.out.println("O retragere de "+suma+" a fost efectuata");
		}else {
			System.out.println("Nu dispuneti de fonduri suficiente");
		}
	}
	
	public void depunere(float suma) {
		System.out.println("A fost depusa o suma de "+suma);
		this.suma+=suma;
	}
}
